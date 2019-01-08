package sqlService;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import metier.Produit;

public class SqlManager {

	java.sql.Connection cn;

	public SqlManager() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		this.cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionproduit", "root", "");
	}

	public int insererProduit(String nomProduit, String description, int etat, int prix) throws SQLException {
		PreparedStatement pr = cn.prepareStatement("INSERT INTO produit VALUES (NULL,?,?,?,?)");
		pr.setString(1, nomProduit);
		pr.setString(2, description);
		pr.setInt(3, etat);
		pr.setInt(4, prix);
		pr.execute();
		return returnIdByName(nomProduit);
	}

	public int returnIdByName(String nom) throws SQLException {
		PreparedStatement pr = cn.prepareStatement("SELECT ID FROM Produit where nomProduit=\"" + nom + "\"");
		ResultSet monResultSet = pr.executeQuery();
		while (monResultSet.next())
			return Integer.parseInt(monResultSet.getString(1));
		return -1;
	}

	public ArrayList<Produit> charger() throws SQLException, ClassNotFoundException {
		ArrayList<Produit> list = new ArrayList<Produit>();
		PreparedStatement pr = cn.prepareStatement("SELECT * FROM Produit");
		ResultSet monResultSet = pr.executeQuery();
		while (monResultSet.next()) {
			list.add(new Produit(monResultSet.getInt(1), monResultSet.getString(2), monResultSet.getString(3),
					monResultSet.getInt(4), monResultSet.getInt(5)));

			// System.out.println(monResultSet.getString(2));
		}
		// System.out.println(list.get(0).getNomProduit());

		return list;

	}

	public boolean suprimerProduit(String nom) throws SQLException {
		PreparedStatement pr = cn.prepareStatement("Delete from Produit where nomProduit = \"" + nom + "\"");
		return pr.execute();

	}

	public void modifierNomById(int idId, String newNom) throws Exception {
		PreparedStatement pr = cn
				.prepareStatement("Update Produit set nomProduit = \"" + newNom + "\"where ID=" + idId);
		boolean lourd = pr.execute();
		if (lourd) {
			throw new Exception("produit non trouvé");
		}
	}

	public void modifierDescriptionById(int idId, String newDesc) throws Exception {
		PreparedStatement pr = cn
				.prepareStatement("Update Produit set Description = \"" + newDesc + "\"where ID=" + idId);
		boolean lourd = pr.execute();
		if (lourd) {
			throw new Exception("produit non trouvé");
		}

	}

	public void modifierEtatById(int idId, int etat) throws Exception {
		String lll = "Update Produit set Etat = " + etat + " where ID= " + idId;
		System.out.println(lll);
		PreparedStatement pr = cn.prepareStatement(lll);
		boolean lourd = pr.execute();
		if (lourd) {
			throw new Exception("produit non trouvé");
		}
	}

	public void modifierPrixById(int idId, int prix) throws Exception {
		PreparedStatement pr = cn.prepareStatement("Update Produit set Prix = " + prix + " where ID=" + idId);
		boolean lourd = pr.execute();
		if (lourd) {
			throw new Exception("produit non trouvé");
		}
	}

}

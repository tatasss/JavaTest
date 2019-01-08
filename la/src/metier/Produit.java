package metier;

import java.sql.SQLException;

import sqlService.SqlManager;

public class Produit {
	private int id;
	private String nomProduit;
	private String description;
	private int etat;
	private int prix;
	private SqlManager sm;

	public Produit(int id, String nomProduit, String description, int etat, int prix)
			throws ClassNotFoundException, SQLException {
		sm = new SqlManager();
		this.nomProduit = nomProduit;
		this.description = description;
		this.etat = etat;
		this.prix = prix;
		this.id = id;

	}

	public Produit(String nomProduit, String description, int etat, int prix)
			throws ClassNotFoundException, SQLException {
		sm = new SqlManager();
		this.nomProduit = nomProduit;
		this.description = description;
		this.etat = etat;
		this.prix = prix;
		this.id = sm.insererProduit(nomProduit, description, etat, prix);
	}

	public int getId() {
		return id;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) throws Exception {
		this.sm.modifierNomById(id, nomProduit);
		this.nomProduit = nomProduit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) throws Exception {
		this.sm.modifierDescriptionById(id, description);
		this.description = description;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) throws Exception {
		this.sm.modifierEtatById(id, etat);
		this.etat = etat;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) throws Exception {
		this.sm.modifierPrixById(id, prix);
		this.prix = prix;
	}

}

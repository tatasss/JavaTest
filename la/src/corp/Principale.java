package corp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import metier.Produit;
import sqlService.SqlManager;

public class Principale {
	public static Scanner sc = new Scanner(System.in);
	public static Scanner line = new Scanner(System.in).useDelimiter("\n");
	public static ArrayList<Produit> listP = new ArrayList<Produit>();

	public static void afficherMenu() {
		System.out.println("choisisser :");
		System.out.println("1 : inserer produit");
		System.out.println("2 : supprimer produit");
		System.out.println("3 : modifier nom produit");
		System.out.println("4 : modifier description produit");
		System.out.println("5 : modifier etat produit");
		System.out.println("6 : modifier prix produit");
		System.out.println("7 : afficher detail produit");
		System.out.println("8 : afficher tous produit");
		System.out.println("9 : quitter");
	}

	public static void insererProduit() throws ClassNotFoundException, SQLException {
		int etatP, prixP;
		String nomP, descP;
		System.out.println("Donner le nom du produit :");
		nomP = sc.next();
		System.out.println("Donner la description du produit :");
		descP = line.next();
		System.out.println("Donner l'etat du produit :");
		etatP = Integer.parseInt(sc.next());
		System.out.println("Donner le prix du produit :");
		prixP = Integer.parseInt(sc.next());
		listP.add(new Produit(nomP, descP, etatP, prixP));
	}

	public static void supprimerProduit() {
		System.out.println("Donner le nom du produit");
		String nomPr = sc.next();
		listP.forEach((p) -> {

			if (p.getNomProduit().equals(nomPr)) {
				listP.remove(p);
				try {
					new SqlManager().suprimerProduit(nomPr);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("rien a supprimer");
			}
		});
	}

	public static void afficherProduits() {
		listP.forEach((p) -> {
			// System.out.println("=============produit============");
			System.out.println(p.getNomProduit());
		});
	}

	public static void modifierNomProduit() {
		System.out.println("donner l'ancien nom du produit");
		String ancNomP = sc.next();
		System.out.println("donner le nouveaux nom du produit");
		String nomPro = sc.next();
		listP.forEach((p) -> {
			if (p.getNomProduit().equals(ancNomP)) {
				try {
					p.setNomProduit(nomPro);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} /*else
				System.out.println("pas trouve : " + p.getNomProduit());*/
		});
	}

	public static void modifierDescriptionProduit() {
		System.out.println("donner le nom du produit");
		String nomProd = sc.next();
		System.out.println("donner la nouvelle description du produit");
		String newDes = line.next();
		listP.forEach((p) -> {
			if (p.getNomProduit().equals(nomProd)) {
				try {
					p.setDescription(newDes);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else
				System.out.println("pas trouve : " + p.getNomProduit());
		});
	}

	public static void modifierEtatProduit() {
		System.out.println("donner le nom du produit");
		String nomProdu = sc.next();
		System.out.println("donner le nouvel Etat du produit");
		int newEtat = sc.nextInt();
		listP.forEach((p) -> {
			if (p.getNomProduit().equals(nomProdu)) {
				try {
					p.setEtat(newEtat);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else
				System.out.println("pas trouve : " + p.getNomProduit());
		});
	}

	public static void modifierPrixProduit() {
		System.out.println("donner le nom du produit");
		String nomProdui = sc.next();
		System.out.println("donner le nouveaux prix du produit");
		int newPrix = sc.nextInt();
		listP.forEach((p) -> {
			if (p.getNomProduit().equals(nomProdui)) {
				try {
					p.setPrix(newPrix);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else
				System.out.println("pas trouve : " + p.getNomProduit());
		});
	}

	public static void afficherProduit() {
		System.out.println("donner le nom du produit");
		String nomProduit = sc.next();
		listP.forEach((p) -> {
			if (p.getNomProduit().equals(nomProduit)) {
				System.out.println(" nom : " + p.getNomProduit());
				System.out.println(" descition : " + p.getDescription());
				System.out.println(" etat : " + p.getEtat());
				System.out.println(" prix : " + p.getPrix());
			}
		});
	}

	public static void main(String[] args) {
		try {
			listP = new SqlManager().charger();
			int menu;
			do {
				afficherMenu();
				menu = Integer.parseInt(sc.next());
				switch (menu) {
				case 1:
					insererProduit();
					break;
				case 2:
					supprimerProduit();
					break;
				case 8:
					afficherProduits();
					break;
				case 3:
					modifierNomProduit();
					break;
				case 4:
					modifierDescriptionProduit();
					break;
				case 5:
					modifierEtatProduit();
					break;
				case 6:
					modifierPrixProduit();
					break;
				case 7:
					afficherProduit();
					break;
				}
			} while (menu < 9);
		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println("fin");
	}

}

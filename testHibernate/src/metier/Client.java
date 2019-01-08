package metier;

import java.util.HashSet;
import java.util.Set;

public class Client {
	private int id;
	private String nom;
	private Adresse adresse;
	private Set<Facture> factures= new HashSet<Facture>();
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Set<Facture> getFactures() {
		return factures;
	}
	public void setFactures(Set<Facture> factures) {
		this.factures = factures;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Client(String nom) {
		this.nom = nom;
	}
	public Client() {
		
	}
	@Override
	public String toString() {
		String n = this.nom + "\n" +this.adresse;
		for (Facture f: this.getFactures()) {
			n+= "\n facture : "+f;
		}
		return n;
	}
	public void addFacture(Facture f) {
		f.setClient(this);
		factures.add(f);
	}
	
}

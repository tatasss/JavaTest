package metier;

import javax.persistence.*;


@Entity
@Table (name="VENDEUR")
public class Vendeur {
	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name="vendeurId")
	private int id;
	@Column (name = "nom")
	private String nom;
	
	public Vendeur(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "vendeur numero : " + id + " : " + nom;
	}
	
	
}

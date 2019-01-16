package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Client")
public class Client {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="ClientID")
	private int id;
	@Column (name="nom")
	private String nom;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "id : "+ this.id+ " nom : " +this.nom;
	}
	
	

}

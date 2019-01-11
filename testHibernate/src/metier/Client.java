package metier;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;


@Entity
@Table (name="CLIENT")
public class Client {
	@Id
	@GeneratedValue	(strategy=GenerationType.IDENTITY, generator = "book_generator")
	@SequenceGenerator(name="book_generator", sequenceName = "book_seq")
	@Column (name="clientId")
	private int id;
	@Column (name="nom")
	private String nom;
	@ManyToOne
	@JoinColumn (name= "adresseID", unique = true)
	@NotNull
	private Adresse adresse;
	@OneToMany (mappedBy="client")
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
	public Client(String nom,Adresse adr) {
		this.nom = nom;
		this.adresse = adr;
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
		
		factures.add(f);
	}
	
}

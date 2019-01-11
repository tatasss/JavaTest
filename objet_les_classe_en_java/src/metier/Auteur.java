package metier;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="AUTEUR")
public class Auteur {
	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name="AuteurId")
	private int id;
	@Column (name="Nom")
    private String nom;

    public int getId() {
		return id;
	}

	public Auteur() {
		super();
	}

	public void setId(int id) {
		this.id = id;
	}

	public Auteur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return getNom();
    }
}

package metier;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;


@Entity
@Table (name="Livre")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Livre extends  Document {
	@ManyToOne
	@JoinColumn (name= "auteur", unique = true)
	@NotNull
    private Auteur auteur;
    public Livre(String titre, int nbPage, Auteur auteur , Bibliotheque bib) {
        super(titre, nbPage, bib);
        this.auteur = auteur;
    }

    public Livre() {
		super();
	}

	public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }
    @Override
    public String toString(){
        return "TYPE : LIVRRE : "+getTitre();
    }

}

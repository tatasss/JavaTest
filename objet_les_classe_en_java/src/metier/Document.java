package metier;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;
@Entity
@Table (name="Document")
public class Document /*implements Serializable*/ {
	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name="DocId")
	private int id;
	@Column (name="titre")
    private String titre;
	@Column (name="nbPage")
    private int nbPage;
	@ManyToOne
	@JoinColumn (name = "BibId")
	@NotNull
    private Bibliotheque bib;
	
    private static int compteur=0;

    public static int getCompteur() {
        return compteur;
    }

    public static void setCompteur(int compteur) {
        Document.compteur = compteur;
    }


    public Document(String titre, int nbPage, Bibliotheque bib) {
    	this.titre = titre;
        this.nbPage = nbPage;
        this.bib=bib;
        bib.getMesDocument().add(this);
        compteur++;
	}

	public Document() {
		
	}

	public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNbPage() {
        return nbPage;
    }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage;
    }
    @Override
    public String toString(){
        return "titre: "+ this.titre+"\nnombre de page: "+this.nbPage;
    }
}

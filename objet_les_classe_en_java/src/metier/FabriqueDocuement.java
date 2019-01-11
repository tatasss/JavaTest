package metier;

import java.io.Serializable;
import java.security.PublicKey;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="FabriqueDocument")
public class FabriqueDocuement {
	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name="FabDocId")
	private int id;
    public FabriqueDocuement() {
    }
    public Document createDocuement (String titre, int nbPage,Auteur auteur,Bibliotheque bib){
    	System.out.println(bib);
    	System.out.println(auteur);
    	System.out.println(nbPage);
    	System.out.println(titre);
        return new Livre(titre,nbPage,auteur, bib);
    }
    public Document createDocuement (String titre, int nbPage,Frequence frequence,Bibliotheque bib){
        return new Revue(titre,nbPage,frequence,bib);
    }
}

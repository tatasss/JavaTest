package metier;

import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;
@Entity
@Table (name="Bibliotheque")
public class Bibliotheque /*implements Serializable*/ {
	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name="bibId")
	private int id;
	@OneToMany (mappedBy="bib")
    private List<Document> mesDocument= new ArrayList<>();
    
	public Bibliotheque() {
	}
	

	public void setMesDocument(List<Document> mesDocument) {
		this.mesDocument = mesDocument;
	}


	@ManyToOne
	@JoinColumn (name= "auteur", unique = true)
	@NotNull
	private FabriqueDocuement fb =new FabriqueDocuement();
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
        return nom;
    }

    public List<Document> getMesDocument() {
        return mesDocument;
    }

    private String nom;

    public Bibliotheque(String titre) {
        this.nom=titre;
    }

    public int getCompteur(){
        return Document.getCompteur();
    }
    public void ajouterUnDocument(String titre,int nbPage,Auteur auteur){
    	System.out.println(fb);
    	fb=new FabriqueDocuement();
        fb.createDocuement(titre,nbPage,auteur,this);
    }
    public void ajouterUnDocument(String titre,int nbPage,Frequence frequence){
    	fb=new FabriqueDocuement();
        fb.createDocuement(titre,nbPage,frequence,this);
    }
    public void afficherLesDocument(){
        for (int i=0; i<this.mesDocument.size();i++)
            System.out.println(mesDocument.get(i).toString());
    }
}

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

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.istack.NotNull;

import service.BibliothequeService;
import service.IBibliothequeService;
import service.ILivreService;
import service.IRevueService;
import service.LivreService;
import service.RevueService;

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
    	ILivreService ls=(ILivreService) new ClassPathXmlApplicationContext("config/maconfig.xml").getBean(LivreService.class);
    	//IBibliothequeService bs=(IBibliothequeService) new ClassPathXmlApplicationContext("config/maconfig.xml").getBean(BibliothequeService.class);
    	Livre l=new Livre(titre,nbPage,auteur,this);
        ls.store(l);
        //this.setMesDocument(bs.getAllDoc(this.id));
    }
    public void ajouterUnDocument(String titre,int nbPage,Frequence frequence){
    	IRevueService rs=(IRevueService) new ClassPathXmlApplicationContext("config/maconfig.xml").getBean(RevueService.class);
    	//IBibliothequeService bs=(IBibliothequeService) new ClassPathXmlApplicationContext("config/maconfig.xml").getBean(BibliothequeService.class);
    	Revue r=new Revue(titre,nbPage,frequence,this);
        rs.store(r);
        //this.setMesDocument(bs.getAllDoc(this.id));
    }
    public void afficherLesDocument(){
        for (int i=0; i<this.mesDocument.size();i++)
            System.out.println(mesDocument.get(i).toString());
    }


	@Override
	public String toString() {
		return "id : " + this.id + "nom : " + this.nom;
	}
    
}

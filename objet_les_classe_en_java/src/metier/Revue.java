package metier;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table (name="Revu")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Revue extends Document {
	
	public Revue() {
		super();
	}
	@Enumerated(EnumType.ORDINAL)
    private Frequence frequence;
    public Revue(String titre, int nbPage, Frequence frequence, Bibliotheque bib) {
        super(titre, nbPage,bib);
        this.frequence=frequence;
    }

    public Frequence getFrequence() {
        return frequence;
    }

    public void setFrequence(Frequence frequence) {
        this.frequence = frequence;
    }
    @Override
    public String toString(){
        return "TYPE :REVUE : "+ getTitre();
    }
}

package metier;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="ADRESSE")
public class Adresse {
	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name="AdresseId")
		private int id;
	@Column (name = "ville")
		private String ville;
	@Column (name = "codePostal")
		private String codePostal;
	@Column (name = "complementcedex")
		private String complementcedex;
	@Column (name = "ligne1")
		private String ligne1;
	
	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getVille() {
			return ville;
		}
		public void setVille(String ville) {
			this.ville = ville;
		}
		public String getCodePostal() {
			return codePostal;
		}
		public void setCodePostal(String codePostal) {
			this.codePostal = codePostal;
		}
		public String getComplementcedex() {
			return complementcedex;
		}
		public void setComplementcedex(String complémentcedex) {
			this.complementcedex = complémentcedex;
		}
		public String getLigne1() {
			return ligne1;
		}
		public void setLigne1(String ligne1) {
			this.ligne1 = ligne1;
		}
		@Override
		public String toString() {
			return ville;
		}
		
}

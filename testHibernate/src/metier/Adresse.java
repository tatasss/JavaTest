package metier;

public class Adresse {
		private int id;
		private String ville;
		private String codePostal;
		private String complementcedex;
		private String ligne1;
		private String ligne2;
		private String ligne3;
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
		public String getLigne2() {
			return ligne2;
		}
		public void setLigne2(String ligne2) {
			this.ligne2 = ligne2;
		}
		public String getLigne3() {
			return ligne3;
		}
		public void setLigne3(String ligne3) {
			this.ligne3 = ligne3;
		}
		@Override
		public String toString() {
			return ville;
		}
		
}

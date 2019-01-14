package generateur;
import infosClass.InfosInterface;

public class GenerateurInfos {
	private InfosInterface generateur ;
	public void setInfosInterface(InfosInterface generateur) {
		this.generateur=generateur;
	}
	
	
	public InfosInterface getGenerateur() {
		return generateur;
	}

	public GenerateurInfos() {
		
	}

	public void setGenerateur(InfosInterface generateur) {
		this.generateur = generateur;
	}
	public String fournirLesDonnees() {
		return generateur.genererInfos();
	}
	

}

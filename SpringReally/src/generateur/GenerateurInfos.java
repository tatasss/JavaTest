package generateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import infosClass.InfosInterface;
@Component
public class GenerateurInfos {
	private InfosInterface generateur ;
	@Autowired
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
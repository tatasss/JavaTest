package generateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import infosClass.InfosInterface;
//@Component
public class GenerateurInfos {
	private InfosInterface generateur ;
	int param;
	//@Autowired
	public void setInfosInterface(InfosInterface generateur,int param) {
		this.generateur=generateur;
		this.param=param;
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
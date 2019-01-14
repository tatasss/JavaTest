package Util;

import SingleTonConteneur.Conteneur;
import infosClass.InfosInterface;

public class ServiceLocator {

	public static InfosInterface getInfosComponent() {
		
		return (InfosInterface) Conteneur.instance.getComponent("infos");
	}

}

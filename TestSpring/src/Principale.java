import SingleTonConteneur.Conteneur;
import generateur.GenerateurInfos;

public class Principale {

	public static void main(String[] args) {
		Conteneur monConteneur = new Conteneur();
		GenerateurInfos gen = (GenerateurInfos) monConteneur.getComponent("generateur");
		//System.out.println( monConteneur.instance.getComponent("generateur"));
		System.out.println(gen.fournirLesDonnees());
	}

}

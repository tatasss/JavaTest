package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import generateur.GenerateurInfos;

public class Project {
	private static ApplicationContext contexte;

	public static void main(String[] args) {
		contexte = new ClassPathXmlApplicationContext("config/maconfig.xml");
		GenerateurInfos gen=contexte.getBean(GenerateurInfos.class);
		System.out.println(gen.fournirLesDonnees());
		/*System.out.println(gen);
		System.out.println(gen.getGenerateurs().toString());*/
		GenerateurInfos gen2=contexte.getBean(GenerateurInfos.class);
		System.out.println(gen2.fournirLesDonnees());
		/*System.out.println(gen2);
		System.out.println(gen2.getGenerateurs().toString());*/
	}

}

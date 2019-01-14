package Principale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import generateur.GenerateurInfos;
import infosClass.MaFabirque;

public class Main {

	private static ApplicationContext contexte;

	public static void main(String[] args) {
		contexte = new AnnotationConfigApplicationContext(MaFabirque.class);
		GenerateurInfos gen=contexte.getBean(GenerateurInfos.class);
		System.out.println(gen.fournirLesDonnees());

	}

}

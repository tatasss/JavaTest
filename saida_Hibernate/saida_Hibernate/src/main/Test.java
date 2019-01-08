package main;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import classes.Categorie;
import classes.Services;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// load services
		Services s = new Services();
		

		
		// les catégories
		
		Categorie c1 = new Categorie("inforamtique5","info5",new Date());
		Categorie c2 = new Categorie("inforamtique6","info6",new Date());
		Categorie c3 = new Categorie("inforamtique7","info7",new Date());
		Categorie c4 = new Categorie("inforamtique8","info8",new Date());

		s.addCategorie(c1);
		s.addCategorie(c2);
		s.addCategorie(c3);
		s.addCategorie(c4);
		
		
		
		List <Categorie> l= s.getAllCategories();
		
		for(Categorie o : l)
		{
			o.show();
		}
		
		
	}

}

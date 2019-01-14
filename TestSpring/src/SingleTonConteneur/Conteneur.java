package SingleTonConteneur;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.beanutils.PropertyUtils;

public class Conteneur {
	private Map<String, Object> map;

	@SuppressWarnings("rawtypes")
	public Conteneur() {
		map = new HashMap<String, Object>();
		instance = this;
		/*
		 * InfosInterface ii = new InfosXML(); map.put("infos",ii); GenerateurInfos gi =
		 * new GenerateurInfos(ii);
		 * 
		 * map.put("generateur", gi);
		 */
		try {
			Properties prop = new Properties();
			File f = new File("src/config/composant.properties");
			//System.out.println(f);
			prop.load(new FileInputStream(f));
			for (Map.Entry ligne : prop.entrySet()) {
				String cle = ligne.getKey().toString();
				String valeur = ligne.getValue().toString();
				String[] tokens = cle.split("\\.");
				if (tokens.length == 1) {
					Object composant = Class.forName(valeur).newInstance();
					map.put(tokens[0], composant);
					//System.out.println(tokens[0]+ " : "+ composant);
				}
			}
			for (Map.Entry lign : prop.entrySet()) {
				String clee = lign.getKey().toString();
				String valeu = lign.getValue().toString();
				String[] token = clee.split("\\.");
				if (token.length != 1) {
					Object composant = map.get(token[0]);
					Object reference = map.get(valeu);
					PropertyUtils.setProperty(composant, token[1], reference);
				}
			}
		} catch (Exception e) {
				e.printStackTrace();
		}
	}

	public static Conteneur instance;

	public Object getComponent(String nom) {
		return map.get(nom);
	}

}

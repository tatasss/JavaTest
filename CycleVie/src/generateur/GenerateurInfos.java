package generateur;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;

import infosClass.InfosInterface;


	public class GenerateurInfos {
		private Map<String,InfosInterface> generateurs =new HashMap<String,InfosInterface>();
		
		private Message msg;
		
		/*public void setInfosInterface(InfosInterface generateur) {
			this.generateur=generateur;
		}*/
		
		public Message getMsg() {
			return msg;
		}

		public void setMsg(Message msg) {
			this.msg = msg;
		}

		public int getParam() {
			return param;
		}

		public void setParam(int param) {
			this.param = param;
		}
		private int param;
		

		public GenerateurInfos( int param) {
			
			this.param=param;
			
		}
		
		
		public String fournirLesDonnees() {
			String ret="";
			for (InfosInterface gen : generateurs.values()) {
				ret+= gen.genererInfos(this.msg.getValeur()+ "  "+param)+"\n";
			}
			//generateur.genererInfos(msg.getValeur() + " "+ this.param);
			return ret;
		}


		public Map<String, InfosInterface> getGenerateurs() {
			return generateurs;
		}

		public void setInfos1( InfosInterface infos1) {
			this.generateurs.put("xml",infos1);
		}
		public void setInfos2( InfosInterface infos2) {
			this.generateurs.put("html", infos2);
		}

		public void  init() {
			System.out.println("generateur initialisé");
		}
		public void  cleanUp() {
			System.out.println("generateur détruit");
		}
		

	}


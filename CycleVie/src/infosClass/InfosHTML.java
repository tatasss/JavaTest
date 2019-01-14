package infosClass;

public class InfosHTML implements InfosInterface{

	@Override
	public String genererInfos(String str) {
		return "<BaliseHTML>"+str+"</BaliseHTML>";
	}

}

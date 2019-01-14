package infosClass;

public class InfosXML implements InfosInterface{
	public InfosXML(){}
	@Override
	public String genererInfos(String str) {
		return "<BaliseXML>"+str+"</BaliseXML>";
	}
}

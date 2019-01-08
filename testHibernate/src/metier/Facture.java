package metier;

public class Facture {
	private int id;
	private double  totalTTC;
	private Client client;
	
	
	public Facture() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotalTTC() {
		return totalTTC;
	}
	public void setTotalTTC(double totalTTC) {
		this.totalTTC = totalTTC;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return " id : " + id + "total : " + totalTTC + "Client : "+ client.getNom();
	}
	
}

package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table (name="Facture")
public class Facture {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="factureID")
	private int id;
	@Column (name= "totalTTC")
	private double  totalTTC;
	@ManyToOne
	@JoinColumn (name = "clientID")
	@NotNull
	private Client client;
	public Facture() {
		
	}

	public Facture(double totalTTC, Client c) {
		this.totalTTC= totalTTC;
		this.client=c;
		c.addFacture(this);
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
		return " id : " + id + "total : " + totalTTC;// + "Client : "+ ((client!=null)? client.getNom() : "");
	}
	
}

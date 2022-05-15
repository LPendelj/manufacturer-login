package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "manufacturer")
@NamedQuery(name="Manufacturer.findAll", query="SELECT m FROM Manufacturer m") //STA ZNACI OVO??
public class Manufacturer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="PNUMBER")
	private String pNumber;
	@Column(name="ADDRESS")
	private String address;
	
	//Sta znace ovi CAscade Type??
	@OneToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name="zip_code") // KOLONA IZ TABELE ODG. OBJEKTA KOJA JE ZAPRAVO STRANI KLJUC U OVOJ
	private Location location;
	
	
	public Manufacturer() {
		
	}
	
	
	
	public Manufacturer(int pib, String pNumber, String address, Location location) {
		super();
		this.id = pib;
		this.pNumber = pNumber;
		this.address = address;
		this.location = location;
	}


	public int getPib() {
		return id;
	}


	public void setPib(int pib) {
		this.id = pib;
	}


	public String getpNumber() {
		return pNumber;
	}


	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Manufacturer [pNumber=" + pNumber + ", address=" + address + ", location=" + location
				+ "]";
	}
	
	
	
	
	
	
}

package model;

public class Manufacturer {
	private String pib;
	private String pNumber;
	private String address;
	private Location location;
	
	
	public Manufacturer(String pib, String pNumber, String address, Location location) {
		super();
		this.pib = pib;
		this.pNumber = pNumber;
		this.address = address;
		this.location = location;
	}


	public String getPib() {
		return pib;
	}


	public void setPib(String pib) {
		this.pib = pib;
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
	
	
	
	
	
}

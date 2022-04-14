package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Location.findAll", query="SELECT l FROM Location l")
public class Location {
	
	@Id
	private int zip_code;
	private String name;
	
	
	public Location() {
		
	}
	
	
	public Location(int zip_code, String name) {
		super();
		this.zip_code = zip_code;
		this.name = name;
	}
	public int getZip_code() {
		return zip_code;
	}
	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}

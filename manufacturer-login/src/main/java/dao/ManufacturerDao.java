package dao;

import java.util.List;

import model.Manufacturer;

public interface ManufacturerDao {
	void save(Manufacturer manufaturer);
	List<Manufacturer> findAll();
	Manufacturer getManufacturer(String s);
	String deleteManufacturer(String s);
}

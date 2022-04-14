package main;

import model.Manufacturer;
import storage.ManufacturerStorage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ManufacturerStorage ms = new ManufacturerStorage();
		Manufacturer m = new Manufacturer();
			m = ms.get(1);
			
			System.out.println(m);
	}

}

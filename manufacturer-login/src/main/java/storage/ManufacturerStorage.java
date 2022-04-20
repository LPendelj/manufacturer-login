package storage;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Manufacturer;
import connection.MyEntityManagerFactory;
import dao.impl.ManufacturerDaoImpl;
import service.StorageActions;

public class ManufacturerStorage implements StorageActions<Manufacturer> {
	private ManufacturerDaoImpl mdi;
	
	
	@Override
	public void save(Manufacturer t) {
EntityManager em = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		
		em.getTransaction().begin();
		//dodaj proizvodjaca
		//ZASTO
		em.merge(t);
		
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public Manufacturer get(String s) {
		
		mdi = new ManufacturerDaoImpl();
		Manufacturer m = mdi.getManufacturer(s);
		return m;
		
	}
	
	

	public List<Manufacturer> getManufacturers() {
		
		mdi = new ManufacturerDaoImpl();
		List<Manufacturer> list = mdi.findAll();
		return list;
	}

	@Override
	public Manufacturer get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String s) {
		// TODO Auto-generated method stub
		mdi = new ManufacturerDaoImpl();
		mdi.deleteManufacturer(s);
		
	}
	
	
	



}

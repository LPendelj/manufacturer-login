package storage;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Manufacturer;
import connection.MyEntityManagerFactory;
import dao.impl.ManufacturerDaoImpl;
import service.StorageActions;

public class ManufacturerStorage implements StorageActions<Manufacturer> {

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
		ManufacturerDaoImpl mdi = new ManufacturerDaoImpl();
		
		Manufacturer man = mdi.get(s);
		
		return man;
		
		
	}
	
	

	public List<Manufacturer> getManufacturers() {
		
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		List<Manufacturer> manufacturers = em.createNamedQuery("Manufacturer.findAll", Manufacturer.class).getResultList();
		
		// TODO Auto-generated method stub
		return manufacturers;
	}

	@Override
	public Manufacturer get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Manufacturer getByCred(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}



}

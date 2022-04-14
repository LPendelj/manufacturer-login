package storage;

import javax.persistence.EntityManager;


import model.Manufacturer;
import connection.MyEntityManagerFactory;
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
	public Manufacturer get(int id) {
EntityManager em = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();

		Manufacturer m = em.find(Manufacturer.class, id);
		
		System.out.println("ovo je proizvodjac " + m);
		
		em.getTransaction().commit();
		em.close();
		
		return m;
		
		
	}
	

}

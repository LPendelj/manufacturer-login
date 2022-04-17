package storage;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

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
	public Manufacturer get(String s) {
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		
		String q = "SELECT m FROM Manufacturer m WHERE m.pNumber='" + s + "'";

		 
		
		Manufacturer man = em.createQuery(q, Manufacturer.class).getSingleResult();
		
		System.out.println("ovo je proizvodjac " + man);
		
		em.getTransaction().commit();
	em.close();
		
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



}

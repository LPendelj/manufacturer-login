package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import connection.MyEntityManagerFactory;
import model.Manufacturer;

public class ManufacturerDaoImpl implements dao.ManufacturerDao {

	@Override
	public void save(Manufacturer manufaturer) {
		// TODO Auto-generated method stub

	}
	
	

	@Override
	public List<Manufacturer> findAll() {
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		List<Manufacturer> manufacturers = em.createNamedQuery("Manufacturer.findAll", Manufacturer.class).getResultList();
		
		// TODO Auto-generated method stub
		return manufacturers;
	}



	@Override
	public Manufacturer getManufacturer(String s) {
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		
		String q = "SELECT m FROM Manufacturer m WHERE m.pNumber='" + s + "'";

		 
		
		Manufacturer man = em.createQuery(q, Manufacturer.class).getSingleResult();
		
		System.out.println("ovo je proizvodjac " + man);
		
		em.getTransaction().commit();
	em.close();
		
		return man;
	}



	@Override
	public String deleteManufacturer(String s) {
		
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		
		String q = "DELETE FROM Manufacturer m WHERE m.pNumber='" + s + "'";
		
		em.createQuery(q, Manufacturer.class).executeUpdate();
		
		em.getTransaction().commit();
		em.close();
		
		System.out.println("Manufacturer deleted");
		
		return "Manufacturer " + s + " has been removed";
	}
	
	

}

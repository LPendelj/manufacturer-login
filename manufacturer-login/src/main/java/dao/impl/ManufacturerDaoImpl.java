package dao.impl;

import javax.persistence.EntityManager;

import connection.MyEntityManagerFactory;
import dao.ManufacturerDao;
import model.Manufacturer;

public class ManufacturerDaoImpl implements ManufacturerDao<Manufacturer> {

	@Override
	public void save(Manufacturer m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Manufacturer get(int i) {
		// TODO Auto-generated method stub
		return null;
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

}

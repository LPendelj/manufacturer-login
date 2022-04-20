package storage;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import model.Manufacturer;
import model.users.User;
import service.StorageActions;
import connection.MyEntityManagerFactory;



public class UserStorage implements StorageActions<User> {

	@Override
	public void save(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		
		EntityManager er = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		User u = er.find(User.class, id);
		
		
		
		
		return u;
	}
	
	public User getByCred(String username, String password) {
		
		EntityManager er = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		System.out.println("pokrenut metod getByCred");
		
		//
		List<User> users;
		users = er.createNamedQuery("User.findAll", User.class)
				.getResultList();
		
		User u = new User(username, password, "", "");
		
		for(User t : users) {
			if(u.equals(t)) {
				System.out.println("Provera izvrsena");
				return t;
			}
		}  return null;
		
		 
	}

	@Override
	public Manufacturer get(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String s) {
		// TODO Auto-generated method stub
		
	}

}

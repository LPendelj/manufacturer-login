package storage;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import model.Manufacturer;
import model.users.User;
import service.StorageActions;
import connection.MyEntityManagerFactory;
import dao.impl.UserDaoImpl;



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
	
	@Override
	public User getByCred(String username, String password) {
		
		UserDaoImpl udi = new UserDaoImpl();
		
		User u = udi.getByCred(username, password);
		
		return u;
		 
	}

	@Override
	public User get(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

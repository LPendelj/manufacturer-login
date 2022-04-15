package storage;

import javax.persistence.EntityManager;


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

}

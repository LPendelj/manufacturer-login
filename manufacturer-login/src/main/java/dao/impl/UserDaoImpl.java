package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import connection.MyEntityManagerFactory;
import dao.UserDao;
import model.users.User;

@Repository
public class UserDaoImpl implements UserDao<User> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	@Override
	public void save(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByCred(String username, String password) {
		//EntityManager er = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		//jdbcTemplate.get
		jdbcTemplate.query("SELECT * FROM USER WHERE id=?", new ResultSetExtractor<User>() {

		});
		
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

	

}

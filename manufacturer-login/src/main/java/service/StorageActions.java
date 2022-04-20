package service;

import model.Manufacturer;
import model.users.User;

public interface StorageActions<T> {
	public void save(T t);
	public T get(int i);
	public T get(String s);
	T getByCred(String username, String password);
	
	
	

}

package service;

import model.Manufacturer;

public interface StorageActions<T> {
	public void save(T t);
	public T get(int i);
	Manufacturer get(String s);
	
	
	

}

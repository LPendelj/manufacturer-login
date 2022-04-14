package service;

public interface StorageActions<T> {
	public void save(T t);
	public T get(int id);
	
	

}

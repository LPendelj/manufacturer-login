package dao;

public interface ManufacturerDao<T> {
	public void save(T t);
	public T get(int i);
	public T get(String s);
}

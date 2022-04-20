package dao;

public interface UserDao<T> {
	public void save(T t);
	public T get(int i);
	public T get(String s);
	public T getByCred(String username, String password);
}

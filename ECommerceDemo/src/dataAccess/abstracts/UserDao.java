package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	void register(User user);
	void signIn(User user);
	void signOut(User user);
	void confirm(User user);
	List<User>getAll();
	

}

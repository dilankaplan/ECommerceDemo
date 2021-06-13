package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;


public class HibernateDao implements UserDao
{
	
	List<User> users = new ArrayList<User>();

	@Override
	public void register(entities.concretes.User user) {
		System.out.println("Kay�t olma i�lemi ba�ar�l�" + user.getName());
	    users.add(user);
		
	}

	@Override
	public void signIn(entities.concretes.User user) {
		System.out.println("Giri� i�lemi ba�ar�l�" + user.getName());
	}

	@Override
	public void signOut(entities.concretes.User user) {
		System.out.println("��k�� i�lemi ba�ar�l�" + user.getName());
		
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

	@Override
	public void confirm(User user) {
		System.out.println(user.getEmail()+ "Emailiniz onayland�.");
		user.setVerify(true);
		
		
	}


}

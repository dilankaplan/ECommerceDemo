package business.concretes;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;


public class UserManager implements UserService{
	private UserDao userDao;

	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;

	}

	@Override
	public void signUp(User user) {
		 if(user.getName().length()<=2 && user.getLastName().length()<=2  ) {
			 System.out.println("Ad ve Soyad 2 en az 2 karakter olmal�d�r.");
		 }
		 for(User users : userDao.getAll()){
		    if(user.getEmail().equals(user.getEmail())) {
			 System.out.println("Bu email sisteme kay�tl�.");
			 }
		  }
		 if(user.getPassword().length()<=6) {
			 System.out.println("�ifreniz en az 6 karakter olmal�d�r.L�tfen ba�ka bir �ifre deneyiniz.");	
	}
		 
				String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(regex);
				if (!matcher.matches()) {
					System.out.println(user.getEmail() + "Bu email format� ge�erli de�il.L�tfen ge�erli bir email giriniz.");
			}
	}

	@Override
	public void signIn(User user) {
		if(user.isVerify()== true) {
			userDao.signIn(user);
		}else {
			System.out.println("Giri� ba�ar�s�z.");
		}
		
	}
		
	

	@Override
	public void logOut(User user) {
		System.out.println("��k�� yap�l�yor.");
		
	}

	@Override
	public void signUpWithGoogleAccount(String email, String password) {
		
	}

	@Override
	public void sendVerificationEmail(User user) {
		if(user.isVerify()== true) {
			System.out.println("Emailiniz onayland�.");
			}
		else {
			System.out.println("Email do�rulamas� yap�lamad�.");
		}
		
	}

	@Override
	public void clickVerificationEmail(User user) {
		System.out.println();
		
	}

	

}

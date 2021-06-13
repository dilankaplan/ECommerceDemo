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
			 System.out.println("Ad ve Soyad 2 en az 2 karakter olmalýdýr.");
		 }
		 for(User users : userDao.getAll()){
		    if(user.getEmail().equals(user.getEmail())) {
			 System.out.println("Bu email sisteme kayýtlý.");
			 }
		  }
		 if(user.getPassword().length()<=6) {
			 System.out.println("Þifreniz en az 6 karakter olmalýdýr.Lütfen baþka bir þifre deneyiniz.");	
	}
		 
				String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(regex);
				if (!matcher.matches()) {
					System.out.println(user.getEmail() + "Bu email formatý geçerli deðil.Lütfen geçerli bir email giriniz.");
			}
	}

	@Override
	public void signIn(User user) {
		if(user.isVerify()== true) {
			userDao.signIn(user);
		}else {
			System.out.println("Giriþ baþarýsýz.");
		}
		
	}
		
	

	@Override
	public void logOut(User user) {
		System.out.println("Çýkýþ yapýlýyor.");
		
	}

	@Override
	public void signUpWithGoogleAccount(String email, String password) {
		
	}

	@Override
	public void sendVerificationEmail(User user) {
		if(user.isVerify()== true) {
			System.out.println("Emailiniz onaylandý.");
			}
		else {
			System.out.println("Email doðrulamasý yapýlamadý.");
		}
		
	}

	@Override
	public void clickVerificationEmail(User user) {
		System.out.println();
		
	}

	

}

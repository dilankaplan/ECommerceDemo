import business.abstracts.UserService;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new HibernateDao() );
		User user = new User("Dilan","Kaplan","dilankaplan@outlook.com","12345");
		User user1 = new User("Eren", "Kaplan", "erenkaplan@gmail.com", "2345");
		
		
		userService.signUp(user);
		userService.signUpWithGoogleAccount("erenkaplan@gmail.com", "2345");
		userService.signIn(user1);
        userService.sendVerificationEmail(user);
        userService.clickVerificationEmail(user);
	}

}

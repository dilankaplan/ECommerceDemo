package business.abstracts;

import entities.concretes.User;

public interface UserService {

		void signUp(User user);
		void signIn(User user);
		void logOut(User user);
		void signUpWithGoogleAccount(String email,String password);
		void sendVerificationEmail(User user);
		void clickVerificationEmail(User user);

	}


package Service;

import org.apache.catalina.User;

public class LoginService {
	
	public boolean verificarLogin( User user ){
		
		if( user.getUsername().equals( "userId" ) && user.getPassword().equals( "password" ) ){
			
		return true;	
		}
	return false;
	}
}

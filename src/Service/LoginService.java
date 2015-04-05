package Service;

import ModeloDeAplicacion.Usuario;

public class LoginService {
	
	public boolean verificarLogin( Usuario user ){
		
		if( user.getUsername().equals( "userId" ) && user.getPassword().equals( "password" ) ){
			
		return true;	
		}
		
	return false;
	}
}

package Actions;

import Service.LoginService;
import ModeloDeAplicacion.Usuario;
import Service.LoginService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import org.apache.commons.lang3.StringUtils;

public class LoginAction extends ActionSupport implements ModelDriven {
	
	//Son asignados por Struts al llamar esta clase como un Action
	private Usuario user = new Usuario();
	

	
	public String execute(){
		
		LoginService logService = new LoginService();
		 
		
		///Código para validar el login
		
		if( logService.verificarLogin( user ) ){
		
		return SUCCESS;
		}	
	return LOGIN;
	}
	/*
	 * Implementando el metodo validate de ActionSupport
	 * */
	public void validate(){
		
		if( StringUtils.isEmpty( user.getUsername() ) ){
			
			//Ussername vacío
			addFieldError( "userId", "El nombre de usuario NO puede quedar vacío" );
		}
		if( StringUtils.isEmpty( user.getPassword() ) ){
			
			//Password vacía
			addFieldError( "password", "La contraseña NO puede quedar vacío" );
		}
	}
	
	/*
	//geters & seters
	*/
	public String getPassword() {
		
	return user.getPassword();
	}

	public void setPassword( String password ) {
		
		this.user.setPassword( password );
	}

	public String getUserId() {
		
	return this.user.getUsername();
	}

	public void setUserId( String userId ) {
		
		this.user.setUsername( userId );
	}
	
	/*
	 * sobreescritura del metodo getModel() en ModelDriven
	 */
	@Override
	public Object getModel() {
		
		
	return user;
	}
	
}

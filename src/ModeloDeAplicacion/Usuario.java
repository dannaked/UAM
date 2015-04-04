package ModeloDeAplicacion;

import Modelo.Persona;

public class Usuario {

	private Persona persona;
	private String username;
	private String password;
	
	public Usuario( Persona persona, String username, String password ){
		
		this.persona = persona;
		this.username = username;
		this.password = password;
	}
	
	
	public Persona getPersona() {
		return persona;
	}
	
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}

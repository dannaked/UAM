package ModeloDeAplicacion;

import ManejadorDeDatos.GeneradorPersona;
import Modelo.Persona;

public class Usuario {
	
	//Atributos del Usuario
	private Persona persona;
	private String username;
	private String password;
	
	/*
	 * Constructores
	*/
	public Usuario( Persona persona, String username, String password ){
		
		this.persona = persona;
		this.username = username;
		this.password = password;
	}
	
	public Usuario(){
		
		GeneradorPersona gp = new GeneradorPersona();
		this.persona = gp.personaAleatoria();
	}
	
	/*
	 * geters & seters
	*/
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

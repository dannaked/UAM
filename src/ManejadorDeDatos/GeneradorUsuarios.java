package ManejadorDeDatos;

import Modelo.Persona;
import ModeloDeAplicacion.Usuario;

public class GeneradorUsuarios {
	
	private Usuario admin;
	private Usuario editor;
	
	public GeneradorUsuarios( Persona persona ){
		
		this.admin = new Usuario( persona, "admin", "adminpassword" );
		this.editor = new Usuario( persona, "editor", "editorpassword" );
	}
	
	public Usuario getEditor(){
	
	return editor;
	}
	
	public Usuario getAdmin(){
	
	return admin;
	}
}

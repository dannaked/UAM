package Modelo;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */

/**
 * Clase que representa el autor al cual pertenece una noticia
 */
public class Persona {
    String nombrePersona;
    String apellidoPersona;

    public Persona( String nombrePersona, String apellidoPersona ){
         
    	this.nombrePersona = nombrePersona;
    	this.apellidoPersona = apellidoPersona;
    }
    
    public String getNombreCopletoPersona(){
    	
        return nombrePersona + " " + apellidoPersona;
    }
}

package ManejadorDeDatos;

import java.util.ArrayList;

import Modelo.Persona;

//Generara personas al azar
public class GeneradorPersona {
	
	private ArrayList< String > listaNombres = new ArrayList< String >();
	private ArrayList< String > listaApellidos = new ArrayList< String >();
	
	public GeneradorPersona(){
		
		//Agregamos Nombres a la lista que guardara los nombres
		
		listaNombres.add( "Hugo" );
		listaNombres.add( "Steve" );
		listaNombres.add( "Gerardo" );
		listaNombres.add( "Lizbeth" );
		listaNombres.add( "Pedro" );
		listaNombres.add( "Pablo" );
		listaNombres.add( "Ada" );
		listaNombres.add( "Grace" );
		
		//Agregamos Apellidos a la lista que guardara los apellidos
		
		listaApellidos.add( "Hopper" );
		listaApellidos.add( "Picapiedra" );
		listaApellidos.add( "Marmol" );
		listaApellidos.add( "Cabrera" );
		listaApellidos.add( "Hernandez" );
		listaApellidos.add( "Lovelace" );
		listaApellidos.add( "Gallardo" );
		listaApellidos.add( "Jobs" );
	
	
	}
	
	public Persona personaAleatoria(){
		
		String nombre = nombreAleatorio();
		String apellido = apellidoAleatorio();
		
		Persona personaA = new Persona( nombre, apellido );
	
	return personaA;
	}
	
	private String nombreAleatorio(){
		
		//rdm = ( int )( Math.random() * ( HASTA - DESDE + 1 ) + HASTA );
		//rdm = ( int )( Math.random() * LIMITE + ( DESDE 1 ) );
		int rdm;
		
		do{
			rdm = ( int )( Math.random() * 7 + 1 );
			//System.out.println( rdm );	
		}
		while( ( listaNombres.size() - 1 )  < rdm );
			//System.out.println( listaNombres.get( rdm ) );
	return listaNombres.get( rdm );
	}
	
	private String apellidoAleatorio(){
		
		int rdm;
		do{
			rdm = ( int )( Math.random() * 7 + 1 );
			System.out.println( rdm );
		}
		while( ( listaApellidos.size() - 1 ) < rdm  );
		System.out.println( listaNombres.get( rdm ) );
	return listaApellidos.get( rdm );
	}
	
	

}

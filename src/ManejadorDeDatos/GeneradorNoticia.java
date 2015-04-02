package ManejadorDeDatos;

import Modelo.*;

import java.util.ArrayList;

public class GeneradorNoticia {

	private GeneradorPersona gp = new GeneradorPersona();
	private GeneradorArea ga = new GeneradorArea();
	private GeneradorUnidad gu = new GeneradorUnidad();
	
	private String textoNoticias = new String();
	private ArrayList< String > listaTitulos = new ArrayList< String >();
	private ArrayList< String > listaTipos = new ArrayList< String >();
	
	public GeneradorNoticia(){
		
		
		textoNoticias = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod"
				+ "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,"
				+ "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo"
				+ "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse"
				+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non"
				+ "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
				
		listaTitulos.add( "How Obsession Fuels Genius" );
		listaTitulos.add( "Why Gender Balance Is Important to Us" );
		listaTitulos.add( "Back in Time, Just in Time" );
		listaTitulos.add( "A Different Kind Of Paradise" );
		listaTitulos.add( "How a bee sting saved my life: poison as medicine" );
		listaTitulos.add( "JavaScript World Domination" );
		listaTitulos.add( "The War Over Who Steve Jobs Was" );
		listaTitulos.add( "+300 Awesome Free Things for Entrepreneurs and Startups" );
		
		listaTipos.add("Investigación");
		listaTipos.add("Avance Tenologico");
		listaTipos.add("Divulgación");
		
		
	}

	public Noticia noticiaAleatoria(){
			
		Persona p = gp.personaAleatoria();
		Area a = ga.areaAleatoria();
		Unidad u = gu.unidadAleatoria();
		
		Noticia n = new Noticia( tituloAleatorio(), p, u, a, tipoAleatorio(), textoAleatorio(), "8-Marzo-2014" );
		
	return n;
	}
	
	private String tituloAleatorio(){
		
		//rdm = ( int )( Math.random() * ( HASTA - DESDE + 1 ) + HASTA );
		//rdm = ( int )( Math.random() * LIMITE + ( DESDE 1 ) );
		int rdm;
				
		do{
			rdm = ( int )( Math.random() * 7 + 1 );
			//System.out.println( rdm );	
		}
		while( ( listaTitulos.size() - 1 )  < rdm );
		//System.out.println( listaNombres.get( rdm ) );
				
	return listaTitulos.get( rdm );
	}
	
	private String textoAleatorio(){
		
		String texto = "";
		int rdm;
						
		rdm = ( int )( Math.random() * 7 + 1 );
		
		for( int i = 0; i < rdm; i++ ){
			
			texto = texto + this.textoNoticias;
		}
		
	return texto;
	}
	
private String tipoAleatorio(){
		
		//rdm = ( int )( Math.random() * ( HASTA - DESDE + 1 ) + HASTA );
		//rdm = ( int )( Math.random() * LIMITE + ( DESDE 1 ) );
		int rdm;
				
		do{
			rdm = ( int )( Math.random() * 3 + 1 );
			//System.out.println( rdm );	
		}
		while( ( listaTipos.size() - 1 )  < rdm );
		//
				
	return listaTipos.get( rdm );
	}
}

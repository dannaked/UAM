package ManejadorDeDatos;

import java.util.ArrayList;

import Modelo.Unidad;


public class GeneradorUnidad {

	private ArrayList< String > listaUnidades = new ArrayList< String >();
	
	public GeneradorUnidad(  ){
			
		//Agregamos los nombres de las Unidades		
		listaUnidades.add( "Azcapotzalco" );
		listaUnidades.add( "Iztapalapa" );
		listaUnidades.add( "Lerma" );
		listaUnidades.add( "Xochimilco" );
		listaUnidades.add( "Cuajimalpa" );
		
		//Agregamos los nombres de la unidades
		/*
				
				*/		
	}
	
	public Unidad unidadAleatoria(  ){
		
		String nombreUnidad = nombreAleatorio();
		Unidad unidad = new Unidad( nombreUnidad );
	return unidad;
	}
	
	private String nombreAleatorio(  ){
		
		//rdm = ( int )( Math.random() * ( HASTA - DESDE + 1 ) + HASTA );
		//rdm = ( int )( Math.random() * LIMITE + ( DESDE 1 ) );
		int rdm;
		
		do{
			rdm = ( int )( Math.random() * 7 + 1 );
			//System.out.println( rdm );	
		}
		while( ( listaUnidades.size() - 1 )  < rdm );
			//System.out.println( listaUnidades.get( rdm ) );
	return listaUnidades.get( rdm );
	}
	
}

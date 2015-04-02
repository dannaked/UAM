package ManejadorDeDatos;

import java.util.ArrayList;

import Modelo.Area;

public class GeneradorArea {
	
	private ArrayList< String > listaAreas = new ArrayList< String >();
	
	public GeneradorArea(){
		
		listaAreas.add( "Ciencias Basicas e Ingeniería" );
		listaAreas.add( "Ciencias Sociales y de Humanidades" );
		listaAreas.add( "Ciencias y Artes para le Diseño" );
		listaAreas.add( "Ciencias Biológicas y de la Salud" );
	}
	
	public Area  areaAleatoria(){
		
		String nombreArea = nombreAreaAleatorio();
		Area area = new Area( nombreArea );
		
	return area;
	}
	
	private String nombreAreaAleatorio(){
		
		//rdm = ( int )( Math.random() * ( HASTA - DESDE + 1 ) + HASTA );
		//rdm = ( int )( Math.random() * LIMITE + ( DESDE 1 ) );
		int rdm;
				
		do{
			rdm = ( int )( Math.random() * 7 + 1 );
				//System.out.println( rdm );	
		}
		while( ( listaAreas.size() - 1 )  < rdm );
				//System.out.println( listaUnidades.get( rdm ) );
	return listaAreas.get( rdm );
	}
}

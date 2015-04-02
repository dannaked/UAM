package ModeloDeAplicacion;

import java.util.ArrayList;



import Modelo.Noticia;



public class ListaNoticias {
	
	private ArrayList< Noticia > listaNoticias;
	 
	public ListaNoticias(){
		
		listaNoticias  = new ArrayList< Noticia >(); 
	}
	
	public void agregarNoticia( Noticia noticia ){
		
		this.listaNoticias.add( noticia );		
	}
	
	public void elminarNoticia( int i ){
		
		this.listaNoticias.remove( i );
	}
	public String getHTMLNoticia( int i ){
		
		String HTML = new String();
		
		HTML = HTML + "<li>";
			HTML = HTML + "<h2>";
				HTML = HTML + listaNoticias.get( i ).getTituloNoticia();
			HTML = HTML + "</h2>";
			
			HTML = HTML + "<h6>";
				HTML = HTML + listaNoticias.get( i ).getAutorNoticia();
			HTML = HTML + "</h6>";
			HTML = HTML + "<p>";
				HTML = HTML + listaNoticias.get( i ).getFechaNoticia();
			HTML = HTML + "</p>";
			HTML = HTML + "<p>";
			HTML = HTML + "Leer más";
		HTML = HTML + "</p>";
		HTML = HTML + "</li>";
		
		
	return HTML;
	}

}

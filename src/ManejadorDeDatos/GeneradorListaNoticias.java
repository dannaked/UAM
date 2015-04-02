package ManejadorDeDatos;


import ModeloDeAplicacion.ListaNoticias;
//import ManejadorDeDatos.*;

public class GeneradorListaNoticias {
	
	private ListaNoticias ln;
	
	public GeneradorListaNoticias(){
		
		ln = new ListaNoticias();		
	}
	
	public ListaNoticias listaNoticiasAleatoria(){
		
		GeneradorNoticia gn =  new GeneradorNoticia();
		for( int i = 0; i < 8; i++ ){
			
			this.ln.agregarNoticia( gn.noticiaAleatoria() );
			
		}
	return ln;
	}
	
	

}

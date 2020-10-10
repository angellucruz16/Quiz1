package modelo;
import processing.core.PApplet;
public class Figura extends PApplet {	
	
	int posX;
	int posY;
	int dim;
	PApplet Sketch;
	
	public Figura (int posX, int posY, int dim) {

		
	}//CONSTRUCTOR
		public void pararFigura () {
			
			Sketch.translate(posX, posY);
			
		
} //PARARFIGURA
		
		public void crearFigura () {
			
			
		} //CREARFIGURA 
}	//FIGURA

package modelo;

import processing.core.PApplet;
public class Cuadrado extends Figura {	
	
	
	int posX;
	int posY;
	int dim;
	PApplet Sketch;
	
	public Cuadrado(int posX, int posY, int dim) {
		super(posX, posY, dim);
		
	

		 
	}//CONSTRUCTOR
		
	public void pararFigura () {
		super.pararFigura();
		
	}//PARARFIGURA
	
	public void renderCuadrado (int posX, int posY, int tam, int dir) {
		
		Sketch.fill (149, 170, 204);
		Sketch.noStroke();
		Sketch.rect (posX, posY, tam, tam );
		
	} //RENDERCUADRADO
} //CUADRADO

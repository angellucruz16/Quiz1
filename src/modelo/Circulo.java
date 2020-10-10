package modelo;


import processing.core.PApplet;
public class Circulo extends Figura {	
	
	
	int posX;
	int posY;
	int dim;
	int tam;
	PApplet Sketch;
	
	public Circulo(int posX, int posY, int dim) {
		super(posX, posY, dim);
		
	
	
		
	}//CONSTRUCTOR
	
	public void pararFigura () {
		super.pararFigura();
		
	}//PARARFIGURA
	
	public void crearFigura () {
		
		
	} //CREARFIGURA 
	
	public void renderCirculo (int posX, int posY, int tam, int dir) {
		
		Sketch.fill (149, 170, 204);
		Sketch.noStroke();
		Sketch.ellipse (posX, posY, tam, tam);
		
		Sketch.translate (posX, tam);
		
		
	}//RENDERCIRCULO
	
	
	
} //CUADRADO

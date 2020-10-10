package vista;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import processing.core.PApplet;
public class Main extends PApplet {	
	
	//VARIABLES
	
	int posX;
	int posY;
	int dir;
	int tam;
	String ruta;
	String [] lineasTexto; 
	String [] nombreFigura; 
	
	int [] matrizTam;
	int [] matrizPosX;
	int [] matrizPosY;
	int [] matrizDir;
	
	Figura figura;
	
	public void settings () {
		size (1328,830);
		                               
	} // SETTINGS

	public void setup () {
	
			ruta = "Text/Text.txt";
			lineasTexto = new String [7];
			
			//INICIALIZAR
			matrizTam = new int [7];
			matrizPosX = new int [7];
			matrizPosY = new int [7];
			matrizDir = new int [7];
		 
	} //SETUP
	
	public void draw () {
		//  
		
		
	}// DRAW 
	
	
	public void readText () throws IOException {
		
		FileReader reader = new FileReader (ruta);
		BufferedReader breader = new BufferedReader (reader);
		
		String datos = breader.readLine();
		
		int i =0;
		
		while (datos != null) {
			lineasTexto [i] =datos;
			
			String [] guardarmomentaneo = datos.split (" "); 
				
				matrizTam [i] = (Integer.parseInt( guardarmomentaneo [1]));
				matrizPosX [i] = (Integer.parseInt( guardarmomentaneo [2]));
				matrizPosY [i] = (Integer.parseInt( guardarmomentaneo [3]));
				matrizDir [i] = (Integer.parseInt( guardarmomentaneo [4]));
				nombreFigura [i] = guardarmomentaneo [0];
			
			
			i++;
			
			datos = breader.readLine ();
			
		} //WHILE
			
			reader.close();
			breader.close();
			
		
	}//READTEXT
	

} //MAIN

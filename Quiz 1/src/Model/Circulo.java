package Model;

import processing.core.PApplet;

public class Circulo extends Figura {
	public Circulo (int posX, int posY, int dir, int tam, PApplet app) {
		super (posX, posY, dir, tam, app);
		
	}
	
	
	public void draw () {
		app.fill (255);
		app.ellipse (posX, posY, tam, tam);
		
		
	}
	

}

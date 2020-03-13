package View;

import java.util.ArrayList;

import Model.Circulo;
import processing.core.PApplet;

public class Main extends PApplet {
	
	String [] palabras;
	
	ArrayList <Circulo> circulito;
	
	Circulo ellipse;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");

	}
	
	public void settings () {
		size (500, 500);
	}
	
	public void setup () {
		
		palabras = loadStrings ("../data/1.txt");
		circulito = new ArrayList <Circulo> ();
		
		
		for (int i = 0; i < palabras.length; i++) {
			circulito.add(new Circulo(300, 40, 1, 30, this));
		}
		
		
	}
	
	public void draw () {
		background (0);
		ellipse.draw();
		
	}
	
	public void mousePressed () {
		
	}

}

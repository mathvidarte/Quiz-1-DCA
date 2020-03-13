package Model;

import processing.core.PApplet;

public class Figura {
	int posX;
	int posY;
	int tam;
	int vel;
	int dir;
	PApplet app;
	int nombre;
	
	public Figura (int posX, int posY, int dir, int tam, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.tam = 20;
		this.vel = 2;
		this.dir = 1;
		this.app = app;
	}
	

	
	public void mover () {
	
	}



	public int getPosX() {
		return posX;
	}



	public void setPosX(int posX) {
		this.posX = posX;
	}



	public int getPosY() {
		return posY;
	}



	public void setPosY(int posY) {
		this.posY = posY;
	}



	public int getTam() {
		return tam;
	}



	public void setTam(int tam) {
		this.tam = tam;
	}



	public int getVel() {
		return vel;
	}



	public void setVel(int vel) {
		this.vel = vel;
	}



	public int getDir() {
		return dir;
	}



	public void setDir(int dir) {
		this.dir = dir;
	}



	public PApplet getApp() {
		return app;
	}



	public void setApp(PApplet app) {
		this.app = app;
	}



	public int getNombre() {
		return nombre;
	}



	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	
	
	

}

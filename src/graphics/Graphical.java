package graphics;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Graphical extends JFrame {

	private int x = 0;
	private int y = 0;
	
	public int width = 0;
	public int height = 0;
	
	private Image image;
	

	// Tile setup
	final int WIDTH_OF_TILE = 20;
	final int HEIGHT_OF_TILE = 15;

	private Object lock;

	public Graphical(int xStartTile, int yStartTile, String pathToImage) {

		this.x = xStartTile * WIDTH_OF_TILE;
		this.y = yStartTile * HEIGHT_OF_TILE;
		this.image = new ImageIcon(pathToImage).getImage();

		lock = new Object();
	}

	public boolean collidesWith(Graphical graphical) {

		synchronized (lock) {
		    if(this.getX() + this.width > graphical.getX()
		    		&& this.getX() < graphical.getX()+graphical.width){
		    	return true;
		    }
		    else  if(this.getY() + this.height > graphical.getY()
		    		&& this.getY() < graphical.getY()+graphical.height){
		    	return true;
		    }
		}
		return false;
	}

	public boolean collidesWith(Graphical[] graphicals) {

		for (Graphical g : graphicals) {
			if (this.collidesWith(g)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean overlapses(Graphical graphical) {

		synchronized (lock) {
		    if(this.getX() + this.width/2 > graphical.getX()
		    		&& this.getX() < graphical.getX()+graphical.width/2){
		    	return true;
		    }
		    else  if(this.getY() + this.height/2 > graphical.getY()
		    		&& this.getY() < graphical.getY()+graphical.height/2){
		    	return true;
		    }
		}
		return false;
	}
	
	public boolean overlapses(Graphical[] graphicals) {

		for (Graphical g : graphicals) {
			if (this.collidesWith(g)) {
				return false;
			}
		}
		return true;
	}

	public boolean setCoordinates(int x, int y) {

		synchronized (lock) {
			this.x = x;
			this.y = y;
		}
		return true;
	}

	public boolean setX(int x) {

		synchronized (lock) {
			this.x = x;
		}
		return true;
	}

	public boolean setY(int y) {
		
		synchronized (lock) {
			this.y = y;
		}
		return true;
	}

	public int getX() {

		int toReturn;

		synchronized (lock) {
			toReturn = x;
		}

		return toReturn;
	}

	public int getY() {

		int toReturn;

		synchronized (lock) {
			toReturn = y;
		}

		return toReturn;
	}
	
	public Image getImage() {

		Image toReturn;

		synchronized (lock) {
			toReturn = image;
		}

		return toReturn;
	}
}

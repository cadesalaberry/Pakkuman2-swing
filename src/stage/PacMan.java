package stage;

import java.awt.Image;

import backstage.Moveable;

public class PacMan extends Moveable {

	private int score;
	private int lives;
	private String mode;
	private Object lock;

	public PacMan(int x, int y, String pathToImage) {
		super(x, y, pathToImage);
		
		resetPacMan();
		
		lock = new Object();
	
	}

	public PacMan(int x, int y) {
		
		this(x,y,"assets/pacman.png");
	
	}
	
	private void resetPacMan() {
		score = 0;
		lives = 3;
		
	}
	
}
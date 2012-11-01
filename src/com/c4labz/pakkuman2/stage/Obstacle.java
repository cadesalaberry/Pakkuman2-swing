package com.c4labz.pakkuman2.stage;

public class Obstacle extends Graphical {

	/**
	 * Create an obstacle on the map at the coordinates specified.
	 * The unit is a tile. the pathToImage specifies where the image
	 * representing the obstacle is.
	 * 
	 * @param xStartTile
	 * @param yStartTile
	 * @param pathToImage
	 */
	public Obstacle(int xStartTile, int yStartTile, String pathToImage) {
		super(xStartTile, yStartTile, pathToImage);
	}
	
	/**
	 * Create an obstacle on the map at the coordinates specified,
	 * with the default icon. The unit is a tile. 
	 * 
	 * @param xStartTile
	 * @param yStartTile
	 */
	public Obstacle(int xStartTile, int yStartTile) {
		this(xStartTile, yStartTile, "./assets/Obstacle.png");
	}
	
	

}

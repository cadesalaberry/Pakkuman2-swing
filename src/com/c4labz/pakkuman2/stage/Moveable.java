package com.c4labz.pakkuman2.stage;

public class Moveable extends Graphical {

	private Direction direction;
	private Object lock;
	private int speed;

	public Moveable(int x, int y, String pathToImage) {
		super(x, y, pathToImage);

		direction = Direction.STOPPED;
		speed = 1;

		lock = new Object();
	}
	
	public void moveRight() {

	}
	
	public void moveUp() {

	}
	
	public void moveLeft() {

	}
	
	public void moveDown() {

	}
	@Deprecated
	private void move(Direction direction) {

	}
	
	private void setDirection(Direction direction){
		
		synchronized (lock) {

			this.direction = direction;
		}
		
	}
	public Direction getDirection() {

		Direction toReturn;

		synchronized (lock) {

			toReturn = direction;
		}

		return toReturn;
	}
	
	public int getSpeed() {

		int toReturn;

		synchronized (lock) {

			toReturn = speed;
		}

		return toReturn;
	}

}

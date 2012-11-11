package grid;

import java.awt.Image.*;
import java.util.ArrayList;

/**
 * 
 * @author Bilal Ait Slimane
 */
public class Location {

	private int row;
	private int column;
	private Object object;
	
	/**
	 * Creates a Location at the specified coordinates.
	 * @param row
	 * @param col
	 */
	public Location(int row, int col) {
		this.column = col;
		this.row = row;
		this.object = null;
	}

	/**
	 * @brief
	 * 
	 * @param
	 * 
	 * @return void
	 */
	public Location getAdjacentLocation(Direction direction) {

		int newColumn = this.column;
		int newRow = this.row;

		switch (direction) {
			case EAST: {
				newColumn += 1;
			}
			case WEST: {
				newColumn -= 1;
			}
			case NORTH: {
				newRow += 1;
			}
			case SOUTH: {
				newRow -= 1;
			}
			case STOPPED: {
			}
		}

		return new Location(newColumn, newRow);
	}

	/**
	 * @brief
	 * 
	 * @param
	 * 
	 * @return void
	 */
	public int getRow() {
		return this.row;
	}

	/**
	 * @brief
	 * 
	 * @param
	 * 
	 * @return void
	 */
	public int getColumn() {
		return this.column;
	}

	/**
	 * @brief
	 * 
	 * @param
	 * 
	 * @return void
	 */
	public void setObject(Object obj) {
		this.object = obj;
		// return this.object;
	}

	/**
	 * @brief
	 * 
	 * @param
	 * 
	 * @return void
	 */
	public Object getObject() {
		return this.object;
	}

	/**
	 * @brief
	 * 
	 * @param
	 * 
	 * @return void
	 */
	@Override
	public String toString() {
		return "Location:(" + this.row + "," + this.column + ")" + "=>"
				+ this.object + "\n";
	}
}

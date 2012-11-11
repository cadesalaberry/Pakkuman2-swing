package grid;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 
 * @author Bilal Ait Slimane
 */
public class BoundedGrid {
	private int maxRow;
	private int maxColumn;
	public ArrayList<Location> grid = new ArrayList<Location>();

	/**
	 * @brief
	 * 
	 * @param
	 * 
	 * @return void
	 */
	public BoundedGrid(int row, int col) {

		this.maxColumn = col;
		this.maxRow = row;

	}

	/**
	 * @brief
	 * 
	 * @param
	 * 
	 * @return void
	 */
	public int getNumRows() {
		return this.maxRow;
	}

	/**
	 * @brief
	 * 
	 * @param
	 * 
	 * @return void
	 */
	public int getNumCols() {
		return this.maxColumn;
	}

	/**
	 * @brief
	 * 
	 * @param
	 * 
	 * @return void
	 */
	public boolean isValid(Location loc) {
		
		boolean validColumn = 0 <= loc.getColumn() && loc.getColumn() < this.maxColumn;
		boolean validRow = 0<= loc.getRow() && loc.getRow() < this.maxRow;
		
		return  validColumn && validRow && loc != null;
	}

	/**
	 * @brief
	 * 
	 * @param
	 * 
	 * @return void
	 */
	public boolean isValid(int row, int col) {
		
		boolean validColumn = 0 <= col && col < this.maxColumn;
		boolean validRow = 0<= row && row < this.maxRow;
		
		return  validColumn && validRow;
	}
	/**
	 * @brief
	 * 
	 * @param
	 * 
	 * @return void
	 */
	public Object getObjectAtLocation(Location loc) {
		
		Object temp = null;
		
		if (isValid(loc) == true) {
		
			for (int i = 0; i < grid.size() && temp == null; i++) {
			
				if (grid.get(i).getColumn() == loc.getColumn()
						&& grid.get(i).getRow() == loc.getRow()) {
				
					if (grid.get(i).getObject() == null) {
						return null;
					}
					
					temp = grid.get(i).getObject();
				}
			}
		}
		return temp;
	}

	/**
	 * @brief
	 * 
	 * @param
	 * 
	 * @return void
	 */
	public Object putObjectAtLocation(Location loc, Object obj) {

		Object prevObject = null;
	
		if (isValid(loc) && obj != null) {
		
			if (grid.isEmpty()) {
				loc.setObject(obj);
				grid.add(loc);
			
			} else {
			
				for (int i = 0; i < grid.size(); i++) {
				
					if (grid.get(i).getColumn() == loc.getColumn()
							&& grid.get(i).getRow() == loc.getRow()) {
						prevObject = getObjectAtLocation(grid.get(i));
						grid.get(i).setObject(obj);
					
						return prevObject;
					}
				}
				
				loc.setObject(obj);
				grid.add(loc);
			}
		}
		return prevObject;
	}

	/**
	 * @brief
	 * 
	 * @param
	 * 
	 * @return void
	 */
	public Object removeObjectAtLocation(Location loc) {
		Object removedObject = null;
		if (isValid(loc) == true) {
			if (grid.isEmpty() == true) {
				return removedObject;
			}

			for (int i = 0; i < grid.size(); i++) {
				if (grid.get(i).getColumn() == loc.getColumn()
						&& grid.get(i).getRow() == loc.getRow()) {
					removedObject = getObjectAtLocation(loc);
					grid.get(i).setObject(null);
					return removedObject;
				}
			}
		}
		return removedObject;
	}

	/**
	 * @brief
	 * 
	 * @param
	 * 
	 * @return void
	 */
	public ArrayList<Location> getOccupiedLocations() {
		ArrayList<Location> temp = new ArrayList();
		for (int i = 0; i < grid.size(); i++) {
			if (grid.get(i).getObject() != null) {
				temp.add(grid.get(i));
			}
		}
		return temp;
	}

	 /**
     * @brief
     *
     * @param
     *
     * @return void
     */
    public ArrayList getAdjacentLocations(Location loc) {
        ArrayList<Location> adjacentS = new ArrayList();
        
        //Location adjacent = new Location(this.columnValue, this.rowValue);
        
        //get location North of current loc
        if (isValid(loc) == true) {

            adjacentS.add(getAdjacentLocation(Direction.EAST, getLocation(loc.getRow(), loc.getColumn())));
            adjacentS.add(getAdjacentLocation(Direction.WEST, getLocation(loc.getRow(), loc.getColumn())));
            adjacentS.add(getAdjacentLocation(Direction.NORTH, getLocation(loc.getRow(), loc.getColumn())));
            adjacentS.add(getAdjacentLocation(Direction.SOUTH, getLocation(loc.getRow(), loc.getColumn())));
           
        }
        return adjacentS;
    }
    
    
    /**
     * @brief
     *
     * @param
     *
     * @return void
     */
    public Location getAdjacentLocation(Direction direction, Location loc) {
        
       int newColumn = loc.getColumn();
       int newRow = loc.getRow();
      
       if(direction == Direction.EAST){
           newColumn += 1;
       }
       if(direction == Direction.WEST){
           newColumn -= 1;
       }
       if(direction == Direction.NORTH){
           newRow -= 1;
       }
       if(direction == Direction.SOUTH){
           newRow += 1;
       }
    
        return getLocation(newRow,newColumn);
    }
	/**
	 * @brief
	 * 
	 * @param
	 * 
	 * @return void
	 */
	public Location getLocation(int row, int col) {
		
		if (isValid(row,col)) {
			
			for(Location loc : grid){
				if (loc.getColumn() == col && loc.getRow() == row){
					return loc;
				}
			}
		}	
		return null;
	}

	/**
	 * NEEDS TO BE FIXED SOMEHOW
	 * 
	 * @brief
	 * 
	 * @param
	 * 
	 * @return void
	 */
	public char[][] read(int row, int col) {

		char[][] maze = new char[row][col];

		try {
			FileInputStream in = new FileInputStream("maps1.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			for (int j = 0; j < maze.length; j++) {
				maze[j] = br.readLine().replaceAll(" ", "").toCharArray();
			}
		} catch (Exception e) {
		}
		/*
		 * for (int k =0; k <maze.length;k++){
		 * 
		 * System.out.println(maze[k]); }
		 */
		return maze;
	}
}

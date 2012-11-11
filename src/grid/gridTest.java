package grid;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author ^_^
 */
public class gridTest {

    public static class Wall {

        private char w;

        public Wall() {
            w = '#';

        }
    }

    public static class MapObj {

        public char charVal;

        public MapObj() {
        }
    }

    public static void makeMap(char[][] grid, BoundedGrid world) {
        //BoundedGrid map = new BoundedGrid(row,col);
        for (int i = 0; i < world.getNumRows(); i++) {

            for (int j = 0; j < world.getNumCols(); j++) {

                Location wallLocation = new Location(i, j);

                MapObj mapObj = new MapObj();
                mapObj.charVal = grid[i][j];
                wallLocation.setObject(mapObj.charVal);
                world.grid.add(wallLocation);
            }
        }
    }

    public static void main(String args[]) {

        BoundedGrid world = new BoundedGrid(31, 28);
        makeMap(defaultMap.grid, world);

        /*
         Wall wallObj = new Wall();
       
         Location test = new Location(1,1);
         wallObj.w = 'B';
         //test.object=wallObj.w;  
         */

        //BOUNDEDGRID METHOD TESTER
     /*
         Location test1 = new Location(0,3);
         Wall wallObj1 = new Wall();
       
       
         //world.grid.add(test);
         //test1.object=wallObj.w;
       
         //world.grid.add(test);
       
         world.putObjectAtLocation(test,wallObj);
         //world.putObjectAtLocation(test1,wallObj1);
         world.removeObjectAtLocation(test1);
         */
        //System.out.println(world.grid);
        //System.out.println(world.put(test,wallObj1));
        //System.out.println(world.get(test));

        // LOCATION /ADJACENT LOCATION TEST //
     
         ArrayList<Location> testing = new ArrayList();
     
         int row = 3,col = 1;
         Location tester = world.getLocation(row,col);
         
         //Location tester1 = world.getAdjacentLocation(Direction.EAST, tester);
         
         testing = world.getAdjacentLocations(tester);
         
         
         Location testE = world.getAdjacentLocation(Direction.EAST,tester);
         Location testW = world.getAdjacentLocation(Direction.WEST,tester);
         Location testN = world.getAdjacentLocation(Direction.NORTH,tester);
         Location testS = world.getAdjacentLocation(Direction.SOUTH,tester);
         
        //Location testO = new Location(world.grid.get(29).rowValue,world.grid.get(28).columnValue);
        //Location testN = new Location(world.grid.get(29).rowValue,world.grid.get(28).columnValue);
        //Location testS = new Location(world.grid.get(29).rowValue,world.grid.get(28).columnValue);

        /*
         testE = world.grid.get(29).getAdjacentLocation(Direction.EAST);
         testO = world.grid.get(29).getAdjacentLocation(Direction.OUEST);
         testN = world.grid.get(29).getAdjacentLocation(Direction.NORTH);
         testS = world.grid.get(29).getAdjacentLocation(Direction.SOUTH);       
         */

        System.out.println(world.grid.toString());
        System.out.println(testing.toString());


    }
}
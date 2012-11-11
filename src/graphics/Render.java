package graphics;

import grid.BoundedGrid;
import grid.Location;
import grid.defaultMap;
import grid.GridTest.MapObj;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Render extends JPanel {

	Graphics g = null;
	Theme theme = null;
	
	public void Render() {
		
		Theme theme = new Theme();

	}

	@Override
	public void paintComponent(Graphics g) {
		
		this.g = g;
		super.paintComponent(g);
		Graphics g2d = (Graphics) g;
		
		//drawMap(defaultMap.grid);
		
		

	}
	
	public void drawMap(char[][] map){
		BoundedGrid field = new BoundedGrid(31,28);
		
		for (int i = 0; i < field.getNumRows(); i++) {

            for (int j = 0; j < field.getNumCols(); j++) {

                Location wallLocation = new Location(i, j);
                char tile = map[i][j];
                
                if (tile == '#'){
                   	wallLocation.setObject(theme.getInkyImage());
                }
                else if(tile == '.'){
                	wallLocation.setObject(theme.getDotImage());
                }
         
            }
        }
	}
}

package graphics;

import static org.junit.Assert.*;

import java.awt.Image;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.Test;

public class ThemeTest {

	@Test
	public void testThemeFolder() {
		
		Theme theme = new Theme("default");
		
		assertTrue(theme.pacmanIcon.getIconHeight() != -1);
		assertTrue(theme.pacmanIcon.getIconWidth() != -1);
	}

	@Test
	public void testTheme() {
		
		Theme theme = new Theme();

		assertTrue(theme.pacmanIcon.getIconHeight() != -1);
		assertTrue(theme.pacmanIcon.getIconWidth() != -1);
	}
	
	
	/**
	 * Tests if the Images are in the right order.
	 */
	@Test
	public void testgetImages() {
		
		Theme theme = new Theme();
		ArrayList<Image> images = theme.getImages();
		
		assertEquals(0,images.indexOf(theme.getPacmanImage()));
		assertEquals(1,images.indexOf(theme.getBlinkyImage()));
		assertEquals(2,images.indexOf(theme.getClydeImage()));
		assertEquals(3,images.indexOf(theme.getInkyImage()));
		assertEquals(4,images.indexOf(theme.getPinkyImage()));
		assertEquals(5,images.indexOf(theme.getWallImage()));
		
	}
}

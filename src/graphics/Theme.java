/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

/**
 *
 * @author ^_^
 */

import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Theme {

	// Pacman Graphics.
	public ImageIcon pacmanIcon;

	// Ghosts Graph.
	public ImageIcon blinkyIcon;
	public ImageIcon clydeIcon;
	public ImageIcon inkyIcon;
	public ImageIcon pinkyIcon;
	public ImageIcon wallIcon;

	public String name;

	/**
	 * Loads the theme contained in the specified folder.
	 * 
	 * @param folder
	 */
	public Theme(String folder) {

		loadImagesFromFolder(folder);

	}

	/**
	 * Loads the default theme.
	 * 
	 */
	public Theme() {

		this("default");

	}

	private void loadImagesFromFolder(String folder) {

		this.name = folder;
		
		// Loads the theme path.
		String path = this.getClass().getResource("../assets/" + folder + "/")
				.toString();

		try {
			pacmanIcon = new ImageIcon(new URL(path + "pacman.png"));
			blinkyIcon = new ImageIcon(new URL(path + "blinky.png"));
			clydeIcon = new ImageIcon(new URL(path + "clyde.png"));
			pinkyIcon = new ImageIcon(new URL(path + "pinky.png"));
			inkyIcon = new ImageIcon(new URL(path + "inky.png"));
			wallIcon = new ImageIcon(new URL(path + "wall.png"));

			checkValidity(pacmanIcon);
			checkValidity(blinkyIcon);
			checkValidity(clydeIcon);
			checkValidity(pinkyIcon);
			checkValidity(inkyIcon);

		} catch (MalformedURLException e) {

			System.err
					.println("Invalid character found while accessing PNG File(s).");
		}
	}

	/**
	 * Checks if the image has properly been loaded fron the file.
	 * 
	 * @param icon
	 */
	private void checkValidity(ImageIcon icon) {

		if (icon.getIconHeight() == -1) {
			System.err.println("Invalid input image in theme "
					+ this.name);
		}
	}

	/**
	 * Returns Pacman Sprites.
	 * 
	 * @return image
	 */
	public Image getPacmanImage() {
		return pacmanIcon.getImage();
	}

	public Image getBlinkyImage() {
		return blinkyIcon.getImage();
	}

	public Image getClydeImage() {
		return clydeIcon.getImage();
	}

	public Image getInkyImage() {
		return inkyIcon.getImage();
	}

	public Image getPinkyImage() {
		return pinkyIcon.getImage();
	}
	
	public Image getWallImage() {
		return wallIcon.getImage();
	}

	/**
	 * Returns an ArrayList containing all the sprites.
	 * 
	 * In order you have: Pacman, Blinky, Clyde, Inky, Pinky, Wall.
	 * @return
	 */
	
	public ArrayList<Image> getImages() {

		ArrayList<Image> images = new ArrayList<>();

		images.add(getPacmanImage());
		images.add(getBlinkyImage());
		images.add(getClydeImage());
		images.add(getInkyImage());
		images.add(getPinkyImage());
		images.add(getWallImage());

		return images;
	}
}
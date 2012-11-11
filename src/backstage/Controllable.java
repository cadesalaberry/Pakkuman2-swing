package backstage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controllable extends Moveable implements KeyListener {

	public Controllable(int x, int y, String pathToImage) {
		super(x, y, pathToImage);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {

		switch (e.getKeyCode()) {
			case KeyEvent.VK_RIGHT: {
				moveRight();
				break;
			}
			case KeyEvent.VK_UP: {
				moveUp();
				break;
			}
			case KeyEvent.VK_LEFT: {
				moveLeft();
				break;
			}
			case KeyEvent.VK_DOWN: {
				moveDown();
				break;
			}
			case KeyEvent.VK_D: {
				moveRight();
				break;
			}
			case KeyEvent.VK_W: {
				moveUp();
				break;
			}
			case KeyEvent.VK_A: {
				moveLeft();
				break;
			}
			case KeyEvent.VK_S: {
				moveDown();
				break;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

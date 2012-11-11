import javax.swing.JFrame;

import graphics.Render;

public class Pakkuman2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		Render renderer = new Render();

		f.add(renderer);

		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(33 * 16, 34 * 16);
	}

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;
import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
/**
 *
 * @author ^_^
 */
public class Animations extends JPanel implements ActionListener {
    //Themes images = new Themes();
    private Timer animator1;
    private ImageIcon imageArray[];
    private int delay = 50, totalFrames = 5,   currentFrame = 0;
    
        public Animations(){
            Theme images = new Theme();
            imageArray = new ImageIcon[totalFrames];
            
            //imageArray[0] = images.pacmanRight1;
            //imageArray[1] = images.pacmanRight2;
            //imageArray[2] = images.pacmanRight3;
            //imageArray[3] = images.pacmanRight4;
            imageArray[0] = new ImageIcon("Pac00.png");
            imageArray[1] = new ImageIcon("Pac01.png");
            imageArray[2] = new ImageIcon("Pac02.png");
            imageArray[3] = new ImageIcon("Pac03.png");
 
            
            animator1 = new Timer(delay,this);
            animator1.start();
        }
    
   
    @Override
        public void paint(Graphics g){
            super.paint(g);
            g.setColor(Color.red);
            g.fillRect(100, 100, 100, 100);
            /*
            imageArray[0].paintIcon(this, g,50,50);
            if (currentFrame >= imageArray.length){
                currentFrame =0;
            }
            currentFrame++;
            //imageArray[currentFrame].paintIcon(this,g,50,50);
            */
        }
        /*
        public  void actionsPerformed(ActionEvent e){
            
        }*/

   
    public void actionPerformed(ActionEvent e) {
        repaint();
        
       
    }
}

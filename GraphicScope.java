/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingcircle;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author ajouliakram
 */
public class GraphicScope extends JPanel{
    public int x = 150;
    public void decrease(){
        x-=10; // x=x-10;
    }
    public void increase(){
        x+=10; // x=x+10;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.blue);
        
        g.setColor(Color.white);
        g.fillRect(x-10, 10, 60, 40);
        g.fillRect(x+50, 20, 35, 25);
        g.setColor(Color.red);
        g.fillOval(x, 40, 20, 20);
        g.fillOval(x+40, 40, 20, 20);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingcircle;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ajouliakram
 */
public class MoveCircle extends JFrame{
    
    private JButton moveleft;
    private JButton moveright;
    private GraphicScope graphicPanel;
    private JButton Go_back;
    public MoveCircle(){
        super("Move a circle");
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        moveleft = new JButton("Move Left");
        moveright = new JButton("Move Right");
        Go_back = new JButton("go Back");
        buttonsPanel.add(moveleft);
        buttonsPanel.add(moveright);
        buttonsPanel.add(Go_back);
        
        graphicPanel = new GraphicScope();
        
        add(graphicPanel,BorderLayout.CENTER);
        add(buttonsPanel,BorderLayout.SOUTH); 
        
        MoveHandler handler =  new MoveHandler();
        moveleft.addActionListener(handler);
        moveright.addActionListener(handler);
      }  
             
       private class MoveHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource()==moveleft){
               graphicPanel.decrease();
               graphicPanel.repaint();
           } 
           else if(e.getSource()==moveright){
               graphicPanel.increase();
               graphicPanel.repaint();
           }
        }
           
       } 
      
    
    
}

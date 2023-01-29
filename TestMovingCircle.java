/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingcircle;

import javax.swing.JFrame;

/**
 *
 * @author ajouliakram
 */
public class TestMovingCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MoveCircle mvc = new MoveCircle();
        mvc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mvc.setSize(600,400);
        mvc.setVisible(true);
    }
    
}

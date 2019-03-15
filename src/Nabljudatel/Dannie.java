/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nabljudatel;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author user
 */
public class Dannie {
    
JFrame frame;

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Can I press this button???");
         
        button.addActionListener(new People1());
        button.addActionListener(new People2());

        frame.getContentPane().add(BorderLayout.CENTER, button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(200, 200);
        frame.setVisible(true);

    }

}
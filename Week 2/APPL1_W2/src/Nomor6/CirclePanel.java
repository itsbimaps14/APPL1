/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nomor6;

/**
 *
 * Author = Bima Putra S | 191524038 | D4-1B "2019
 * Politeknik Negeri Bandung
 * Tanggal : 22 Maret 2021
 * Deskripsi : Enhancing a Movable Circle - Nomor 4 || A panel with a circle 
 * drawn in the center and buttons on the bottom that move the circle.
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CirclePanel extends JPanel{
    private final int CIRCLE_SIZE = 50;
    private int x,y;
    private Color c;
    int panelWidth, panelHeight;
    
    // Create buttons to move the circle
    // Dipindahin ke atas biar actionListener bisa modify object button
    JButton left = new JButton("Left");
    JButton right = new JButton("Right");
    JButton up = new JButton("Up");
    JButton down = new JButton("Down");
    
    //---------------------------------------------------------------
    // Set up circle and buttons to move it.
    //---------------------------------------------------------------
    public CirclePanel(int width, int height){
        // Set coordinates so circle starts in middle
        x = (width/2)-(CIRCLE_SIZE/2);
        y = (height/2)-(CIRCLE_SIZE/2);
        c = Color.green;
        panelHeight = height;
        panelWidth = width;

        // Need a border layout to get the buttons on the bottom
        this.setLayout(new BorderLayout());

        // Add listeners to the buttons
        left.addActionListener(new MoveListener(-20,0));
        right.addActionListener(new MoveListener(20,0));
        up.addActionListener(new MoveListener(0,-20));
        down.addActionListener(new MoveListener(0,20));

        // Need a panel to put the buttons on or they'll be on
        // top of each other.
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(left);
        buttonPanel.add(right);
        buttonPanel.add(up);
        buttonPanel.add(down);

        // Add Mnemonic - ke object button
        left.setMnemonic(KeyEvent.VK_L);
        up.setMnemonic(KeyEvent.VK_U);
        right.setMnemonic(KeyEvent.VK_R);
        down.setMnemonic(KeyEvent.VK_D);

        // Add Tooltip - ke object button
        left.setToolTipText("Move circle left 20 px");
        up.setToolTipText("Move circle up 20 px");
        right.setToolTipText("Move circle right 20 px");
        down.setToolTipText("Move circle down 20 px");

        // Add the button panel to the bottom of the main panel
        this.add(buttonPanel, "South");
    }

    //---------------------------------------------------------------
    // Draw circle on CirclePanel
    //---------------------------------------------------------------
    public void paintComponent(Graphics page){
        super.paintComponent(page);
        page.setColor(c);
        page.fillOval(x,y,CIRCLE_SIZE,CIRCLE_SIZE);
    }
    
    //---------------------------------------------------------------
    // Class to listen for button clicks that move circle.
    //---------------------------------------------------------------
    private class MoveListener implements ActionListener{
        private int dx;
        private int dy;
        
        //---------------------------------------------------------------
        // Parameters tell how to move circle at click.
        //---------------------------------------------------------------
        public MoveListener(int dx, int dy){
            this.dx = dx;
            this.dy = dy;
        }
        
        //---------------------------------------------------------------
        // Change x and y coordinates and repaint.
        //---------------------------------------------------------------
        public void actionPerformed(ActionEvent e){
            x += dx;
            y += dy;
            repaint();
            
            // Check batas kiri ketika action dilakukan
            if(x - CIRCLE_SIZE < 0){
                left.setEnabled(false);
            }
            else{
                left.setEnabled(true);
            }
            
            // Check batas kanan ketika action dilakukan
            if(x + CIRCLE_SIZE > panelWidth){
                right.setEnabled(false);
            }
            else{
                right.setEnabled(true);
            }
            
            // Check batas atas ketika action dilakukan
            if(y - CIRCLE_SIZE < 0){
                up.setEnabled(false);
            }
            else{
                up.setEnabled(true);
            }
            
            // Check batas bawah ketika action dilakukan
            if(y + CIRCLE_SIZE > panelHeight){
                down.setEnabled(false);
            }
            else{
                down.setEnabled(true);
            }
        }
    }
}
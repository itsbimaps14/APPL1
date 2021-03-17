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
 * Tanggal : 15 Maret 2021
 * Deskripsi : Nomor 6 - Coloring a Movable Circle
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CirclePanel extends JPanel{
    private final int CIRCLE_SIZE = 50;
    private int x,y;
    private Color c;
    JButton warna = new JButton("Choose Color");
    
    //---------------------------------------------------------------
    // Set up circle and buttons to move it.
    //---------------------------------------------------------------
    public CirclePanel(int width, int height){
        // Set coordinates so circle starts in middle
        x = (width/2)-(CIRCLE_SIZE/2);
        y = (height/2)-(CIRCLE_SIZE/2);
        c = Color.green;
        
        // Need a border layout to get the buttons on the bottom
        this.setLayout(new BorderLayout());
        
        // Create buttons to move the circle
        JButton left = new JButton("Left");
        JButton right = new JButton("Right");
        JButton up = new JButton("Up");
        JButton down = new JButton("Down");
        
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
        
        // Add the button panel to the bottom of the main panel
        this.add(buttonPanel, "South");
        
        // (Nomor 1) Membuat button dan memberi nama labeh buttonnya.
        JButton cyan = new JButton("Cyan");
        JButton magenta = new JButton("Ungu");
        JButton orange = new JButton("Orange");
        JButton white = new JButton("White");
        
        // (Pertanyaan 1) Menambahkan action event listeners ke object button
        cyan.addActionListener(new ColorListener(Color.cyan));
        magenta.addActionListener(new ColorListener(Color.magenta));
        warna.addActionListener(new ColorListener(null));
        orange.addActionListener(new ColorListener(Color.orange));
        white.addActionListener(new ColorListener(Color.white));
        
        // (Pertanyaan 2) Set Warna Background
        cyan.setBackground(Color.cyan);
        magenta.setBackground(Color.magenta);
        orange.setBackground(Color.orange);
        white.setBackground(Color.white);
        
        // Buat panel agar tidak saling timpa
        JPanel buttonPanelColor = new JPanel();
        buttonPanelColor.add(cyan);
        buttonPanelColor.add(magenta);
        buttonPanelColor.add(warna);
        buttonPanelColor.add(orange);
        buttonPanelColor.add(white);
        
        // Tambah panel dibagian atas (North)
        this.add(buttonPanelColor, "North");
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
        }
    }
    
    //---------------------------------------------------------------
    // Class to listen for button clicks that change color of the circle.
    //---------------------------------------------------------------
    private class ColorListener implements ActionListener{
        private Color color;
        //---------------------------------------------------------------
        // Parameters tell how to move circle at click.
        //---------------------------------------------------------------
        public ColorListener(Color a){
            this.color = a;
        }
        //---------------------------------------------------------------
        // (Pertanyaan 3)
        // (Select Manual Warna)
        //---------------------------------------------------------------
        public void actionPerformed(ActionEvent e){
            // Jika warna ada c nya di isi pilihan
            if(color != null){
                c = color;
            }
            // Jika parameter null = milih warna, gunakan JColorChooser
            else{
                c = JColorChooser.showDialog(warna, "JColorChooser", c);
            }
            
            repaint();
        }
    }
} 
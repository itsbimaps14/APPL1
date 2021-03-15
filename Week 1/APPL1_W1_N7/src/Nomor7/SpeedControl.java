/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nomor7;

/**
 *
 * Author = Bima Putra S | 191524038 | D4-1B "2019
 * Politeknik Negeri Bandung
 * Tanggal :
 * Deskripsi :
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SpeedControl{
    // -------------------------------------
    // Sets up the frame for the animation.
    // -------------------------------------
    public static void main(String[] args){
        JFrame frame = new JFrame ("Bouncing Balls");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane.add(new SpeedControlPanel ());
        frame.pack();
        frame.setVisible(true);
    }
} 
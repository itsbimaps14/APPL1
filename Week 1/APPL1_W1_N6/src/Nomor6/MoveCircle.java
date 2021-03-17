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
public class MoveCircle{
    //-----------------------------------
    // Set up a frame for the GUI.
    //-----------------------------------
    public static void main(String[] args){
        JFrame frame = new JFrame ("MoveCircle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500,375));
        frame.getContentPane().add(new CirclePanel(400,300));
        frame.pack();
        frame.setVisible(true);
    }
}

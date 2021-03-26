/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nomor8;

/**
 *
 * Author = Bima Putra S | 191524038 | D4-1B "2019
 * Politeknik Negeri Bandung
 * Tanggal : 26 Maret 2021
 * Deskripsi : Generates a list of primes less than or equal to the integer
 * input by the user.
 */

import java.awt.*;
import javax.swing.*;

public class Primes{
    public static void main (String[] args){
    JFrame frame = new JFrame ("Primes");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    PrimePanel primePanel = new PrimePanel ();
    frame.getContentPane().add(primePanel);
    frame.pack();
    frame.setVisible(true);
    }
}

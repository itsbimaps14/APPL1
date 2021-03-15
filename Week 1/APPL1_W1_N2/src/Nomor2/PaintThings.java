/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

import java.text.DecimalFormat;

/**
 *
 * @author Bima
 */
public class PaintThings {
    public static void main(String[] args) {
        // TODO code application logic here
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        Rectangle deck;
        Sphere bigBall;
        Cylinder tank;
        double deckAmt, ballAmt, tankAmt;
        
        // Tambahan Script
        deck = new Rectangle(20, 35);
        bigBall = new Sphere(15);
        tank = new Cylinder(10, 30);
        
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);

        System.out.println("\nJumlah paint yang dibutuhkan : ...");
        System.out.println("Deck     : " + deckAmt);
        System.out.println("Big Ball : " + ballAmt);
        System.out.println("Tank     : " + tankAmt);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

/**
 *
 * @author Bima
 */
public class Paint {
    private double coverage; //number of square feet per gallon
    
    public Paint(double c){
        coverage = c;
    }
    
    public double amount(Shape s){
        System.out.println ("Menghitung Paint yang Dibutuhkan Untuk " + s);
        return s.area()/coverage;
    } 
}

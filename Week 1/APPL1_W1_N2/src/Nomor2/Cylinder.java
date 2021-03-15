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
public class Cylinder extends Shape{
    private double radius;
    private double height;
    
    public Cylinder(double r, double h){
        super("Cylinder");
        radius = r;
        height = h;
    }
    
    @Override
    public double area(){
        return Math.PI*radius*radius*height;
    }
    
    @Override
    public String toString(){
        String result = super.toString() +
                "\n   Radius : " + radius +
                "\n   Height : " + height;
        return result;
    }
}

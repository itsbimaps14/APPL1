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
public class Rectangle extends Shape{
    private double width;
    private double length;
    
    public Rectangle(int w, int l){
        super("Rectangle");
        width = w;
        length = l;
    }
    
    @Override
    public double area(){
        return width * length;
    }
    
    @Override
    public String toString(){
        String result = super.toString() +
                "\n   Length : " + length +
                "\n   Width  : " + width;
        return result;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

/**
 *
 *
 * Author = Lewis/Loftus edited by Bima Putra S | 191524038 | D4-1B "2019
 * Politeknik Negeri Bandung
 * Tanggal : 15 Maret 2021
 * Deskripsi : Jawaban pertanyaan 1
 */

abstract public class Shape {
    protected String shapeName;
    public Shape(String shape){
        this.shapeName = shape;
    }
    
    public abstract double area();
    
    @Override
    public String toString(){
        return "Shape Name : " + shapeName;
    }
}
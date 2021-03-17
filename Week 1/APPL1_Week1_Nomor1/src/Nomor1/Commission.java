/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nomor1;

/**
 *
 *
 * Author = Lewis/Loftus edited by Bima Putra S | 191524038 | D4-1B "2019
 * Politeknik Negeri Bandung
 * Tanggal : 15 Maret 2021
 * Deskripsi : Commision class. 
 */

public class Commission extends Hourly{
    // Memiliki 2 instance var (total sales, commision rate)
    private double totSales;
    private double commsRate;
    
    // Constructor memiliki 6 parameter (5 untuk superclass, 1 untuk class),
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double cRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commsRate = cRate;
    }
    
    // Add Method addSales
    public void addSales(double totalSales){
        totSales = totalSales;
    }
    
    // Method pay menghitung total gaji
    @Override
    public double pay(){
        double temp = totSales * commsRate;
        totSales = 0;
        return super.pay() + temp;
    }
    
    // Output toString Methods
    public String toString(){
        String result = super.toString();
        result += "\nTotal sales: " + totSales;
        return result;
    }
    
}

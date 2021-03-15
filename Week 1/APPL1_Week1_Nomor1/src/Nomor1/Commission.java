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
    private double totSales;
    private double commsRate;
    
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double cRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commsRate = cRate;
    }
    
    public void addSales(double totalSales){
        totSales = totalSales;
    }
    
    @Override
    public double pay(){
        double temp = totSales * commsRate;
        totSales = 0;
        return super.pay() + temp;
    }
    
    public String toString(){
        String result = super.toString();
        result += "\nTotal sales: " + totSales;
        return result;
    }
    
}

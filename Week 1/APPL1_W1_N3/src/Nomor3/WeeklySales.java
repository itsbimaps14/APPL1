/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor3;

import java.util.Scanner;

/**
 *
 * @author Bima
 */

public class WeeklySales {
    public static void main(String[] args){
        int i, size, sales;
        String f, l;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("\nHow many sales : ");
        size = scan.nextInt();
        
        Salesperson[] salesStaff = new Salesperson[size];
        
        for (i = 0; i < size; i++){
            System.out.print ("\nSales "+i+1);
            System.out.print ("\n\tFirst Name\t: ");
            f = scan.next();
            System.out.print ("\tLast Name\t: ");
            l = scan.next();
            System.out.print ("\tTotal Sales\t: ");
            sales = scan.nextInt();
            
            //Deklarasi
            salesStaff[i] = new Salesperson(f, l, sales);
        }
        
        Sorting.insertionSort(salesStaff);
        System.out.println ("\nRanking of Sales for the Week\n");
        for (Salesperson s : salesStaff)
            System.out.println (s);
    }
}

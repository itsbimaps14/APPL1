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

// Nomor 3 - a (Class Number.java yang berfungsi untuk mengurutkan Array of Integer)
public class Numbers {
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] intList;
        int size;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("\nBerapa jumlah array list yang dimasukkan : ");
        size = scan.nextInt();
        intList = new Integer[size];
        
        System.out.println ("\nMasukkan angka yg akan diurutkan : ");
        for (int i = 0; i < size; i++){
            intList[i] = scan.nextInt();
        }
        
        Sorting.insertionSort(intList);
        
        System.out.println ("\nAngka setelah diurutkan : ");
        for (int i = 0; i < size; i++){
            System.out.print(intList[i] + " ");
        }
        
        System.out.println (); 
    }
}

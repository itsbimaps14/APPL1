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

// Nomor 3 - b (Class String.java yang berfungsi untuk mengurutkan Object String)

public class Strings {
    public static void main(String[] args) {
        // TODO code application logic here
        String[] strList;
        int size;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("\nBerapa jumlah string list yang dimasukkan : ");
        size = scan.nextInt();
        strList = new String[size];
        
        System.out.println ("\nMasukkan string yg akan diurutkan : .");
        for (int i = 0; i < size; i++){
            strList[i] = scan.next();
        }
        
        Sorting.insertionSort(strList);
        
        System.out.println ("\nString setelah diurutkan : ");
        for (int i = 0; i < size; i++){
            System.out.print(strList[i] + " ");
        }
        
        System.out.println (); 
    }
}

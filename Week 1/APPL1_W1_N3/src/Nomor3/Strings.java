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
public class Strings {
    public static void main(String[] args) {
        // TODO code application logic here
        String[] strList;
        int size;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("\nHow many string do you want to sort? ");
        size = scan.nextInt();
        strList = new String[size];
        
        System.out.println ("\nEnter the string...");
        for (int i = 0; i < size; i++){
            strList[i] = scan.next();
        }
        
        Sorting.insertionSort(strList);
        
        System.out.println ("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++){
            System.out.print(strList[i] + " ");
        }
        
        System.out.println (); 
    }
}

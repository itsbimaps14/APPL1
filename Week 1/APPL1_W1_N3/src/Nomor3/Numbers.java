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
public class Numbers {
    public static void main(String[] args) {
        // TODO code application logic here
        // Perubahan int menjadi integer
        Integer[] intList;
        int size;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size];
        
        System.out.println ("\nEnter the numbers...");
        for (int i = 0; i < size; i++){
            intList[i] = scan.nextInt();
        }
        
        Sorting.insertionSort(intList);
        
        System.out.println ("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++){
            System.out.print(intList[i] + " ");
        }
        
        System.out.println (); 
    }
}

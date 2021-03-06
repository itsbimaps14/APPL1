/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nomor1;

/**
 *
 * Author = Bima Putra S | 191524038 | D4-1B "2019
 * Politeknik Negeri Bandung
 * Tanggal : 22 Maret 2021
 * Deskripsi : Exceptions Aren't Always Errors - Nomor 1
 */

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args){
        int[] counts = new int[26];
        
        Scanner scan = new Scanner(System.in);
        
        // Ambil inputan dari user
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();
        
        // Convert to UPPERCASE
        word = word.toUpperCase();
        
        // Menghitung masing masing Karakter
        try{
            for (int i=0; i < word.length(); i++)
                counts[word.charAt(i)-'A']++;
                //print frequencies
                System.out.println();
            for (int i=0; i < counts.length; i++)
                if (counts [i] != 0)
                    System.out.println((char)(i +'A') + ": " + counts[i]);
        }
        catch (Exception e){
            System.out.println("Not a Letter");
    	}
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nomor2;

/**
 *
 * Author = Bima Putra S | 191524038 | D4-1B "2019
 * Politeknik Negeri Bandung
 * Tanggal : 22 Maret 2021
 * Deskripsi : Placing Exception Handlers - Nomor 2
 */

import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args){
        int val, sum=0;
        Scanner scan = new Scanner(System.in);
        String line;
        
        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());
        
        while (scanLine.hasNext()){
            val = Integer.parseInt(scanLine.next());
            sum += val;
            try{
                val = Integer.parseInt(scanLine.next());
                sum += val;
            }
            catch (Exception e){
                //Do Nothing
            }
        }
        System.out.println("The sum of the integers on this line is " + sum);
    }
}

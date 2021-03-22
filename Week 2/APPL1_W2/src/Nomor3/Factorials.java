/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nomor3;

/**
 *
 * Author = Bima Putra S | 191524038 | D4-1B "2019
 * Politeknik Negeri Bandung
 * Tanggal : 22 Maret 2021
 * Deskripsi : Throwing Exceptions - Nomor 3
 */

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args){
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        
        while (keepGoing.equals("y") || keepGoing.equals("Y")){
            System.out.print("Enter an integer: ");
            int val = scan.nextInt();
            try{
                System.out.println("Factorial(" + val + ") = "+ MathUtils.factorial(val));
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
    }
}

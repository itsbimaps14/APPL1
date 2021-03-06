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
 * Tanggal :
 * Deskripsi :
 */

public class MathUtils {
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static int factorial(int n){
        // Aturan 2 dan 3
        if(n>=0 && n <=16){
            // Aturan 1 (karena 0 tidak masuk ke fungsi 
            // for maka nilai hasil default 1)
            int fac = 1;
            for (int i=n; i>0; i--)
                fac *= i;
            return fac;
        }
        else if(n>16){
            throw new IllegalArgumentException("Maximum Integer is 16");
        }
        else {
            throw new  IllegalArgumentException("Factorial is not available "
                    + "for negative integers");
        }
    }
} 
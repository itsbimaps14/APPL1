/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nomor4;

/**
 *
 * Author = Bima Putra S | 191524038 | D4-1B "2019
 * Politeknik Negeri Bandung
 * Tanggal : 22 Maret 2021
 * Deskripsi : Copying a File - Nomor 4
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        boolean found = false;
        
        // Scanner input file
        Scanner input = new Scanner(System.in);
        
        // Check file ada . tidak
        Scanner in = null;
        while(!found){
            System.out.println("\nMasukkan Address File : ");
            String address = input.nextLine();
            File file = new File(address);
            try {
                in = new Scanner(file);
            }
            catch (FileNotFoundException e) {
                System.out.println("File Tidak Ditemukan");
            }
            finally {
                if (in != null){
                    found = true;
                }
            }
        }
        
        // Membaca file
        int linenum = 1;
        while(in.hasNext()){
            System.out.println("line " + linenum + " : " 
            + in.nextLine());
            linenum++;
        }
    }
}
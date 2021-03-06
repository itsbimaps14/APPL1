/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nomor5;

/**
 *
 * Author = Bima Putra S | 191524038 | D4-1B "2019
 * Politeknik Negeri Bandung
 * Tanggal : 15 Maret 2021
 * Deskripsi : Soal 5 - Timing Searching and Sorting Algorithms 
 */

import java.util.Scanner;

public class IntegerListTest{
    static IntegerList list = new IntegerList(10);
    static Scanner scan = new Scanner(System.in);
    
    //------------------------------------------------------
    // main -- creates an initial list, then repeatedly prints
    // the menu and does what the user asks until they quit
    //------------------------------------------------------
    public static void main(String[] args){
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0){
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }
    
    //------------------------------------------------------
    // dispatch -- takes a choice and does what needs doing
    //------------------------------------------------------
    public static void dispatch(int choice){
        int loc;
        int val;
        long time_awal, time_akhir;

        switch(choice){
            case 0:
                System.out.println("Bye!");
                break;

            case 1:
                System.out.println(list);
                break;

            case 2:
                System.out.println("How big should the list be?");
                list = new IntegerList(scan.nextInt());
                System.out.println("List is created."); 
                break;

            case 3:
                list.randomize();
                System.out.println("List is filled with random elements.");
                break;

            case 4:
                list.fillSorted();
                System.out.println("List is filled with sorted elements.");
                break;

            case 5:
                System.out.print("Enter the value to look for: ");
                val = scan.nextInt();
                time_awal = System.currentTimeMillis();
                loc = list.linearSearch(val);
                time_akhir = System.currentTimeMillis();
                if (loc != -1)
                    System.out.println("Found at location " + loc);
                else
                    System.out.println("Not in list");
                System.out.println("Waktu yang dibutuhkan : " + (time_akhir - time_awal));
                break;

            case 6:
                System.out.print("Enter the value to look for: ");
                val = scan.nextInt();
                time_awal = System.currentTimeMillis();
                loc = list.binarySearch(val);
                time_akhir = System.currentTimeMillis();
                if (loc != -1)
                    System.out.println("Found at location " + loc);
                else
                    System.out.println("Not in list");
                System.out.println("Waktu yang dibutuhkan : " + (time_akhir - time_awal));
                break;

            case 7:
                time_awal = System.currentTimeMillis();
                list.sortIncreasing();
                time_akhir = System.currentTimeMillis();
                System.out.println("List has been sorted.");
                System.out.println("Waktu yang dibutuhkan : " + (time_akhir - time_awal));
                break;

            case 8:
                time_awal = System.currentTimeMillis();
                list.sortDecreasing();
                time_akhir = System.currentTimeMillis();
                System.out.println("List has been sorted.");
                System.out.println("Waktu yang dibutuhkan : " + (time_akhir - time_awal));
                break;

            default:
                System.out.println("Sorry, invalid choice");
        }
    }
    //------------------------------------------------------
    // printMenu -- prints the user's choices
    //------------------------------------------------------
    public static void printMenu(){
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Print the list");
        System.out.println("2: Create a new list of a given size");
        System.out.println("3: Fill the list with random ints in range 1-length");
        System.out.println("4: Fill the list with already sorted elements");
        System.out.println("5: Use linear search to find an element");
        System.out.println("6: Use binary search to find an element " +
            "(list must be sorted in increasing order)");
        System.out.println("7: Use selection sort to sort the list into " +
            " increasing order");
        System.out.println("8: Use insertion sort to sort the list into " +
            " decreasing order");
        System.out.print("\nEnter your choice: ");
    }
}
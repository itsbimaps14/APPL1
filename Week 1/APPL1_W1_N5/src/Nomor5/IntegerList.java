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
public class IntegerList{
    int[] list; //values in the list
    
    //------------------------------------------------------------
    // Constructor -- takes an integer and creates a list of that
    // size. All elements default to value 0.
    //------------------------------------------------------------
    public IntegerList(int size){
        list = new int[size];
    }
    
    //------------------------------------------------------------
    // randomize -- fills the array with randomly generated integers
    // between 1 and 100, inclusive
    //------------------------------------------------------------
    public void randomize(){
        int max = list.length;
        for (int i=0; i<list.length; i++)
        list[i] = (int)(Math.random() * max) + 1;
    }
    
    //------------------------------------------------------------
    // fillSorted -- fills the array with sorted values
    //------------------------------------------------------------
    public void fillSorted(){
        for (int i=0; i<list.length; i++)
        list[i] = i + 2;
    }
    
    //------------------------------------------------------------
    // print -- prints array elements with indices, one per line
    //------------------------------------------------------------
    @Override
    public String toString(){
        String s = "";
        for (int i=0; i<list.length; i++)
        s += i + ":\t" + list[i] + "\n";
        return s;
    }
    //------------------------------------------------------------
    // linearSearch -- takes a target value and returns the index
    // of the first occurrence of target in the list. Returns -1
    // if target does not appear in the list
    //------------------------------------------------------------
    public int linearSearch(int target){
        int location = -1;
        for (int i=0; i<list.length && location == -1; i++)
            if (list[i] == target) 
                location = i;
        
        return location;
    }

    //------------------------------------------------------------
    // sortIncreasing -- uses selection sort
    //------------------------------------------------------------
    public void sortIncreasing(){
        int min, temp;
        for (int index = 0; index < list.length-1; index++){
            min = index;
            for (int scan = index + 1; scan < list.length; scan++)
               if (list[scan] < list[min])
                  min = scan;
        
         // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        
        }
    } 

    void sortDecreasing() {
        for (int index = 1; index < list.length; index++){
            int key = list[index];
            int position = index;
        
            //  Shift larger values to the right
            while (position > 0 && key > (list[position-1])){
               list[position] = list[position-1];
               position--;
            }
            
            list[position] = key;
         }
    }
    
    public int binarySearch (int target){
        int first = 0, middle, last = list.length-1;
        while (first <= last){
            middle = (first + last)/2;
            if (list[middle] == target){
               return middle;
            }
            else if (list[middle] < target)
               first = middle + 1;
            else
               last = middle - 1;
        }  // end of while
        return -1;
     }
}
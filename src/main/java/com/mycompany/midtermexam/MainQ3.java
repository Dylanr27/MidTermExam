/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.midtermexam;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author djreg
 */
public class MainQ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] nums1 = {1,7,15,9,5};
        Integer[] nums2 = {20,17,4,33,1,6,19};
        var list1 = new LinkedList<Integer>(Arrays.asList(nums1));
        var list2 = new LinkedList<Integer>(Arrays.asList(nums2));
        var list3 = appendSmallerList(list1, list2);
        list3.forEach(num -> System.out.println(num));
        
    }
    public static LinkedList<Integer> appendSmallerList(LinkedList<Integer> list1, LinkedList<Integer> list2){
        float total1 = 0;
        float total2 = 0;
        int count = 0;
        for(Number num : list1){
            total1+=list1.get(count++);
        }
        count = 0;
        //repeat for second list
        for(Number num : list2){
            total2+=list2.get(count++);
        }
        //list1 wins tiebreaker
        if(total1 >= total2){
            list1.addAll(list2);
            return list1;
        }
        else{
            list2.addAll(list1);
            return list2;
        }
    }
    
}

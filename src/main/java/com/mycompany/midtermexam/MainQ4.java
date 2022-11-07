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
public class MainQ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] array = {"Omar","Yasmine","David","Steven","Norah","Carlos","Laura","Jose","Josh"};
        var nameLinkedList = new LinkedList<String>(Arrays.asList(array));
        nameLinkedList.forEach(name -> System.out.println(name));
        
        System.out.println("\n");
        
        var rotatedLinkedList = rotateCounterClockwise(nameLinkedList, 5);
        rotatedLinkedList.forEach(name -> System.out.println(name));
    }

    private static LinkedList<String> rotateCounterClockwise(LinkedList<String> nameLinkedList, int k) {
        if(nameLinkedList.getFirst() == null)
            return null;
        for(int i = 0; i < k; i++){
            nameLinkedList.add(nameLinkedList.pop());
        }
        return nameLinkedList;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.midtermexam;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author djreg
 */
public class MainQ8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person[] persons = {new Person("John", 21, "Argentina"),
                            new Person("Bob", 27, "Houston"),
                            new Person("Alexia", 22, "Rome"),
                            new Person("Genny", 32, "Athens"),
                            new Person("Jose", 18, "Tijuana"),
                            new Person("Dylan", 26, "Burien"),
                            new Person("Dylan", 26, "Burien")};
        var personList = new LinkedList<Person>(Arrays.asList(persons));
        personList.forEach(p -> System.out.println(p));
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a first name:");
        String userInputName = myScanner.nextLine();
        System.out.println("Enter a Birth Place:");
        String userInputBirthPlace = myScanner.nextLine();
        System.out.println("Enter an age:");
        Integer userInputAge = myScanner.nextInt();
        
        var userInputPerson = new Person(userInputName,userInputAge,userInputBirthPlace);
        personList.add(personList.size()/2, userInputPerson);
        personList.forEach(p -> System.out.println(p));   
    }
}

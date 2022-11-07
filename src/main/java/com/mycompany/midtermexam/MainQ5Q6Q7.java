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
public class MainQ5Q6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Q5
        Person[] persons = {new Person("John", 21, "Argentina"),
                            new Person("Bob", 27, "Houston"),
                            new Person("Alexia", 22, "Rome"),
                            new Person("Genny", 32, "Athens"),
                            new Person("Jose", 18, "Tijuana"),
                            new Person("Dylan", 26, "Burien"),
                            new Person("Dylan", 26, "Burien")};
        var personList = new LinkedList<Person>(Arrays.asList(persons));
        
        //Q6
        var theThree = getFirstMiddleLast(personList);
        for(Person p : theThree){
            System.out.println(p.toString());
        }
        
        //Q7
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a first name:");
        String userInputName = myScanner.nextLine();
        System.out.println("Enter a Birth Place:");
        String userInputBirthPlace = myScanner.nextLine();
        System.out.println("Enter an age:");
        Integer userInputAge = myScanner.nextInt();
        
        var userInputPerson = new Person(userInputName,userInputAge,userInputBirthPlace);
        System.out.println(findPersonInList(personList, userInputPerson));

    }
    
    public static Person[] getFirstMiddleLast(LinkedList<Person> list){
        Person[] threeAmigos = {list.getFirst(), list.get(list.size() / 2), list.getLast()};
        return threeAmigos;
    }
    
    //This works. However, if I dont convert the two persons being compared using the toString 
    //method, the return is always "Person not found". Adding toString fixed that problem, 
    //even though the equals is overridden to compare the propertys.
    //Very interested to hear why my equals Override is not working as intended.
    //Also failed to find the proper solution using indexOf
    public static String findPersonInList(LinkedList<Person> list, Person userInputPerson){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).toString().equals(userInputPerson.toString()))
                return "First found index of person entered by user is: " + i;
        }
        return "Person not found";
    }
}

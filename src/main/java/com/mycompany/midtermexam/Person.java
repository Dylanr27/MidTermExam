/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermexam;

/**
 *
 * @author djreg
 */
public class Person{
    private String name, birthPlace;
    private Integer age;
    
    public Person(String name, Integer age, String birthPlace){
        this.name = name;
        this.age = age;
        this.birthPlace = birthPlace;
    }
    public String getName(){
    return name;}
    
    public Integer getAge(){
    return age;}
    
    public String getBirthPlace(){
    return birthPlace;}
    
    @Override
    public String toString(){
        return String.format("Name: %s, Age: %d, Birth Place: %s\n", this.getName(), this.getAge(), this.getBirthPlace());
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person)o;
        if(this.name == person.name && this.age == person.age && this.birthPlace == person.birthPlace)
            return true;
        else 
            return false;
    }
}

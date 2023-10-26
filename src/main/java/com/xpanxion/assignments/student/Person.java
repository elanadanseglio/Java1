package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Person {
    private int id;
    private String firstName, lastName;
    static ArrayList<Person> People = new ArrayList<>();

    public Person(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void add(Person person){
        People.add(person);
    }

    public int getID(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String toString(){
        return "Person{id=" + id + ", " + "firstName=" + firstName + ", " + "lastName=" + lastName + "}";
    }
}

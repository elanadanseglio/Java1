package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Repository {
    private Person prsn;

    public Repository(){
        prsn = new Person(1, "John", "Doe");
    }
    
    public Person getPerson(){
        return prsn;
    }
}   

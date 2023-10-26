package com.xpanxion.assignments.student;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
public class JavaTwo {

    //
    // Constructors
    //     

    public JavaTwo() {}

    //
    // Public methods
    //

    public void ex1() {
        Scanner console = new Scanner(System.in);
        String resp = "";

        do {
            System.out.print("Enter Person: ");
            resp = console.nextLine();

            if (resp.charAt(0) == 'd'){
                break;
            } else {
                Person.add(new Person(Integer.parseInt(resp.split(", ")[0]),resp.split(", ")[1].split(" ")[0], resp.split(", ")[1].split(" ")[1]));
            }
        } while (resp.charAt(0) != 'd');
        for (Person p : Person.People){
            System.out.println(p);
        }
    }
    
    public void ex2() {
        var personMap = new HashMap<Integer, Person>();
        personMap.put(1,new Person(1, "Peter", "Jones"));
        personMap.put(2,new Person(2, "John", "Smith"));
        personMap.put(3,new Person(3, "Mary", "Jane"));
        Scanner console = new Scanner(System.in);
        String resp = "";

        do {
            System.out.print("Enter Person ID: ");
            resp = console.nextLine();

            if (resp.charAt(0) == 'd'){
                break;
            } else {
                int id = Integer.parseInt(resp);
                System.out.println(personMap.get(id)); 
            }
        } while (resp.charAt(0) != 'd');
    }
    
    public void ex3() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
        
    }
    
    public void ex4() {
    }
    
    public void ex5() {
    }
    
    public void ex6() {
    }
    
    public void ex7() {
    }
    
    public void ex8() {
    }
    
    public void ex9() {
    }
    
    public void ex10() {
    }

}

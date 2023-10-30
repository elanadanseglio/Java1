package com.xpanxion.assignments.student;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
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
        var invoice = new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }
    
    public void ex5() {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }
    
    public void ex6() {
        Scanner console = new Scanner(System.in);
        String firstNum = " ";
        String secondNum = " ";
        int result = 0;
        String op = "";

        var calculator =  new Calculator();
        while ((firstNum.charAt(0) != 'd') || (secondNum.charAt(0) != 'd') || (!op.equals("done"))) {
            System.out.print("Enter first number: ");
            firstNum = console.nextLine();
            if (firstNum.charAt(0) == 'd'){
                break;
            }
            System.out.print("Enter second number: ");
            secondNum = console.nextLine();
            if (secondNum.charAt(0) == 'd'){
                break;
            }
            System.out.print("Enter operation (add, sub, mul, div): ");
            op = console.nextLine();

            if (op.equals("d")){
                break;
            }

            if (op.equals("add")){
                result = calculator.add(Integer.parseInt(firstNum), Integer.parseInt(secondNum));
            } else if (op.equals("sub")){
                result = calculator.subtract(Integer.parseInt(firstNum), Integer.parseInt(secondNum));
            } else if (op.equals("mul")){
                result = calculator.multiply(Integer.parseInt(firstNum), Integer.parseInt(secondNum));
            } else if (op.equals("div")){
                result = calculator.divide(Integer.parseInt(firstNum), Integer.parseInt(secondNum));
            }
            System.out.println("Result: " + result);
        }
        System.out.println(calculator.getHistory()); 
    }
    
    public void ex7() {
        var personList = Arrays.asList(
        new Person(1, "Peter", "Jones"),
        new Person(2, "John", "Smith"),
        new Person(3, "Sue", "Anderson"));

        var newPersonList = personList.stream().map(person -> new Person(person.getID(), person.getFirstName(), "xxx")).toList();
        for (Person p : newPersonList){
            System.out.println(p);
        }
    }
    
    public void ex8() {
        var personList = Arrays.asList(
        new Person(1, "Charlie", "Jones"),
        new Person(2, "Zoey", "Smith"),
        new Person(3, "Adam", "Anderson")
        );

        personList = personList.stream().sorted(Comparator.comparing(Person::getFirstName)).toList();

        for (Person p : personList) {
            System.out.println(p);
        }
    }
    
    public void ex9() {
        var personList = Arrays.asList(
        new Person(1, "Charlie", "Jones"),
        new Person(2, "Zoey", "Smith"),
        new Person(3, "Adam", "Anderson")
        );

        var filteredList = personList.stream().filter(person -> person.getLastName() == "Smith").toList();

        for (Person p : filteredList) {
            System.out.println(p);
        }
    }   
    
    public void ex10() {
        Queue<Cat> catQueue = new LinkedList<>();

        catQueue.add(new Cat("Alice"));
        catQueue.add(new Cat("Bob"));
        catQueue.add(new Cat("Charlie"));
        catQueue.add(new Cat("Dan"));

        while (!catQueue.isEmpty()){
            Cat cat = catQueue.peek();
            System.out.println(catQueue);
            catQueue.remove();  
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }

}

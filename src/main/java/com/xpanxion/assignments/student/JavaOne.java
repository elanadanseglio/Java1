package com.xpanxion.assignments.student;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        System.out.println("Enter your name: ");
        Scanner console = new Scanner(System.in);
        String name = console.next();
        name = name.toUpperCase();
        System.out.println("Your name in upper case is: " + name);
        console.close();
    }

    public void ex2() {
        int count = 0;
        System.out.println("Enter a string: ");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine().strip();

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                count++;
            }
        }
        System.out.println("Number of uppercase letters: " + count);
    }

    public void ex3() {
        System.out.println("Enter a string: ");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String[] strArr = str.split(" ");

        for (int i = 0; i < strArr.length; i++){
            if (i == 0){
                strArr[i] = strArr[i].toUpperCase();
            } else if (i % 2 == 0){
                strArr[i] = strArr[i].toUpperCase();
            }
        }

        for (int i = 0; i < strArr.length; i++){
            System.out.print(strArr[i] + " ");
        }
    }

    public void ex4() {
        System.out.println("Enter string: ");
        Scanner console = new Scanner(System.in);
        String word = console.nextLine();
        String backwards = "";

        for (int i = word.length()-1; i >= 0; i--){
            backwards += word.charAt(i);
        }
        if (backwards.equals(word)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public void ex5() {
        Scanner console = new Scanner(System.in);
        String str = "";
        int vowelCount = 0;
        int conCount = 0;

        while (!str.equals("quit")){
            System.out.print("Enter a string: ");
            str = console.nextLine(); 

            if (str.equals("quit")){
                break;
            }
            
            String[] strArr = str.split(" ");
            for (int i = 0; i < strArr.length; i++){
                for (int j = 0; j < strArr[i].length(); j++){
                    char letter = strArr[i].toUpperCase().charAt(j);
                    if ((letter == 'A') || (letter == 'E') || (letter == 'I') || (letter == 'O') || (letter == 'U')){
                        vowelCount++;
                    } else if (letter > 'A' && letter <= 'Z'){
                        conCount++;
                    }
                }
            }
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + conCount);
            vowelCount = 0;
            conCount = 0;
        }
    }

    public void ex6() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = console.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = console.nextInt();

        int sum = firstNum + secondNum;

        System.out.println("Result: " + sum);

    }

    public void ex7() {
        Scanner console = new Scanner(System.in);
        int result = 0;
        System.out.print("Enter first number: ");
        int firstNum = console.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = console.nextInt();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String op = console.nextLine();

        if (op.equals("add")){
            result = firstNum + secondNum;
        } else if (op.equals("sub")){
            result = firstNum - secondNum;
        } else if (op.equals("mul")){
            result = firstNum * secondNum;
        } else if (op.equals("div")){
            result = firstNum / secondNum;
        }

        System.out.println("Result: " + result);
    }

    public void ex8() {
        double totalPrice = 0;
        Scanner console = new Scanner(System.in);

        System.out.print("Enter price per square feet: ");
        double price = console.nextDouble();
        String dimensions = "";
        int width, height;

        console.nextLine();
        do {
            System.out.print("Enter room dimensions (width x height): ");
            dimensions = console.nextLine();

            if (dimensions.charAt(0) == 'd'){
                break;
            }

            String[] arr = dimensions.split(" x ");
            width = Integer.parseInt(arr[0]);
            height = Integer.parseInt(arr[1]);
            totalPrice += (width * height * price);

        } while (dimensions.charAt(0) != 'd');
        System.out.println("Total cost: $" + totalPrice);
    }

    public void ex9() {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(6);
        boolean guessed = false;

        if (num == 0){
            num = rand.nextInt(6);
        }

        while (!guessed) {
            System.out.println("Enter a number: ");
            int guessNum = console.nextInt();
            if (guessNum == num){
                guessed = true;
                System.out.println("You guessed it!!!");
                break;
            } else {
                System.out.println("Try again...");
            }
        }
    }

    public void ex10() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = console.nextLine();
        String[] strArr = str.split(" ");
        String blanks = "";
        
        for (int i = 0; i < strArr.length; i++){
            blanks = "";
            for (int j = 0; j < strArr[i].length(); j++){
                System.out.println(blanks + strArr[i].charAt(j));
                blanks += " ";
            }
        }
    }
}

package javaRefresher;//package declaration--> what package is it

import java.util.Scanner;

public class InputOutputClass {
    //class declartion
    public static void main(String args[]){
        System.out.println("abhor");
        Scanner sc= new Scanner(System.in);
        // Input for char
        System.out.print("Enter a character: ");
        char charInput = sc.next().charAt(0);
        System.out.println("You entered: " + charInput);

        // Input for String
        System.out.print("Enter a string: ");
        String stringInput = sc.next(); // or use nextLine() for the entire line
        System.out.println("You entered: " + stringInput);

        // Input for int
        System.out.print("Enter an integer: ");
        int intInput = sc.nextInt();
        System.out.println("You entered: " + intInput);

        // Input for double
        System.out.print("Enter a double: ");
        double doubleInput = sc.nextDouble();
        System.out.println("You entered: " + doubleInput);

        // Input for boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanInput = sc.nextBoolean();
        System.out.println("You entered: " + booleanInput);

        // Input for long
        System.out.print("Enter a long integer: ");
        long longInput = sc.nextLong();
        System.out.println("You entered: " + longInput);

        // Input for float
        System.out.print("Enter a float: ");
        float floatInput = sc.nextFloat();
        System.out.println("You entered: " + floatInput);
}
}
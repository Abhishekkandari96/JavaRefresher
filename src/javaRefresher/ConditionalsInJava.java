package javaRefresher;


import java.util.Scanner;

public class ConditionalsInJava {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number;
        number = sc.nextInt();

        // Example of if statement
        if (number > 5) {
            System.out.println("x is greater than 5");
        }


        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Example of switch statement
        System.out.print("Enter a day of the week (1-7): ");
        int dayOfWeek = sc.nextInt();

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            // ... other cases ...
            default:
                System.out.println("Invalid day");
        }

        // Example of ternary operator
        System.out.print("Enter another number: ");
        int anotherNumber = sc.nextInt();
        String result = (anotherNumber % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + result);
    }
}

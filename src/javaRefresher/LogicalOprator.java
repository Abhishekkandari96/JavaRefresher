package javaRefresher;

import java.util.Scanner;

public class LogicalOprator {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int number = sc.nextInt();

        if (number > 0 && number <= 10) {
            System.out.println("The number is within the specified range.");
        } else {
            System.out.println("The number is outside the specified range.");
        }

        // Example of logical OR (||)
        System.out.print("Enter a character: ");
        char charInput = sc.next().charAt(0);

        if (charInput == 'a' || charInput == 'e' || charInput == 'i' || charInput == 'o' || charInput == 'u') {
            System.out.println("The character is a vowel.");
        } else {
            System.out.println("The character is not a vowel.");
        }

        // Example of logical NOT (!)
        System.out.print("Enter a boolean value (true/false): ");
        boolean boolInput = sc.nextBoolean();

        if (!boolInput) {
            System.out.println("The boolean value is false.");
        } else {
            System.out.println("The boolean value is true.");
        }
    }
}

package javaRefresher;

import java.util.Scanner;

public class MathOprations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Addition (+)
        System.out.print("Enter the first number for addition: ");
        int addend1 = sc.nextInt();
        System.out.print("Enter the second number for addition: ");
        int addend2 = sc.nextInt();
        int sum = addend1 + addend2;
        System.out.println("Sum: " + sum);

        // Subtraction (-)
        System.out.print("Enter the minuend for subtraction: ");
        int minuend = sc.nextInt();
        System.out.print("Enter the subtrahend for subtraction: ");
        int subtrahend = sc.nextInt();
        int difference = minuend - subtrahend;
        System.out.println("Difference: " + difference);

        // Multiplication (*)
        System.out.print("Enter the first factor for multiplication: ");
        int factor1 = sc.nextInt();
        System.out.print("Enter the second factor for multiplication: ");
        int factor2 = sc.nextInt();
        int product = factor1 * factor2;
        System.out.println("Product: " + product);

        // Division (/)
        System.out.print("Enter the dividend for division: ");
        double dividend = sc.nextDouble();
        System.out.print("Enter the divisor for division: ");
        double divisor = sc.nextDouble();
        if (divisor != 0) {
            double quotient = dividend / divisor;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Modulus (%)
        System.out.print("Enter the dividend for modulus: ");
        int intDividend = sc.nextInt();
        System.out.print("Enter the divisor for modulus: ");
        int intDivisor = sc.nextInt();
        if (intDivisor != 0) {
            int remainder = intDividend % intDivisor;
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Cannot calculate modulus with zero divisor.");
        }

        // Increment (++) and Decrement (--)
        int num = 5;
        System.out.println("Original value of num: " + num);
        num++;
        System.out.println("After increment: " + num);
        num--;
        System.out.println("After decrement: " + num);

    }
}

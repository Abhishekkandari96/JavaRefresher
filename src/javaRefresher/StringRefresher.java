package javaRefresher;

 import java.util.Scanner;

public class StringRefresher {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // String creation
        String greeting = "Hello,";
        String audience = " World!";

        // String concatenation
        String fullGreeting = greeting + audience;

        // String length
        int greetingLength = greeting.length();
        int fullGreetingLength = fullGreeting.length();

        // String comparison
        boolean isEqual = greeting.equals("Hello,");
        int compareToValue = greeting.compareTo("Hello,");

        // String manipulation
        String original = "   Java Programming   ";
        String trimmed = original.trim();
        String upperCase = original.toUpperCase();
        String replaced = original.replace("Java", "Python");

        // String formatting
        String name = "John";
        int age = 25;
        String formattedString = String.format("Name: %s, Age: %d", name, age);

        // String conversion
        int number = 42;
        String numberAsString = String.valueOf(number);

        // Displaying results
        System.out.println("Concatenated Greeting: " + fullGreeting);
        System.out.println("Length of Greeting: " + greetingLength);
        System.out.println("Length of Full Greeting: " + fullGreetingLength);
        System.out.println("String Comparison: " + isEqual);
        System.out.println("String CompareTo: " + compareToValue);
        System.out.println("Trimmed String: " + trimmed);
        System.out.println("Uppercase String: " + upperCase);
        System.out.println("Replaced String: " + replaced);
        System.out.println("Formatted String: " + formattedString);
        System.out.println("Number as String: " + numberAsString);

        // Closing the scanner to prevent resource leaks
        scanner.close();
    }
}

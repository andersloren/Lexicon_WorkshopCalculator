package se.lexicon;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Subtraction {
    public static ArrayList getNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        int counter = 0;
        double number;
        String userResponse;
        while (true) {
            counter++;
            if (counter < 3) {
                System.out.println("Enter a number you want to subtract.");
                try {
                    number = scanner.nextDouble();
                    numbers.add(number); // The Variable number is added as a new element to list numbers
                } catch (InputMismatchException e) {
                    System.out.println("That was not a valid number. Be sure to use only digits and a \",\" as separator if you want to enter a decimal number. Please try again.");
                    scanner.nextLine(); // Consumes token, otherwise stuck in infinite loop
                }
            } else {
                System.out.println("Enter a number you want to subtract. Or enter \"Exit\" to see the difference of the numbers you've entered.");
                userResponse = scanner.next();
                try {
                    number = Double.parseDouble(userResponse); // Can userInput be parsed to a double?
                    numbers.add(number); // If so, add the double as a new element to ArrayList numbers
                } catch (NumberFormatException e) {
                    if (userResponse.equalsIgnoreCase("exit")) {
                        break;
                    } else {
                        System.out.println("Either you misspelled \"Exit\" or that was not a valid number. Be sure to use only digits and a \",\" as separator if you want to enter a decimal number. Please try again.");
                    }
                }
            }
        }
        return numbers;
    }
    public static double subtractDifference(ArrayList<Double> numbers) {
        double difference = 0;
        int counter = 0;
        for (double n : numbers) {
            counter++;
            if (counter == 1) {
                difference = n;
            } else {
                difference -= n;
            }
        }
        return difference;
    }
    public static void returnDifference(double difference) {
        System.out.println("Here is the difference of your numbers: " + difference);
    }
}
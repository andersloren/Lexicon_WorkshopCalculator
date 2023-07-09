package se.lexicon;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OperatorDecision {

    public static void displayMenu(ArrayList<ArrayList<String>> matrix) {
        System.out.println("(" + matrix.get(1).get(0) + ") " + matrix.get(0).get(0) + "\t\t\tEnter \"1\"");
        System.out.println("(" + matrix.get(1).get(1) + ") " + matrix.get(0).get(1) + "\t\t\tEnter \"2\"");
        System.out.println("(" + matrix.get(1).get(2) + ") " + matrix.get(0).get(2) + "\t\tEnter \"3\"");
        System.out.println("(" + matrix.get(1).get(3) + ") " + matrix.get(0).get(3) + "\t\t\tEnter \"4\"");
        }

    public static int returnOperator(ArrayList<ArrayList<String>> matrix) {

        Scanner scanner = new Scanner(System.in);
        int operatorNumber;

        while (true) {
            try {
                operatorNumber = scanner.nextInt();
                if (operatorNumber > 0 && operatorNumber < 5) {
                    break;
                } else {
                    ConsoleManager.clearConsole();
                    System.out.println("What do you want to do?\nEnter the number for the arithmetic operator you want to perform.\n");
                    OperatorDecision.displayMenu(matrix);
                    System.out.println("\nThat was not an integer number between 1-4. Please try again.");
                }
            } catch (InputMismatchException e) { // Handles exception if input was not a number

                ConsoleManager.clearConsole();

                System.out.println("What do you want to do?\nEnter the number for the arithmetic operator you want to perform.\n");
                OperatorDecision.displayMenu(matrix);
                System.out.println("That was not an integer number between 1-4. Please try again.");
                scanner.nextLine(); // Consumes token, otherwise stuck in infinite loop
            }
        }

        return operatorNumber;
    }
}

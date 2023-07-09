package se.lexicon;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ConsoleManager.clearConsole();

        /* Welcoming text */
        System.out.println("Welcome! \n\nThis calculator can help you add or subtract many numbers together. \nIt can also help you multiply or divide two numbers.\n");
        System.out.println("What do you want to do?\nEnter the corresponding number for the arithmetic operation you want to perform.\n");

        ArrayList<ArrayList<String>> matrix = CalculatorMatrix.buildCalculatorMatrix();
        OperatorDecision.displayMenu(matrix);
        int operatorNumber = OperatorDecision.returnOperator(matrix);

        /* Confirms operation to be carried out */
        System.out.println("\nYou chose: " + matrix.get(0).get(operatorNumber - 1) + "!"); // -1 to adjust to matrix column index starting at 0

        if (operatorNumber == 1) {
            ArrayList<Double> numbers = Addition.getNumbers();
            double sum = Addition.addSum(numbers);
            Addition.returnSum(sum);
        } else if (operatorNumber == 2) {
            ArrayList<Double> numbers = Subtraction.getNumbers();
            double difference = Subtraction.subtractDifference(numbers);
            Subtraction.returnDifference(difference);
        } else if (operatorNumber == 3) {
            ArrayList<Double> numbers = Multiplication.getNumbers();
            double product = Multiplication.multiplyProduct(numbers);
            Multiplication.returnProduct(product);
        } else {
            ArrayList<Double> numbers = Division.getNumbers();
            double quotient = Division.divideQuotient(numbers);
            Division.returnQuotient(quotient);
        }
    }
}
package se.lexicon;

import java.util.ArrayList;

public class CalculatorMatrix {
    public static ArrayList<ArrayList<String>> buildCalculatorMatrix() {

        ArrayList<ArrayList<String>> calculatorMatrix = new ArrayList<>();

        ArrayList<String> operatorsName = new ArrayList<>();
        operatorsName.add("Addition");
        operatorsName.add("Subtraction");
        operatorsName.add("Multiplication");
        operatorsName.add("Division");
        calculatorMatrix.add(operatorsName);

        ArrayList<String> operatorSymbol = new ArrayList<>();
        operatorSymbol.add("+");
        operatorSymbol.add("-");
        operatorSymbol.add("*");
        operatorSymbol.add("/");
        calculatorMatrix.add(operatorSymbol);

        ArrayList<String> operatorResultName = new ArrayList<>();
        operatorSymbol.add("sum");
        operatorSymbol.add("difference");
        operatorSymbol.add("product");
        operatorSymbol.add("quotient");
        calculatorMatrix.add(operatorSymbol);

        return calculatorMatrix;
    }
}

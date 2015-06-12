package com.twu.calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        CalculatorView calculatorView = new CalculatorView(new Scanner(System.in));


        Map<String, ArithmeticOperation> operations = initialiseOperations();

        CalculatorModel calculatorModel = new CalculatorModel(calculatorView, operations);

        CalculatorController calculatorController = new CalculatorController(calculatorModel, calculatorView, new ArrayList<String>());
        calculatorController.start();
    }

    private static Map<String, ArithmeticOperation> initialiseOperations() {
        Map<String, ArithmeticOperation> operations = new HashMap<String, ArithmeticOperation>();
        operations.put("add", new Add());
        operations.put("subtract", new Subtract());
        operations.put("multiply", new Multiply());
        operations.put("divide", new Divide());
        operations.put("cancel", new Cancel());
        operations.put("abs", new Absolute());
        operations.put("neg", new Negative());
        operations.put("sqr", new Square());
        operations.put("sqrt", new SquareRoot());
        operations.put("cube", new Cube());
        operations.put("cubert", new CubeRoot());
        return operations;
    }
}
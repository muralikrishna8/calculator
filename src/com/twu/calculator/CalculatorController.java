package com.twu.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculatorController {
    private CalculatorView calculatorView;
    private CalculatorModel calculatorModel;

    public CalculatorController(CalculatorModel calculatorModel, CalculatorView calculatorView){
        this.calculatorModel = calculatorModel;
        this.calculatorView = calculatorView;
    }

    public void execute() {
        String input = calculatorView.read();
        while(!input.equals("exit")) {
            String[] token = input.split(" ");
            String operatorName = token[0];
            double operand = 0.0;

            if (inputHasTwoWords(token)) {
                operand = Double.parseDouble(token[1]);
            }
            calculatorModel.execute(operatorName, operand);

            input = calculatorView.read();
        }
    }

    private boolean inputHasTwoWords(String[] token) {
        return token.length == 2;
    }

    public static void main(String[] args) {
        Add add = new Add();
        Subtract subtract = new Subtract();
        Multiply multiply = new Multiply();
        Divide divide = new Divide();
        Cancel cancel = new Cancel();
        Absolute absolute = new Absolute();
        Negative negative = new Negative();
        Square square = new Square();
        SquareRoot squareRoot = new SquareRoot();
        Cube cube = new Cube();
        CubeRoot cubeRoot = new CubeRoot();
        CalculatorView calculatorView = new CalculatorView(new Scanner(System.in));


        Map<String, ArithmeticOperation> operations = new HashMap<>();
        operations.put("add", add);
        operations.put("subtract", subtract);
        operations.put("multiply", multiply);
        operations.put("divide", divide);
        operations.put("cancel", cancel);
        operations.put("abs", absolute);
        operations.put("neg", negative);
        operations.put("sqr", square);
        operations.put("sqrt", squareRoot);
        operations.put("cube", cube);
        operations.put("cubert", cubeRoot);

        CalculatorModel calculatorModel = new CalculatorModel(calculatorView, operations);

        CalculatorController calculatorController = new CalculatorController(calculatorModel, calculatorView);
        calculatorController.execute();
    }
}

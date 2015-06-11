package com.twu.calculator;

import java.util.Map;

public class Calculator {
    private double result;
    private Map<String, ArithmeticOperation> operations;
    private CalculatorView calculatorView;

    public Calculator(CalculatorView calculatorView, Map<String, ArithmeticOperation> operations) {
        this.calculatorView = calculatorView;
        this.operations = operations;
    }

    public void execute(String command, double operand) {
        ArithmeticOperation arithmeticOperation = operations.get(command);
        this.result = arithmeticOperation.execute(result, operand);
        calculatorView.print(result+"");
    }
}
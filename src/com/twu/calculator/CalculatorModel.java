package com.twu.calculator;

import java.util.Map;

public class CalculatorModel {
    private double accumulator;
    private Map<String, ArithmeticOperation> operations;
    private CalculatorView calculatorView;

    public CalculatorModel(CalculatorView calculatorView, Map<String, ArithmeticOperation> operations) {
        this.calculatorView = calculatorView;
        this.operations = operations;
    }

    public void execute(String command, double operand) {
        ArithmeticOperation arithmeticOperation = operations.get(command);
        this.accumulator = arithmeticOperation.execute(accumulator, operand);
    }

    public String formattedAccumulator() {
        return "" + accumulator;
    }
}
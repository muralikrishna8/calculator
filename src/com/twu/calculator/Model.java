package com.twu.calculator;

import java.util.Map;

public class Model {
    private double accumulator;
    private Map<String, ArithmeticOperation> operations;
    private View view;

    public Model(View view, Map<String, ArithmeticOperation> operations) {
        this.view = view;
        this.operations = operations;
    }

    public void execute(String command, double operand) {
        ArithmeticOperation arithmeticOperation = operations.get(command);
        this.accumulator = arithmeticOperation.execute(accumulator, operand);
    }

    public double add(double operand) {
        accumulator += operand;
        return accumulator;
    }

    public String formattedAccumulator() {
        return "" + accumulator;
    }
}
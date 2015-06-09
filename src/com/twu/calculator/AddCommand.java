package com.twu.calculator;

public class AddCommand implements Executable {
    @Override
    public double execute(double operandOne, double operandTwo) {
        return operandOne + operandTwo;
    }
}

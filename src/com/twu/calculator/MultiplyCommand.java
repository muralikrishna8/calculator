package com.twu.calculator;

public class MultiplyCommand implements Executable {
    @Override
    public double execute(double operandOne, double operandTwo) {
        return operandOne * operandTwo;
    }
}

package com.twu.calculator;

public class SubtractCommand implements ArithmeticOperation {
    @Override
    public double execute(double operandOne, double operandTwo) {
        return operandOne - operandTwo;
    }
}

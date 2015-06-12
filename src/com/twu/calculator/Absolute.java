package com.twu.calculator;

public class Absolute implements ArithmeticOperation {
    @Override
    public double execute(double firstOperand, double secondOperand) {
        return Math.abs(firstOperand);
    }
}

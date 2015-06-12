package com.twu.calculator;

public class Cube implements ArithmeticOperation {
    @Override
    public double execute(double firstOperand, double secondOperand) {
        return Math.pow(firstOperand, 3.0);
    }
}

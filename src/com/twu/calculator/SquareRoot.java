package com.twu.calculator;

public class SquareRoot implements ArithmeticOperation {
    @Override
    public double execute(double firstOperand, double secondOperand) {
        return Math.sqrt(firstOperand);
    }
}

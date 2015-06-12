package com.twu.calculator;

public class Square implements ArithmeticOperation {
    @Override
    public double execute(double firstOperand, double secondOperand) {
        return Math.pow(firstOperand, 2);
    }
}

package com.twu.calculator;

public class Negative implements ArithmeticOperation {
    @Override
    public double execute(double firstOperand, double secondOperand) {
        return -firstOperand;
    }
}

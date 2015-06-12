package com.twu.calculator;

public class Multiply implements ArithmeticOperation {
    @Override
    public double execute(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }
}

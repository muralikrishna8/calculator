package com.twu.calculator;

public class Divide implements ArithmeticOperation {
    @Override
    public double execute(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }
}
package com.twu.calculator;

public class DivideOperation implements ArithmeticOperation {
    @Override
    public double execute(double operandOne, double operandTwo) {
        return operandOne / operandTwo;
    }
}
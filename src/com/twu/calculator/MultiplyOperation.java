package com.twu.calculator;

public class MultiplyOperation implements ArithmeticOperation {
    @Override
    public double execute(double operandOne, double operandTwo) {
        return operandOne * operandTwo;
    }
}

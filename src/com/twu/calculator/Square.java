package com.twu.calculator;

public class Square implements ArithmeticOperation {
    @Override
    public double execute(double a, double b) {
        return Math.pow(a, 2);
    }
}

package com.twu.calculator;

public class SquareRootOperation implements ArithmeticOperation {
    @Override
    public double execute(double a, double b) {
        return Math.sqrt(a);
    }
}

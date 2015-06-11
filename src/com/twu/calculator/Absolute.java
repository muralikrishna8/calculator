package com.twu.calculator;

public class Absolute implements ArithmeticOperation {
    @Override
    public double execute(double a, double b) {
        return Math.abs(a);
    }
}

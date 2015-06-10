package com.twu.calculator;

public class NegativeOperation implements ArithmeticOperation {
    @Override
    public double execute(double a, double b) {
        return -a;
    }
}

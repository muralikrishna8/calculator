package com.twu.calculator;

public class Negative implements ArithmeticOperation {
    @Override
    public double execute(double a, double b) {
        return -a;
    }
}

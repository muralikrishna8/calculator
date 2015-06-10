package com.twu.calculator;

public class AbsoluteOperation implements ArithmeticOperation {
    @Override
    public double execute(double a, double b) {
        return Math.abs(a);
    }
}

package com.twu.calculator;

public class CubeOperation implements ArithmeticOperation {
    @Override
    public double execute(double a, double b) {
        return Math.pow(a, 3.0);
    }
}

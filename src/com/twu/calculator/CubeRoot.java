package com.twu.calculator;

public class CubeRoot implements ArithmeticOperation {
    @Override
    public double execute(double a, double b) {
        return Math.cbrt(a);
    }
}

package com.twu.calculator;

public class CubeRoot implements ArithmeticOperation {
    @Override
    public double execute(double firstOperand, double secondOperand) {
        return Math.cbrt(firstOperand);
    }
}

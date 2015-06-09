package com.twu.calculator;

public class SubtractCommand implements Executable{
    @Override
    public double execute(double operandOne, double operandTwo) {
        return operandOne - operandTwo;
    }

    @Override
    public double execute() {
        return 0;
    }
}

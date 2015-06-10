package com.twu.calculator;

public class CalculatorController {
    CalculatorView calculatorView;
    Calculator calculator;
    private String command = "";
    private double operand;

    public CalculatorController(Calculator calculator, CalculatorView calculatorView){
        this.calculator = calculator;
        this.calculatorView = calculatorView;
    }

    public void commandParser() {
        String input = calculatorView.read();
        String[] token = input.split(" ");
        command = token[0];
        if (token.length == 2) {
            operand = Double.parseDouble(token[1]);
        }
        calculator.execute(command, operand);
    }
}

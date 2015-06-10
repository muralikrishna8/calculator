package com.twu.calculator;

public class CalculatorController {
    CalculatorView calculatorView;
    Calculator calculator;
    private String operatorName;
    private double operand;
    private String input;

    public CalculatorController(Calculator calculator, CalculatorView calculatorView){
        this.calculator = calculator;
        this.calculatorView = calculatorView;
    }

    public void execute() {
        input = calculatorView.read();
        while(!input.equals("exit")) {
            String[] token = input.split(" ");
            operatorName = token[0];
            if (token.length == 2) {
                operand = Double.parseDouble(token[1]);
            }
            calculator.execute(operatorName, operand);

            input = calculatorView.read();
        }
    }

    public static void main(String[] args) {
        AddCommand addCommand = new AddCommand();
        SubtractCommand subtractCommand = new SubtractCommand();
        MultiplyCommand multiplyCommand = new MultiplyCommand();
        DivideCommand divideCommand = new DivideCommand();
        CancelCommand cancelCommand = new CancelCommand();
        CalculatorView calculatorView = new CalculatorView();
        AbsoluteOperation absoluteOperation = new AbsoluteOperation();

        Calculator calculator = new Calculator(addCommand, subtractCommand, multiplyCommand,
                                    divideCommand, cancelCommand, calculatorView, absoluteOperation);

        CalculatorController calculatorController = new CalculatorController(calculator, calculatorView);
        calculatorController.execute();
    }
}

package com.twu.calculator;

import java.util.HashMap;
import java.util.Map;

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
            operand = 0.0;
            if (token.length == 2) {
                operand = Double.parseDouble(token[1]);
            }
            calculator.execute(operatorName, operand);

            input = calculatorView.read();
        }
    }

    public static void main(String[] args) {
        AddOperation addOperation = new AddOperation();
        SubtractOperation subtractOperation = new SubtractOperation();
        MultiplyOperation multiplyOperation = new MultiplyOperation();
        DivideOperation divideOperation = new DivideOperation();
        CancelOperation cancelOperation = new CancelOperation();
        CalculatorView calculatorView = new CalculatorView();
        AbsoluteOperation absoluteOperation = new AbsoluteOperation();
        NegativeOperation negativeOperation = new NegativeOperation();
        SquareOperation squareOperation = new SquareOperation();
        SquareRootOperation squareRootOperation = new SquareRootOperation();
        CubeOperation cubeOperation = new CubeOperation();
        CubeRootOperation cubeRootOperation = new CubeRootOperation();


        Map<String, ArithmeticOperation> arithmeticOperationMap = new HashMap<>();
        arithmeticOperationMap.put("add", addOperation);
        arithmeticOperationMap.put("subtract", subtractOperation);
        arithmeticOperationMap.put("multiply", multiplyOperation);
        arithmeticOperationMap.put("divide", divideOperation);
        arithmeticOperationMap.put("cancel", cancelOperation);
        arithmeticOperationMap.put("abs", absoluteOperation);
        arithmeticOperationMap.put("neg", negativeOperation);
        arithmeticOperationMap.put("sqr", squareOperation);
        arithmeticOperationMap.put("sqrt", squareRootOperation);
        arithmeticOperationMap.put("cube", cubeOperation);
        arithmeticOperationMap.put("cubert", cubeRootOperation);

        Calculator calculator = new Calculator(calculatorView, arithmeticOperationMap);

        CalculatorController calculatorController = new CalculatorController(calculator, calculatorView);
        calculatorController.execute();
    }
}

package com.twu.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private double result;
    private Map<String, Executable> commandActionMap;
    private CalculatorView calculatorView;

    public Calculator(AddCommand addCommand, SubtractCommand subtractCommand,
                      MultiplyCommand multiplyCommand, DivideCommand divideCommand,
                      CancelCommand cancelCommand, CalculatorView calculatorView) {
        commandActionMap = new HashMap<>();
        commandActionMap.put("add", addCommand);
        commandActionMap.put("subtract", subtractCommand);
        commandActionMap.put("multiply", multiplyCommand);
        commandActionMap.put("divide", divideCommand);
        commandActionMap.put("cancel", cancelCommand);

        this.calculatorView = calculatorView;
    }

    public void execute(String command, double operand) {
        Executable executable = commandActionMap.get(command);
        this.result = executable.execute(result, operand);
        calculatorView.print(result+"");
    }
}
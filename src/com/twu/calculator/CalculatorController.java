package com.twu.calculator;

import java.util.ArrayList;

public class CalculatorController {
    private CalculatorView calculatorView;
    private CalculatorModel calculatorModel;
    private ArrayList<String> previousOperations;

    public CalculatorController(CalculatorModel calculatorModel, CalculatorView calculatorView,
                                ArrayList<String> previousOperations) {
        this.calculatorModel = calculatorModel;
        this.calculatorView = calculatorView;
        this.previousOperations = previousOperations;
    }

    public void start() {
        int repeatCount = 0;
        String input;
        do {
            calculatorView.print(calculatorModel.formattedAccumulator());
            input = calculatorView.read();
            do {
                if (repeatCount > 0) {
                    input = previousOperations.get(previousOperations.size() - repeatCount);
                    repeatCount--;
                }
                String[] token = input.split(" ");
                String operatorName = token[0];
                double operand = 0.0;

                if (inputHasTwoWords(token)) {
                    operand = Double.parseDouble(token[1]);
                }
                if (operatorName.equals("repeat")) {
                    repeatCount = (int) operand;
                } else if (!operatorName.equals("exit"))
                    calculatorModel.execute(operatorName, operand);
            } while (repeatCount > 0);
            previousOperations.add(input);
        } while (!input.equals("exit"));
    }

    private boolean inputHasTwoWords(String[] token) {
        return token.length == 2;
    }

}

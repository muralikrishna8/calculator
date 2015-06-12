package com.twu.calculator;

import java.util.ArrayList;

public class App {
    private View view;
    private Model model;
    private ArrayList<String> history;

    public App(Model model, View view, ArrayList<String> history) {
        this.model = model;
        this.view = view;
        this.history = history;
    }

    public void start() {
        String input;
        do {
            input = tokenizeAndDispatchAndStoringInHistory();
        } while (!input.equals("exit"));
    }

    private String tokenizeAndDispatchAndStoringInHistory() {
        String input;
        int repeatCount = 0;
        view.print(model.formattedAccumulator());
        input = view.read();
        do {
            if (repeatCount > 0) {
                input = history.get(history.size() - repeatCount);
                repeatCount--;
            }
            String[] tokens = splitInput(input);
            String operator = getOperator(tokens);
            double operand = typeCastAndGetOperand(tokens);
            if (operator.equals("repeat")) {
                repeatCount = (int) operand;
            } else if (!operator.equals("exit"))
                model.execute(operator, operand);
        } while (repeatCount > 0);
        history.add(input);
        return input;
    }

    private double typeCastAndGetOperand(String[] tokens) {

        if (inputHasTwoWords(tokens)) {
            String operandAsString = getOperand(tokens);
            return typeCastOperandToDouble(operandAsString);
        }
        return 0.0;
    }

    private double typeCastOperandToDouble(String operandAsString) {
        double operand;
        operand = Double.parseDouble(operandAsString);
        return operand;
    }

    private String getOperand(String[] tokens) {
        return tokens[1];
    }

    private String getOperator(String[] tokens) {
        return tokens[0];
    }

    private String[] splitInput(String input) {
        return input.split(" ");
    }

    private boolean inputHasTwoWords(String[] token) {
        return token.length == 2;
    }

}

package com.twu.calculator;

import java.util.ArrayList;

public class App {
    private View view;
    private Model model;
    private ArrayList<String> previousOperations;

    public App(Model model, View view,
               ArrayList<String> previousOperations) {
        this.model = model;
        this.view = view;
        this.previousOperations = previousOperations;
    }

    public void start() {
        int repeatCount = 0;
        String input;
        do {
            view.print(model.formattedAccumulator());
            input = view.read();
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
                    model.execute(operatorName, operand);
            } while (repeatCount > 0);
            previousOperations.add(input);
        } while (!input.equals("exit"));
    }

    private boolean inputHasTwoWords(String[] token) {
        return token.length == 2;
    }

}

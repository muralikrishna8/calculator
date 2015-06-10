package com.twu.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorControllerTest {

    @Mock
    Calculator mockCalculator;
    @Mock
    CalculatorView mockCalculatorView;

    @Test
    public void shouldSplitTheCommandAndOperand() {
        CalculatorController calculatorController = new CalculatorController(mockCalculator, mockCalculatorView);

        when(mockCalculatorView.read()).thenReturn("add 2");

        calculatorController.commandParser();


        Mockito.verify(mockCalculatorView, times(1)).read();
        Mockito.verify(mockCalculator, times(1)).execute("add", 2.0);
    }

    @Test
    public void shouldExecuteTheCancelCommand() {
        CalculatorController calculatorController = new CalculatorController(mockCalculator, mockCalculatorView);

        when(mockCalculatorView.read()).thenReturn("cancel");

        calculatorController.commandParser();


        Mockito.verify(mockCalculatorView, times(1)).read();
        Mockito.verify(mockCalculator, times(1)).execute("cancel", 0.0);
    }
}
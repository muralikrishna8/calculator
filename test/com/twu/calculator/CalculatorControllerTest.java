package com.twu.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorControllerTest {

    @Mock
    Calculator mockCalculator;
    @Mock
    CalculatorView mockCalculatorView;

    @Test
    public void shouldPerformGivenOperationsAndExit() {
        CalculatorController calculatorController = new CalculatorController(mockCalculator, mockCalculatorView);
        when(mockCalculatorView.read()).thenReturn("add 2", "multiply 3", "exit");

        calculatorController.execute();

        verify(mockCalculatorView, times(3)).read();
        verify(mockCalculator, times(2)).execute(Matchers.any(String.class), Matchers.any(Double.class));
    }

    @Test
    public void shouldExitWhenExitCommandPassed() {
        CalculatorController calculatorController = new CalculatorController(mockCalculator, mockCalculatorView);
        when(mockCalculatorView.read()).thenReturn("exit");

        calculatorController.execute();

        verify(mockCalculatorView, times(1)).read();
        verify(mockCalculator, times(0)).execute("exit", 0.0);
    }

}
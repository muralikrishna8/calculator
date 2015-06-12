package com.twu.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorControllerTest {

    @Mock
    CalculatorModel mockCalculatorModel;
    @Mock
    CalculatorView mockCalculatorView;

    private CalculatorController calculatorController;

    @Before
    public void setUp() {
        ArrayList<String> previousOperations = new ArrayList<>();

        calculatorController = new CalculatorController(mockCalculatorModel,
                mockCalculatorView, previousOperations);

    }

    @Test
    public void shouldPerformGivenOperationsAndExit() {
        when(mockCalculatorView.read()).thenReturn("add 2", "multiply 3", "exit");

        calculatorController.start();

        verify(mockCalculatorView, times(3)).read();
        verify(mockCalculatorModel, times(2)).execute(any(String.class), any(Double.class));
    }

    @Test
    public void shouldExitWhenExitCommandPassed() {
        when(mockCalculatorView.read()).thenReturn("exit");

        calculatorController.start();

        verify(mockCalculatorView, times(1)).read();
        verify(mockCalculatorModel, times(0)).execute("exit", 0.0);
    }

    @Test
    public void shouldRepeatPreviousNOperations() {
        when(mockCalculatorView.read()).thenReturn("add 2", "multiply 3", "repeat 2", "exit");

        calculatorController.start();

        verify(mockCalculatorModel, times(4)).execute(anyString(), anyDouble());
    }

}
package com.twu.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {
    @Mock
    private AddCommand mockAddCommand;

    private Calculator calculator;

    @Test
    public void shouldPerformAdditionOnAddCommand() {
        calculator = new Calculator(mockAddCommand);
        calculator.execute("add", 1.0);

        Mockito.verify(mockAddCommand).execute();
    }
}
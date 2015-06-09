package com.twu.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {
    @Mock
    private AddCommand mockAddCommand;

    @Mock
    private SubtractCommand mockSubtractCommand;

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator(mockAddCommand, mockSubtractCommand);
    }

    @Test
    public void shouldPerformAdditionOnAddCommand() {
        calculator.execute("add", 1.0);

        Mockito.verify(mockAddCommand).execute();
    }

    @Test
    public void shouldPerformSubtractionOnSubtractCommand() {
        calculator.execute("subtract", 3.0);

        Mockito.verify(mockSubtractCommand).execute();
    }
}
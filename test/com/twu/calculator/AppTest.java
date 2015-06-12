package com.twu.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AppTest {

    @Mock
    Model mockModel;
    @Mock
    View mockView;

    private App app;

    @Before
    public void setUp() {
        ArrayList<String> previousOperations = new ArrayList<>();

        app = new App(mockModel,
                mockView, previousOperations);

    }

    @Test
    public void shouldPerformGivenOperationsAndExit() {
        when(mockView.read()).thenReturn("add 2", "multiply 3", "exit");

        app.start();

        verify(mockView, times(3)).read();
        verify(mockModel, times(2)).execute(any(String.class), any(Double.class));
    }

    @Test
    public void shouldExitWhenExitCommandPassed() {
        when(mockView.read()).thenReturn("exit");

        app.start();

        verify(mockView, times(1)).read();
        verify(mockModel, times(0)).execute("exit", 0.0);
    }

    @Test
    public void shouldRepeatPreviousNOperations() {
        when(mockView.read()).thenReturn("add 2", "multiply 3", "repeat 2", "exit");

        app.start();

        verify(mockModel, times(4)).execute(anyString(), anyDouble());
    }

    @Test
    public void shouldGiveTheFormattedAccumulatorValueToViewForDisplaying() {
        when(mockView.read()).thenReturn("exit");
        when(mockModel.formattedAccumulator()).thenReturn("0.0");

        app.start();
        verify(mockView).print("0.0");
    }

}
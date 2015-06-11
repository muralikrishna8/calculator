package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CancelTest {
    @Test
    public void shouldResetTheResultToZero() {
        ArithmeticOperation cancelCommand = new Cancel();

        double actualTotal = cancelCommand.execute(0.0, 0.0);

        assertThat(actualTotal, is(0.0));
    }
}
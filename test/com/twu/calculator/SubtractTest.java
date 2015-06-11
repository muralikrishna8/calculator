package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SubtractTest {
    @Test
    public void shouldSubtractTwoOperands() throws Exception {
        ArithmeticOperation subtractCommand = new Subtract();

        double actualTotal = subtractCommand.execute(1.0, 3.0);

        assertThat(actualTotal, is(-2.0));
    }
}
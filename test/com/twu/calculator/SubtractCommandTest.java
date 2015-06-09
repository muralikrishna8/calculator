package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SubtractCommandTest {
    @Test
    public void shouldSubtractTwoOperands() throws Exception {
        Executable subtractCommand = new SubtractCommand();

        double actualTotal = subtractCommand.execute(1.0, 3.0);

        assertThat(actualTotal, is(-2.0));
    }
}
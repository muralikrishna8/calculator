package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DivideCommandTest {
    @Test
    public void shouldDivideTwoOperands() throws Exception {
        Executable divideCommand = new DivideCommand();

        double actualTotal = divideCommand.execute(6.0, 3.0);

        assertThat(actualTotal, is(2.0));
    }
}
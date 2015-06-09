package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiplyCommandTest {
    @Test
    public void shouldMultiplyTwoOperands() throws Exception {
        Executable multiplyCommand = new MultiplyCommand();

        double actualTotal = multiplyCommand.execute(2.0, 3.0);

        assertThat(actualTotal, is(6.0));
    }
}
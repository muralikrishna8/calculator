package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AddCommandTest {
    @Test
    public void shouldAddTwoOperands() throws Exception {
        Executable addCommand = new AddCommand();

        double actualTotal = addCommand.execute(1.0, 3.0);

        assertThat(actualTotal, is(4.0));
    }
}
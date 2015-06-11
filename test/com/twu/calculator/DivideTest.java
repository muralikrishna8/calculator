package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DivideTest {
    @Test
    public void shouldDivideTwoOperands() throws Exception {
        ArithmeticOperation divideCommand = new Divide();

        double actualTotal = divideCommand.execute(6.0, 3.0);

        assertThat(actualTotal, is(2.0));
    }
}
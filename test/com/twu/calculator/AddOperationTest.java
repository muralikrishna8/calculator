package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AddOperationTest {
    @Test
    public void shouldAddTwoOperands() throws Exception {
        ArithmeticOperation addCommand = new AddOperation();

        double actualTotal = addCommand.execute(1.0, 3.0);

        assertThat(actualTotal, is(4.0));
    }
}
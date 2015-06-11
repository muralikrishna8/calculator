package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiplyOperationTest {
    @Test
    public void shouldMultiplyTwoOperands() throws Exception {
        ArithmeticOperation multiplyCommand = new MultiplyOperation();

        double actualTotal = multiplyCommand.execute(2.0, 3.0);

        assertThat(actualTotal, is(6.0));
    }
}
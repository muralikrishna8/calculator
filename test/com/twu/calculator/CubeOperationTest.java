package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CubeOperationTest {
    @Test
    public void shouldDivideTwoOperands() throws Exception {
        CubeOperation cubeOperation = new CubeOperation();

        double actualAccumulator = cubeOperation.execute(4.0, 0.0);

        assertThat(actualAccumulator, is(64.0));
    }
}
package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CubeRootOperationTest {
    @Test
    public void shouldDivideTwoOperands() throws Exception {
        CubeRootOperation cubeRootOperation = new CubeRootOperation();

        double actualAccumulator = cubeRootOperation.execute(64.0, 0.0);

        assertThat(actualAccumulator, is(4.0));
    }
}
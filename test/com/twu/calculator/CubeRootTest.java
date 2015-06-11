package com.twu.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CubeRootTest {
    @Test
    public void shouldDivideTwoOperands() throws Exception {
        CubeRoot cubeRoot = new CubeRoot();

        double actualAccumulator = cubeRoot.execute(64.0, 0.0);

        assertThat(actualAccumulator, is(4.0));
    }
}
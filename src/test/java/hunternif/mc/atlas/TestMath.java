package hunternif.mc.atlas;

import static org.junit.Assert.*;

import org.junit.Test;

import hunternif.mc.atlas.util.MathUtil;

public class TestMath {

    @Test
    public void ceilAbsToBase() {
        assertEquals(-2, MathUtil.ceilAbsToBase(-2, 1));
        assertEquals(-4, MathUtil.ceilAbsToBase(-3, 2));
        assertEquals(4, MathUtil.ceilAbsToBase(3, 2));
    }
}

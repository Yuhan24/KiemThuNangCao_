package com.example.kiemthunangcao.Demo02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestPhanTuNhoNhat {
    @Test
    public void testFindMinElement() {
        PhanTuNhoNhat finder = new PhanTuNhoNhat();
        assertEquals(1, finder.findMinElement(new int[]{3, 5, 1, 9}));
        assertEquals(-4, finder.findMinElement(new int[]{-1, -2, -4, 0}));
        assertThrows(IllegalArgumentException.class, () -> finder.findMinElement(new int[]{}));
    }
}

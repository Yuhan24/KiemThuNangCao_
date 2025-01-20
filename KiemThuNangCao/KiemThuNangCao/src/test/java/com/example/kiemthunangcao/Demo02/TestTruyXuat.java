package com.example.kiemthunangcao.Demo02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTruyXuat {
    @Test
    public void testGetElementAtIndex() {
        TruyXuat arrayElement = new TruyXuat();
        int[] array = {11, 22, 33, 44, 55};
        assertEquals(33, arrayElement.getElementAtIndex(array, 2));
        assertEquals(11, arrayElement.getElementAtIndex(array, 0));
        assertThrows(IndexOutOfBoundsException.class, () -> arrayElement.getElementAtIndex(array, -5));
        assertThrows(IndexOutOfBoundsException.class, () -> arrayElement.getElementAtIndex(array, 10));
    }
}

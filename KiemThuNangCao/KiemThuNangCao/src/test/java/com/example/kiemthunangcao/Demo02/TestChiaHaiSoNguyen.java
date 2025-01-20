package com.example.kiemthunangcao.Demo02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestChiaHaiSoNguyen {
    @Test
    public void testChia(){
        Chia2So validate = new Chia2So();
        assertEquals(5,validate.Chia2So(9,3));
        assertEquals(-5,validate.Chia2So(-9,3));
        assertEquals(0,validate.Chia2So(0,11));
        assertEquals(123,validate.Chia2So(123,1));
        assertEquals(-123,validate.Chia2So(123,-1));
        assertEquals(5,validate.Chia2So(-15,-5));
        assertThrows(ArithmeticException.class,() -> validate.Chia2So(11,0));
        assertEquals(1,validate.Chia2So(Integer.MAX_VALUE, Integer.MAX_VALUE));
        assertEquals(1,validate.Chia2So(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
}

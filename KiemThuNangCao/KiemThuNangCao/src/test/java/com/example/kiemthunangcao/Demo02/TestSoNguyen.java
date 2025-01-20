package com.example.kiemthunangcao.Demo02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSoNguyen {
    @Test
    public void testSoNguyen(){
        KiemTraSo validate = new KiemTraSo();
        assertTrue(validate.ktrasoNguyen("443"));
        assertTrue(validate.ktrasoNguyen("-111"));
        assertTrue(validate.ktrasoNguyen("0"));
        assertTrue(validate.ktrasoNguyen("34.34"));
        assertTrue(validate.ktrasoNguyen(""));
        assertTrue(validate.ktrasoNguyen(" "));
        assertTrue(validate.ktrasoNguyen("!@#$"));
        assertTrue(validate.ktrasoNguyen("00000011111"));
        assertTrue(validate.ktrasoNguyen("conmeo"));
        assertTrue(validate.ktrasoNguyen("    a "));
    }
}

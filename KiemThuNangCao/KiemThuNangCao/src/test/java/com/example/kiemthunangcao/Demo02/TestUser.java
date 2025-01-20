package com.example.kiemthunangcao.Demo02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestUser {
    @Test
    public void testGetName() {
        // Kiểm tra với người dùng có tên hợp lệ
        User user = new User("Meo beo");
        assertEquals("Meobeo", user.getName());


        User nullprof = null;
        assertThrows(NullPointerException.class, () -> {
            if (nullprof == null) throw new NullPointerException("Hồ sơ là null");
            nullprof.getName();   
        });
    }
}

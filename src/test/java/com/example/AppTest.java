package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testGreet() {
        assertEquals("Hello AWS", App.greet("AWS"));
    }
}

package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testBasicAddition() {
        assertEquals(5, App.add(2, 3), "2 + 3 має дорівнювати 5");
    }
}

package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CseControllerTest {

    @Test
    public void testAddCSE() {
        CseController controller = new CseController();
        String result = controller.addCSE(10, 5);
        String expected = "The value is 15 and  ROLL NUMBER is 24P35A0541";
        assertEquals(expected, result);
    }
}
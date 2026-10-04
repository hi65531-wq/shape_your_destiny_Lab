package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test 
    public void testArea() {
        Rectangle rectangle = new Rectangle(5, 8);
        assertEquals(40.0, rectangle.getArea(), 0.001);
    }

    @Test 
    public void testPerimeter() {
        Rectangle rectangle = new Rectangle(5, 8);
        assertEquals(26.0, rectangle.getPerimeter(), 0.001);
    }

    @Test 
    public void testNumberOfSides() {
        Rectangle rectangle = new Rectangle(5, 8);
        assertEquals(4, rectangle.numberOfSides());
    }

}

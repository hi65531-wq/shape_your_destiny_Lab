package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    public void testArea() {
        Circle circle = new Circle(3);

        assertEquals(28.2743, circle.getArea(), 0.001);
    }

    @Test
    public void testPerimeter() {
        Circle circle = new Circle(3);

        assertEquals(18.8496, circle.getPerimeter(), 0.001);
    }
}
package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RightTriangleTest {
    @Test
    public void testArea() {
        RightTriangle rightTriangle = new RightTriangle(6, 8);
        assertEquals(24.0, rightTriangle.getArea(), 0.001 );
    }

    @Test
    public void testPerimeter() {
        RightTriangle rightTriangle = new RightTriangle(6, 8);
        assertEquals(24.0, rightTriangle.getPerimeter(), 0.001);
    }

    @Test 
    public void testNumberOfSides() {
        RightTriangle rightTriangle = new RightTriangle(6, 8);
        assertEquals(3, rightTriangle.numberOfSides());
    }
}

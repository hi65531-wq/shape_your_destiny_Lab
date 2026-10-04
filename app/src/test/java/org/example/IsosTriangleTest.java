package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IsosTriangleTest {
    @Test 
    public void testArea() {
        IsosTriangle isosTriangle = new IsosTriangle(6);
        assertEquals(18.0, isosTriangle.getArea(), 0.001);
    }

    @Test 
    public void testPerimeter() {
        IsosTriangle isosTriangle = new IsosTriangle(6);
        assertEquals(20.4853, isosTriangle.getPerimeter(), 0.001);
    }
}

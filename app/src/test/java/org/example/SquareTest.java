package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test 
    public void testArea() {
        Square square = new Square(3);
        assertEquals(9.0, square.getArea(), 0.001);
    }

    @Test 
    public void testPerimeter() {
        Square square = new Square(3);
        assertEquals(12.0, square.getPerimeter(), 0.001);
    }
    
}

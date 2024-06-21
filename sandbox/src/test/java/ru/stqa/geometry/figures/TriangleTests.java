package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTests {

    @Test
    void  canCalculatePerimeter() {
        var result = Triangle.Perimeter(2, 3, 4);
        assertEquals(9, result);
    }
    @Test
    void canCalculateSquare(){
        var result = Triangle.Square(2,3,4);
        assertEquals(2.9047375096555625, result);

    }
}

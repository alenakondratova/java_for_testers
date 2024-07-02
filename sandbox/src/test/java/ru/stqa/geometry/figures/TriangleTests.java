package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTests {

    @Test
    void  canCalculatePerimeter() {
        var p = new Triangle(2,3,4);
        double result = p.perimeterArea();
        assertEquals(9, result);
    }
    @Test
    void canCalculateSquare(){
               assertEquals(2.9047375096555625, new Triangle(2,3,4).squareArea());
    }
}

package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(2.0);
    }

    @Test
    void radius() {
        assertEquals(2.0, circle.radius()); // getter
    }

    @Test
    void calcArea() {
        assertEquals(2.0 * 2.0 * Math.PI, circle.calcArea());         // area = pi r squared
    }

    @Test
    void calcCircumference() {              //circumference = PI * d ( 2 x r)
        assertEquals(2.0 * 2.0 * Math.PI, circle.calcCircumference());
    }
}
package com.example;

public record Circle(double radius) {
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    public double calcCircumference() {
        return Math.PI * 2 * 2.0;
    }
}


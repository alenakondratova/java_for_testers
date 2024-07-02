package ru.stqa.geometry.figures;

import static java.lang.Math.sqrt;

public class Triangle {

   double sideA;
   double sideB;
   double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public static void printSquareArea(Triangle t) {
        String text = String.format("площадь треугольника = " +  t.squareArea());
        System.out.println(text);

   }

    public static void printPerimeterArea (Triangle t){
        String text = String.format("периметр треугольника = " + t.perimeterArea());
        System.out.println(text);

   }


    public double perimeterArea() {
        return this.sideA + this.sideB + this.sideC;
    }

    public double squareArea() {
        double s = perimeterArea()/2;
        double Square = sqrt(s*(s-this.sideA)*(s-this.sideB)*(s-this.sideC));
        return Square;
    }
}

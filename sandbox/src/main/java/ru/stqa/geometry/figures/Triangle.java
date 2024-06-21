package ru.stqa.geometry.figures;

import static java.lang.Math.sqrt;

public class Triangle {
    public static void main(String[] args) {
        var a = 6;
        var b = 7;
        var c = 8;
        Perimeter(a, b, c);
        Square (a, b, c);
        System.out.println(Perimeter(a, b, c));
        System.out.println(Square(a, b, c));
    }

    public static double Square(double a, double b, double c) {
        double s = Perimeter(a, b, c)/2;
        double Square = sqrt(s*(s-a)*(s-b)*(s-c));
        return Square;
    }

    public static double Perimeter (double a, double b, double c){
        double Perimeter = a+b+c;
        return Perimeter;
    }
}

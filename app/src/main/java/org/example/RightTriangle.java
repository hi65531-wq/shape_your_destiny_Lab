package org.example;

public class RightTriangle extends Shape {
    private double legL;
    private double legW;

    public RightTriangle(double legL, double legW)
    {
        this.legL = legL;
        this.legW = legW;
    }

    @Override
    public double getArea(){
        return 0.5 * legL * legW;
    }

    @Override 
    public double getPerimeter() {
        double hypotenuse = Math.sqrt (
            legL * legL + legW * legW
        );

        return legL + legW + hypotenuse;
    }

}
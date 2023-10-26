package session13_recap.challenges.polymorphism;

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double area() {
        double s = getSemiPerimeter();
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public double getSemiPerimeter() {
        return (sideA + sideB + sideC) / 2;
    }

    @Override
    public String toString(){
        return "side A: " + sideA + " side B: " + sideB + " side C: " + sideC;
    }
}

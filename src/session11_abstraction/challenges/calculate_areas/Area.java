package session11_abstraction.challenges.calculate_areas;

public class Area extends Shape {
    @Override
    public void rectangleArea(double length, double width) {
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is: " + (length * width));
    }

    @Override
    public void squareArea(double side) {
        System.out.println("The area of the square with the side " + side + " is: " + (side * side));
    }

    @Override
    public void circleArea(double radius) {
        System.out.println("The area of the circle with radius " + radius + " is: " + (Math.PI * Math.pow(radius, 2)));
    }
}

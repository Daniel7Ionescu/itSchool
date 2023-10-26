package session11_abstraction.challenges.calculate_areas;

import java.text.DecimalFormat;

public class CalculateAreaApp {

    public static void main(String[] args) {
        Area area = new Area();

        area.rectangleArea(10, 5);
        area.squareArea(3);
        area.circleArea(3);
    }
}

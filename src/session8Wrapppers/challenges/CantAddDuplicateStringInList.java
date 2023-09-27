package session8Wrapppers.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CantAddDuplicateStringInList {

    public static void main(String[] args) {
        String[] starterCityNames = {"Tokyo", "London", "Bucharest", "New York", "Paris"};
        List<String> cityNames = new ArrayList<>();
        populateArray(starterCityNames, cityNames);

        addCityName(cityNames);
    }

    private static void addCityName(List<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a city name:");
        String cityName = scanner.nextLine();

        if (list.contains(cityName)) {
            System.out.println("That name is a duplicate.");
        } else {
            list.add(cityName);
            System.out.println("List of city names: " + list);
        }
        scanner.close();
    }

    private static void populateArray(String[] sourceArr, List<String> targetArr) {
        for (String item : sourceArr) {
            targetArr.add(item);
        }
    }
}

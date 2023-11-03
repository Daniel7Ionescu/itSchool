package session18_recap.challenges.filter_persons_17;

import java.util.Arrays;
import java.util.List;

public class FilterPersonApp {

    public static void main(String[] args) {
        //Problem 17
        //Given a list of Person objects with age and city attributes,
        //filter out people younger than 18 or those who live in the city "Metropolis",
        //then return a list of names of the remaining people, sorted in reverse order.

        List<Person> personList = Arrays.asList(
                new Person("Eric", 21, "Metropolis"),
                new Person("Wendy", 17, "Metropolis"),
                new Person("Stan", 25, "Southpark"),
                new Person("Kenny", 16, "Metropolis"));

        List<Person> filteredPersons = filterByAgeAndCity(personList, 18, "Metropolis");
        System.out.println(filteredPersons);
    }

    private static List<Person> filterByAgeAndCity(List<Person> inputList, int age, String city) {
        return inputList.stream()
                .filter(person -> person.getAge() < age || person.getCityName().equals(city))
                .toList();
    }
}

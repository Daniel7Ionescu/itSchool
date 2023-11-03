package session18_recap.challenges.generic_class_list_wrapper_20;

public class ListWrapperApp {

    public static void main(String[] args) {
        //Problem 20
        //Create a generic class ListWrapper<T> that holds an ArrayList<T>.
        //Implement methods to add an item, get an item by index, and get the size of the list

        ListWrapper<String> stringListWrapper = new ListWrapper<>();

        System.out.printf("Starting list size: %d%n", stringListWrapper.getListSize());
        //adding some items
        stringListWrapper.addItemToList("Football");
        stringListWrapper.addItemToList("Bowling ball");
        stringListWrapper.addItemToList("Basketball");
        System.out.printf("Size of the list now: %d%n", stringListWrapper.getListSize());
        System.out.printf("The second item: %s%n", stringListWrapper.getItemByIndex(1));
    }
}

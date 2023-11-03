package session18_recap.challenges.generic_class_list_wrapper_20;

import java.util.ArrayList;
import java.util.List;

public class ListWrapper<T> {

    private List<T> tList;

    public ListWrapper(){
        tList = new ArrayList<>();
    }

    public int getListSize(){
        return tList.size();
    }

    public T getItemByIndex(int index) {
        return tList.get(index);
    }

    public void addItemToList(T item){
        tList.add(item);
    }

    public List<T> gettList() {
        return tList;
    }

    public void settList(List<T> tList) {
        this.tList = tList;
    }


}

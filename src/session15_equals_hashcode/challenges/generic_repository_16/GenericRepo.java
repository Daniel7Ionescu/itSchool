package session15_equals_hashcode.challenges.generic_repository_16;

import java.util.HashMap;
import java.util.Map;
public class GenericRepo <T>{

    private Map<T, Integer> repository;

    public GenericRepo(){
        repository = new HashMap<>();
    }

    public void addObject(T object){
        repository.put(object, repository.getOrDefault(object, 0) + 1);
    }


    public Map<T, Integer> getRepository() {
        return repository;
    }
}

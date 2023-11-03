package session18_recap.challenges.class_pair_16;

import lombok.AllArgsConstructor;
import lombok.Data;


public class ClassPair<T, U> {

    private T tType;
    private U uType;

    public T gettType() {
        return tType;
    }

    public void settType(T tType) {
        this.tType = tType;
    }

    public U getuType() {
        return uType;
    }

    public void setuType(U uType) {
        this.uType = uType;
    }
}

package session16_lambda_functional_interface.challenges.pair_maker_14;

public class Pair <T, U>{

    T tValue;
    U uValue;

    public Pair(T tValue, U uValue) {
        this.tValue = tValue;
        this.uValue = uValue;
    }

    public T gettValue() {
        return tValue;
    }

    public void settValue(T tValue) {
        this.tValue = tValue;
    }

    public U getuValue() {
        return uValue;
    }

    public void setuValue(U uValue) {
        this.uValue = uValue;
    }

    @Override
    public String toString() {
        return tValue + " : " + uValue;
    }
}

package session16_lambda_functional_interface.challenges.pair_maker_14;

public class TestPairMaker {

    public static void main(String[] args) {
        PairMaker pairMaker = (t, u) -> new Pair(t, u);

        Pair<String, Integer> pair1 = pairMaker.returnPairObject("Balloons", 10);
        Pair<Double, String> pair2 = pairMaker.returnPairObject(45.5, "degrees");
        Pair<String, Boolean> pair3 = pairMaker.returnPairObject("Duck", true);

        System.out.println("pair1 String, Integer: " + pair1);
        System.out.println("pair2 Double, String: " + pair2);
        System.out.println("pair3 String, Boolean: " + pair3);
    }
}

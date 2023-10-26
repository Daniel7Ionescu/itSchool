package session16_lambda_functional_interface.challenges.pair_maker_14;

@FunctionalInterface
public interface PairMaker<T, U> {

    Pair<T, U> returnPairObject(T t, U u);
}

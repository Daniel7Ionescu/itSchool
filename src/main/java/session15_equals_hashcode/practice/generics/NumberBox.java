package session15_equals_hashcode.practice.generics;

public class NumberBox <T extends Number>{

    private T number;

    public void setNumber(T number) {
        this.number = number;
    }

    public double getNumberAsDouble(){
        return number.doubleValue();
    }

    public static void main(String[] args) {
        NumberBox<Integer> integerNumberBox = new NumberBox<>();
        integerNumberBox.setNumber(16);
        System.out.println(integerNumberBox.getNumberAsDouble());
    }
}

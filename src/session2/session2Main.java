package session2;

public class session2Main {
    public static void main(String[] args) {

//        ==Using Variables==
        SomeVariables someVariables = new SomeVariables();
        someVariables.showVariables();

//        ==Operations==
        Calculator basicCalc = new Calculator();
        double basicCalcResult;

        //Addition
        basicCalcResult = basicCalc.add(3, 7.2);
        System.out.println(basicCalcResult);

        //Subtraction
        basicCalcResult = basicCalc.sub(5, 2);
        System.out.println(basicCalcResult);

        //Multiplication
        basicCalcResult = basicCalc.multi(2,3);
        System.out.println(basicCalcResult);

        //Division
        basicCalcResult = basicCalc.div(4,3);
        System.out.println(basicCalcResult);

        //Modulo/Remainder
        basicCalcResult = basicCalc.modulo(10, 3);
        System.out.println(basicCalcResult);

        // ==Input/Output Calculator==
        InputCalculator inputCalc = new InputCalculator();
        inputCalc.calculate();
    }
}

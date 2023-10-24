package session16_lambda_functional_interface.practice.functional_interface;

public class TestGreetingServiceApp {

    public static void main(String[] args) {
        //anonymous class
        GreetingService anonGreetingService = new GreetingService() {
            @Override
            public void greet(String message) {
                System.out.println("Hello " + message);
            }
        };
        anonGreetingService.greet("Ana");

        //lambda
        GreetingService lambdaGreetingService = message -> System.out.println("Hello " +message);
        lambdaGreetingService.greet("Maria");

    }
}

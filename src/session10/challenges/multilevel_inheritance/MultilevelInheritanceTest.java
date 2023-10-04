package session10.challenges.multilevel_inheritance;

public class MultilevelInheritanceTest {

    public static void main(String[] args) {
        ElectricCar electricCar1 = new ElectricCar("Electro Future", "Lightning III", 2022);
        electricCar1.setRange(280);
        electricCar1.setBatteryCapacity(40);

        System.out.println(electricCar1);
        electricCar1.charge();

        System.out.println("===================");
        Tesla tesla1 = new Tesla("Tesla", "Tesla Y", 2022);
        tesla1.setRange(350);
        tesla1.setBatteryCapacity(57);
        tesla1.setAutopilotVersion("ChatGPT tiktok edition gl LOL");

        System.out.println(tesla1);
    }
}

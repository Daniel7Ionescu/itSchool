package session10.challenges.single_inheritance;

public class Bicycle {
    private int speed;
    private int gear;

    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public void changeGear(char symbol) {
        //shifting up
        if (symbol == '+') {
            if (gear + 1 <= 12) {
                gear++;
                System.out.println("Shifted up!");
            } else {
                System.out.println("You are already in the highest gear.");
            }
        }
        //shifting down
        else if (symbol == '-') {
            if (--gear > 0) {
                gear--;
                System.out.println("Shifted down!");
            } else {
                System.out.println("You are in the lowest gear already.");
            }
        }
    }

    public void speedUp(int addedValue) {
        speed += addedValue;
        System.out.println("You are speeding up!");
    }

    public void applyBrake(int amount) {
        if (speed - amount <= 0) {
            speed = 0;
            System.out.println("You have come to a full stop.");
            return;
        }

        speed -= amount;
        System.out.println("Applying brake, going slower now: " + speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}

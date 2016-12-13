package main.java_learn;

/**
 * Created by wwang on 12/7/2016.
 */
class ABCBicycle implements Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public int getCadence() {
        return cadence;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public int getSpeed() {
        return speed;
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    void printState() {
        System.out.println("cadence: " +
            cadence + " speed: " +
            speed + " gear: " + gear);
    }
}

class MontainBike extends ABCBicycle {

    // new fields and methods defining a montain bike would go here
}

interface Bicycle {

    // wheel revolutions per minutes
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}

public class BicycleDemo {
    public static void main(String[] args) {

        // Create two different ABCBicycle objects
        ABCBicycle bike1 = new ABCBicycle();
        ABCBicycle bike2 = new ABCBicycle();

        // Invoke methods on those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printState();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printState();
    }
}


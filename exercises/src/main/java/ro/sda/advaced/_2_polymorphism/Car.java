package ro.sda.advaced._2_polymorphism;

public class Car {

    private boolean hasEngine;
    private String name;
    private int noCylinders;

    public Car(boolean hasEngine, String name, int noCylinders) {
        this.hasEngine = hasEngine;
        this.noCylinders = noCylinders;
        this.name = name;
    }

    public void startEngine() {

    }

    public void accelerate() {

    }

    public void brake() {

    }

    public void nos(){

    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public String getName() {
        return name;
    }

    public int getNoCylinders() {
        return noCylinders;
    }
}

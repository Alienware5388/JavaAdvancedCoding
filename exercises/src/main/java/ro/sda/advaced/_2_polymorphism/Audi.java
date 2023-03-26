package ro.sda.advaced._2_polymorphism;

public class Audi extends Car {


    public Audi(boolean hasEngine, String name, int noCylinders) {
        super(hasEngine, name, noCylinders);
    }

    @Override
    public void startEngine() {

        System.out.println("Audi ---> Start engine!");

    }

    @Override
    public void accelerate() {
        System.out.println("Audi ---> Accelerate!");
    }

    @Override
    public void brake() {
        System.out.println("Audi ---> BRAKE! ");
    }


    public void nos() {
        System.out.println("Audi ---> NoS !!!");
    }
}

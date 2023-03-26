package ro.sda.advaced._2_polymorphism;

public class Ford extends Car {

    public Ford(boolean hasEngine, String name, int noCylinders) {
        super(hasEngine, name, noCylinders);
    }

    @Override
    public void startEngine() {

        System.out.println("Ford ---> Start engine!");

    }

    @Override
    public void accelerate() {
        System.out.println("Ford ---> Accelerate!");
    }

    @Override
    public void brake() {
        System.out.println("Ford ---> BRAKE! ");
    }


}

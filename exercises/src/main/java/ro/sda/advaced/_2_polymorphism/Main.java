package ro.sda.advaced._2_polymorphism;

public class Main {

    public static void main(String[] args) {

        //Car car = new Car(true, "myCar", 4);
        //car.startEngine();
        //car.accelerate();

        Audi audi = new Audi(true, "A5", 6);
        audi.startEngine();
        audi.accelerate();
        audi.nos();

        System.out.println("---------------------------------------------");

        Car audi2 = new Audi(true, "A6", 6);
        audi.startEngine();
        audi.accelerate();

        System.out.println("-----------------------------------------------");

        Ford ford = new Ford(true, "Focus", 4);
        ford.startEngine();
        ford.accelerate();

        Audi castedAudi = (Audi) audi2;

        castedAudi.nos();

        ((Audi)audi2).nos();
    }

}


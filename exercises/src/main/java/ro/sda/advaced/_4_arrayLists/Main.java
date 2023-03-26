package ro.sda.advaced._4_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Branch b = new Branch("ING_P_ta_Unirii");

        b.addCustomer("Catalin", 100);
        b.addCustomer("Mihai", 200);
        b.addCustomer("Catalin", 500);
        b.addCustomer("Andrei", 300);

        System.out.println("------------------");

        Customer duplicate = new Customer("Catalin", 5000);




    }

}

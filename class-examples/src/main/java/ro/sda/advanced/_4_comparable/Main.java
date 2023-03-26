package ro.sda.advanced._4_comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        array.add(9);
        array.add(6);
        array.add(8);
        array.add(4);

        // Lambda     --->  array.forEach((el)-> System.out.println(el));

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));

        }

        Collections.sort(array);
        System.out.println("----------------------");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));

        }


        ArrayList<Person> personList = new ArrayList<>();

        personList.add(new Person("Mihai", 40));
        personList.add(new Person("Roland", 30));
        personList.add(new Person("Catalin", 25));
        personList.add(new Person("James", 65));

        for (int i = 0; i < personList.size(); i++) {
            System.out.println(array.get(i));

        }
        Collections.sort(personList);
        System.out.println("---------------------------------");

    }
}


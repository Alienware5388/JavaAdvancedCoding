package ro.sda.advanced._2_linkedlist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        List<String> myList = new LinkedList<>();

        myList.add("a");
        myList.add("b");
        myList.add("c");

        System.out.println(myList.get(2));

        System.out.println(myList.contains("c"));

        System.out.println(myList.size());

        //Queue - First In First Out !

        Queue <String> queue = new LinkedList<>();

        while (!queue.isEmpty()){
            String  current = queue.poll();
            System.out.println(current);
        }

        System.out.println("---------------------------------");

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        LinkedList <Integer> myLinkedList = new LinkedList<>(arrayList);

        for (Integer i: myLinkedList){
            System.out.println(i);
        }

    }

}

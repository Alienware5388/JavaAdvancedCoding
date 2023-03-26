package ro.sda.advanced._1_araylist;

public class SimpleArray {
    public static void main(String[] args) {

        String[] array = new String [3];

        array[0]="element one";
        array[1]="element two";
        array[2]="element three";

        for(String el:array){
            System.out.println(el);
        }

        System.out.println("-------------------------------------");

        for (int i=0 ; i<array.length;i++){
            System.out.println(array[i]);

        }

        try {
            array[3] = "element 4";
        } catch (Exception e){
            System.out.println("Exception caught! " + e.getMessage());
        }

        System.out.println("---------------------------------------");

        System.out.println("You are ran out of bounds ---> no space in the array for the 3rd position ");

    }
}
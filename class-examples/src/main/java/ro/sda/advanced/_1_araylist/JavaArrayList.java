package ro.sda.advanced._1_araylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class JavaArrayList {
    public static void main(String[] args) {

        List<String> mylist = new ArrayList<>();

        mylist.add("String 1");
        mylist.add("String 2");
        mylist.add("String 3");
        mylist.add("String 4");

        mylist.remove(1);
        mylist.set(2, "another element");

        for (String s:mylist){
            System.out.println(s);
        }

        mylist.clear();

        System.out.println("----------");

        System.out.println(mylist);


        System.out.println(mylist.contains("String 2"));

        List<MyClass> anotherList = new ArrayList<>();

        anotherList.add(new MyClass("a"));
        anotherList.add(new MyClass("b"));
        anotherList.add(new MyClass("c"));

        System.out.println(anotherList.contains(new MyClass("b")));

    }
}

class MyClass{
    String name;

    public MyClass(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return name.equals(myClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
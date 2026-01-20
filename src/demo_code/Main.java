package demo_code;
//import java.util.ArrayList;
//import java.util.Scanner;
import com.sun.jdi.IntegerType;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Person[] persons = new Person[10];
        persons[0] = new Person("John 1", 2);
        persons[1] = new Person("John 2", 3);
        persons[2] = new Person("John 3", 4);

        int i = 42;


        ArrayList<Person> p1 = new ArrayList<>();

        p1.add(persons[0]);
        p1.add(persons[1]);
        p1.add(new Person("John 4", 5));
        System.out.println(p1.get(2));

        Person prs = new Person("John Smith", 1);

        System.out.println(prs.getAge());
        prs.getOlder();
        System.out.println(prs.getAge());

        System.out.println("Person: " + prs.toString());
    }
}

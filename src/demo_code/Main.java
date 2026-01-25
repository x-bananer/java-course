package demo_code;
//import java.util.ArrayList;
//import java.util.Scanner;
import com.sun.jdi.IntegerType;

import java.util.*;

//public class Main {
//    public static void main(String[] args) {
//
//        Person[] persons = new Person[10];
//        persons[0] = new Person("John 1", 2);
//        persons[1] = new Person("John 2", 3);
//        persons[2] = new Person("John 3", 4);
//
//        int i = 42;
//
//
//        ArrayList<Person> p1 = new ArrayList<>();
//
//        p1.add(persons[0]);
//        p1.add(persons[1]);
//        p1.add(new Person("John 4", 5));
//        System.out.println(p1.get(2));
//
//        Person prs = new Person("John Smith", 1);
//
//        System.out.println(prs.getAge());
//        prs.getOlder();
//        System.out.println(prs.getAge());
//
//        System.out.println("Person: " + prs.toString());
//    }
//}

// Inheritance
public class Main {
    public static void main(String[] args) {
        Part part = new Part("osa=123", "finnair", "jokin osa", 100);
        Engine engine = new Engine("turboprop", "ep4682", "Europrop", "Airbus A400M", 38e6f);
        System.out.println(engine.getIdentifier());
        System.out.println(part.getIdentifier());

//        Radar radar = new Radar(17.5f, "r2156", "Thales", "AirMaster", 1.3e6f);
//        System.out.println(radar.getPeakPower() + "kW");
//        System.out.println(radar.getManufacturer());
    }
}

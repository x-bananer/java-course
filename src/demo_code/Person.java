package demo_code;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = Math.max(0, age);
    }

    public void getOlder() {
        this.age++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return this.name + ", " + this.age + "v";
    }

//    public static void main(String[] args) {
//
//    }
}
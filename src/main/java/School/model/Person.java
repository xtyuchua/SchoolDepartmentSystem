package School.model;

public abstract class Person {

    static String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void performRole();
}

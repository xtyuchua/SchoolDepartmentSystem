package School.model;

public class Applicant {

    String name;
    int age;

    public Applicant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

package School.model;

public class Student extends Person {

    public Student(String name, int age) {
        super(name, age);
    }

    public void takeCourse(Course course) {
        System.out.println(name + "takes" + course.getTitle());
    }

    @Override
    public void performRole() {
        System.out.println("Student studying");
    }
}

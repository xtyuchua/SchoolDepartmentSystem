package School.model;

import School.model.Course;

public class Teacher extends Staff {

    public Teacher(String name, int id) {
        super(name, id);
    }

    @Override
    public void performRole() {
        System.out.println("Teacher teaching students");
    }

    public static void teachCourse(Course course) {
        System.out.println(getName() + " teaches " + course.getTitle());
    }

    @Override
    public void performDuties() {
        System.out.println("Teacher teaching students");
    }

}




package School.model;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {

    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);

    }
}

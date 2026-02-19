package School.Service;
import java.util.ArrayList;
import School.model.Student;
import School.model.Staff;

public class School {

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Staff> staffs = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addStaff(Staff staff) {
        staffs.add(staff);
    }
}

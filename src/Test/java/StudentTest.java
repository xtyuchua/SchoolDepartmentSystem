package java;

import org.junit.jupiter.api.Test;
import School.model.*;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    void studentShouldTakeCourse() {

        Student student = new Student("Chris", 14);
        Course course = new Course("English");

        assertDoesNotThrow(() ->
                student.takeCourse(course)
        );
    }
}


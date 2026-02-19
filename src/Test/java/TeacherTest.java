package java;

    import org.junit.jupiter.api.Test;
import School.model.*;

import static org.junit.jupiter.api.Assertions.*;

    public class TeacherTest {

        @Test
        void teacherShouldTeachCourse() {

            Teacher teacher = new Teacher("James", 2);
            Course course = new Course("Mathematics");

            assertDoesNotThrow(() ->
                    teacher.teachCourse(course)
            );
        }
    }


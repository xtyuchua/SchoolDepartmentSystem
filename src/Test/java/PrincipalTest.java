import School.model.Applicant;
import School.model.Principal;
import School.model.Student;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import School.model.*;

@Nested
class PrincipalTest {

        @Test
        void shouldAdmitApplicantAboveAgeLimit() {

            Principal principal = new Principal("Mr John", 1,1);
            Applicant applicant = new Applicant("Alice", 15);

            Student student = principal.admitApplicant(applicant);

            assertNotNull(student);
        }
    }

    @Test
    void shouldRejectUnderAgeApplicant() {

        Principal principal = new Principal("Mr John", 1, 1);
        Applicant applicant = new Applicant("Tom", 5);

        Student student = principal.admitApplicant(applicant);

        assertNull(student);
    }

void main() {
}


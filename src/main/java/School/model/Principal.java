package School.model;

public class Principal extends Staff {

    public Principal(String name, int age, int staffId) {
        super(name, age);
    }
    public Student admitApplicant(Applicant applicant) {

        if (applicant.getAge() >= 10) {
            return new Student(applicant.getName(), applicant.getAge());
        }
        return null;
    }

    public void expelStudent(Student student) {
        System.out.println(student.getName() + " has been expelled.");
    }

    @Override
    public void performDuties() {
        System.out.println("Principal managing school affairs");
    }

    @Override
    public void performRole() {
        System.out.println("Principal managing school affairs");
    }
}

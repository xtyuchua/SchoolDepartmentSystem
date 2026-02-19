package School.model;

public abstract class Staff extends Person {

    String staffId;

    public Staff(String name, int age) {
        super(name, age);
        this.staffId = staffId;
    }

   public String getStaffId() {
        return staffId;
   }

   public abstract void performDuties();
}

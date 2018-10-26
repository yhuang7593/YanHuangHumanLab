package YanHuang;

public class Student extends Person {
    private int GPA;
    private String familyName, firstName;

    Student(int GPA, String familyName, String firstName) {
        super("Student", "Student");
        this.GPA = GPA;
        this.familyName = familyName;
        this.firstName = firstName;
    }

    public int getGPA() {
        return GPA;
    }
    public toString() {
        return familyName + firstName;
    }
}

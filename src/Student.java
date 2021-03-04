import java.util.Date;

public class Student extends Person {

    private SchoolClass[] schoolClasses;
    private int StudentNumber;

    public Student(String name, String firstName, Date dateOfBirth, String email, int StudentNumber) {
        super(name, firstName, dateOfBirth, email);
        this.StudentNumber = StudentNumber;
    }

}

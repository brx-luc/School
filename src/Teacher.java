import java.util.Date;

public class Teacher extends Person{

    private int roomnumber;

    public Teacher(String name, String firstName, Date dateOfBirth, String email, int roomnumber) {
        super(name, firstName, dateOfBirth, email);
        this.roomnumber = roomnumber;
    }

}

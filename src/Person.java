import java.util.Date;

public class Person {

    private String name;
    private String firstName;
    private Date dateOfBirth;
    private String email;

    public Person(String name, String firstName, Date dateOfBirth, String email){
        this.name = name;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }
}

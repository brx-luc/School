import java.time.LocalDate;

public class Person {

    private String name;
    private String firstName;
    private LocalDate dateOfBirth;
    private String email;

    public Person(String name, String firstName, LocalDate dateOfBirth, String email){
        this.name = name;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public String getFirstName() {
        return firstName;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public String getEmail() {
        return email;
    }
}

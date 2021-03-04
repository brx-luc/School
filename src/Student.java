import java.time.LocalDate;

public class Student extends Person {

    private SchoolClass[] schoolClasses;
    private int StudentNumber;

    public Student(String name, String firstName, LocalDate dateOfBirth, String email, int StudentNumber) {
        super(name, firstName, dateOfBirth, email);
        this.StudentNumber = StudentNumber;
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    public String toString(){
        return "Studenten:\n\tName: "+getName()+" "+getFirstName()+"\n"+"\tGeburtsdatum: "+getDateOfBirth()+"\n"+"\tE-Mail: "+getEmail()+"\n"+"\tStudentennummer: "+getStudentNumber()+"\n";
    }


}

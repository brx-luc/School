import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends Person {

    SchoolClass sc = new SchoolClass();
    private ArrayList<ArrayList<Student>> schoolClasses = new ArrayList<ArrayList<Student>>();
    private int StudentNumber;

    public Student(String name, String firstName, LocalDate dateOfBirth, String email, int StudentNumber) {
        super(name, firstName, dateOfBirth, email);
        this.StudentNumber = StudentNumber;
    }

    public void addToClassroom(){
        schoolClasses.add(sc.getStudentList());
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    public String toString(){
        return "Studenten:\n\tName: "+getName()+" "+getFirstName()+"\n"+"\tGeburtsdatum: "+getDateOfBirth()+"\n"+"\tE-Mail: "+getEmail()+"\n"+"\tStudentennummer: "+getStudentNumber()+"\n";
    }


}

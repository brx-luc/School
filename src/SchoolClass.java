import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class SchoolClass {

    Scanner scan = new Scanner(System.in);
    private ArrayList<Student> studentList;
    private Student classRepresentative;
    private Teacher MainTeacher;

    public void addStudent(){
        System.out.println("Nachname");
        String name = scan.next();
        System.out.println("Vorname");
        String vorname = scan.next();
        System.out.println("Geburtsdatum");
        LocalDate.parse();

    }


    public Student getClassRepresentative() {
        return classRepresentative;
    }

    public Teacher getMainTeacher() {
        return MainTeacher;
    }

}

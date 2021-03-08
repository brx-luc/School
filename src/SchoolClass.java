import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class SchoolClass{

    Scanner scan = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private ArrayList<Student> studentList = new ArrayList<>();
    private Student classRepresentative;

    private Student s;

    public void addStudent(){
        System.out.println("Nachname: ");
        String name = scan.next();
        System.out.println("Vorname: ");
        String vorname = scan.next();
        System.out.println("Geburtsdatum: (Beispiel: 26/11/1997)");
        String date = scan.next();
        LocalDate dateOfBirth = LocalDate.parse(date, formatter);
        System.out.println("E-Mail: ");
        String email = scan.next();
        System.out.println("Studentennummer: ");
        int studentnumber = scan.nextInt();

        s = new Student(name, vorname, dateOfBirth, email, studentnumber);
        studentList.add(s);
        s.addToClassroom();

    }

    public void ShowClassroom(){
        for(Student s : studentList){
            System.out.println(s);
        }
    }

    public Student getClassRepresentative() {
        return classRepresentative;
    }


    public ArrayList<Student> getStudentList() {
        return studentList;
    }
}

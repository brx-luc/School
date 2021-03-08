import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
        try {
            String date = scan.next();
            LocalDate dateOfBirth = LocalDate.parse(date, formatter);
            System.out.println("E-Mail: ");
            String email = scan.next();
            System.out.println("Studentennummer: ");

            try {
            int studentnumber = scan.nextInt();
            s = new Student(name, vorname, dateOfBirth, email, studentnumber);
            studentList.add(s);
            s.addToClassroom();}
            catch (InputMismatchException e){
                System.out.println("Bitte geben Sie eine Zahl ein\n");
            }

        }catch (DateTimeParseException e){
            System.out.println("Datum konnte nicht umgewandelt werden!\n");
        }
    }

    public void ShowClassroom(){
        for(Student s : studentList){
            System.out.println(s);
            }
        if(studentList.isEmpty()){
            System.out.println("Es wurden noch keine Schülerdaten gespeichert.\n");
        }
    }

    public Student getClassRepresentative() {
        return classRepresentative;
    }


    public ArrayList<Student> getStudentList() {
        return studentList;
    }
}

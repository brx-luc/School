import java.util.Scanner;

public class UserInterface extends SchoolClass{

    Scanner scan = new Scanner(System.in);
    String eingabe;

    public void Start(){
        System.out.println("\tSchulklassen");
        System.out.println("\t-------------");
        System.out.println("1. Klassen anzeigen");
        System.out.println("2. Schüler hinzufügen");
        System.out.println("3. Exit");
        decision();
    }

    public void decision(){
        eingabe = scan.next();
        while(!(eingabe.equals("3"))){
            if(eingabe.equals("2")){
                addStudent();
            } else if(eingabe.equals("1")){
                ShowClassroom();
            }
            Start();
        }

    }
}

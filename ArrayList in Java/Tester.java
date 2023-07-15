import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        input(students);
        System.out.println("Student Information: " + students.toString());
    }

    // forEach loop for ArrayList
    public static void input(ArrayList<Student> students) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter Student Name : ");
            String name = scan.nextLine();
            System.out.println("Enter Student Department");
            String department = scan.nextLine();
            System.out.println("Enter Student Id");
            int id = scan.nextInt();

            students.add(new Student(name, department, id));
            scan.nextLine();
        }

        // search student by their name
        System.out.println(System.in);
        System.out.println("Search Student Information");
        String findStudent = scan.nextLine();

        for (int i = 0; i < students.size(); i++) {
            if (findStudent.equals(students.get(i).getName())) {
                boolean found = true;
                if (found) {
                    System.out.println(findStudent + " Found Student");
                } else {
                    System.out.println(findStudent + " Not Found This Student");
                }
                break;
            }
        }
    }
}
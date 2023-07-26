import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ListIterator;

class Tester {
    public static void main(String[] aegs) {
        ArrayList<Employee> employee = new ArrayList<Employee>();
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int input;
        do {
            System.out.println("Type 1 for Insert");
            System.out.println("Type 2 for Display");
            System.out.println("Type 3 for Search");
            System.out.println("Type 4 for Delete");
            System.out.println("Type 5 for Update");
            System.out.println("Enter Your Choice");
            input = scan.nextInt();
            switch (input) {
                // insert oparation
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Enter Employee Id: ");
                        int eId = scan.nextInt();
                        System.out.println("Enter Employee Name: ");
                        String ename = scan1.nextLine();
                        System.out.println("Enter Employee Branch: ");
                        String eBranch = scan1.nextLine();
                        System.out.println("Enter Employee Designation: ");
                        String eDesignation = scan1.nextLine();
                        employee.add(new Employee(eId, ename, eBranch, eDesignation));
                        System.out.println("-----------------------------");
                        System.out.println("Record Insert Successfully");
                        System.out.println("-----------------------------");
                    }
                    break;
                // diplay
                case 2:
                    System.out.println("---------------------");
                    Iterator<Employee> i = employee.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("---------------------");
                    break;
                // search oparation
                case 3:
                    boolean found = false;
                    System.out.println("Enter Employee Id to Search: ");
                    int eid = scan.nextInt();
                    System.out.println("-----------------------------");
                    i = employee.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                        if (e.geteId() == eid) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record not found");
                    }
                    System.out.println("-----------------------------");
                    break;
                // delete oparation
                case 4:
                    found = false;
                    System.out.println("Enter Employee  to Delete: ");
                    int eId = scan.nextInt();
                    System.out.println("-----------------------------");
                    i = employee.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                        if (e.geteId() == eId) {
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found");
                    } else {
                        System.out.println("Record Deleted Successfully");
                    }
                    System.out.println("---------------------");
                    break;
                // update
                case 5:
                    found = false;
                    System.out.println("Enter Employee Id to Update : ");
                    eid = scan.nextInt();
                    ListIterator<Employee> li = employee.listIterator();
                    while (li.hasNext()) {
                        Employee e = li.next();
                        if (e.geteId() == eid) {
                            System.out.println("Enter Employee name :");
                            String eName = scan1.nextLine();
                            System.out.println("Enter Employee Branch :");
                            String eBranch = scan1.nextLine();
                            li.set(new Employee(eid, eName, eName, eBranch));
                            found = true;
                        }
                    }
                    System.out.println();
                    System.out.println("-----------------------------");
                    if (!found) {
                        System.out.println("Record not found");
                    } else {
                        System.out.println("Record is updated successfully");
                    }
                    System.out.println("-----------------------------");
            }
        } while (input != 0);
    }
}

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Management {


    public static void main(String[] args) throws IOException {

        int opr = 0, extopr = 99;
        String sname;
        Scanner scan = new Scanner(System.in);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("new.ser"));




        ArrayList<Employee> employeeList = new ArrayList<Employee>();



        while (opr!=extopr){
            System.out.println("Options: 1.Create Employee 2. Create Random Employee 3. Find Employee Details "+extopr+".exit");
            opr = scan.nextInt();

        switch (opr){
            case 1:
                System.out.println("Enter employee name: ");
                String name = scan.next();
                System.out.println("Enter ID: ");
                int id = scan.nextInt();
                System.out.println("Enter Salary: ");
                Double salary = scan.nextDouble();
                System.out.println("Enter team: "+ Employee.type.values());
                Employee.tname team = Employee.tname.valueOf(scan.next());
                System.out.println("Enter status: "+ Employee.type.values());
                Employee.type status = Employee.type.valueOf(scan.next());
                employeeList.add(EmployeeFactory.createEmployee(name, id, salary, team, status));
                break;

            case 2:
                System.out.println("creating random employee...");
                employeeList.add(EmployeeFactory.createRandEmployee(Employee.tname.alpha, Employee.type.employee));
                break;

            case 3:
                System.out.println("Enter employee id: ");
                sname = scan.next();
                Functions.findemp(sname, employeeList);
                break;

            default:
                break;

                }

        }
//        employeeList.add(EmployeeFactory.createEmployee("a", 1, 10000, Employee.tname.alpha, Employee.type.employee));
//        employeeList.add(EmployeeFactory.createRandEmployee(Employee.tname.alpha, Employee.type.employee));

        System.out.println(employeeList);
        System.out.println("Average: "+Functions.findAvg(employeeList));


//        Functions.findemp(sname, employeeList);

        Map<Employee.tname, List<Employee>> emap = Functions.getEmployeeMap(employeeList);

        System.out.println(emap);

        out.writeObject(emap);
        out.close();
        scan.close();




    }

}

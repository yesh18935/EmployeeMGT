
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Management {


    public static void main(String[] args) throws IOException {

        String sname = "a";


        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("new.ser"));


        ArrayList<Employee> employeeList = new ArrayList<Employee>();
//        employeeList.add(EmployeeFactory.createEmployee("a", 1, 10000, Employee.tname.alpha, Employee.type.employee));
        employeeList.add(EmployeeFactory.createEmployee(Employee.tname.alpha, Employee.type.employee));

        System.out.println(employeeList);
        System.out.println("Average: "+Functions.findAvg(employeeList));


//        Functions.findemp(sname, employeeList);

        Map<Employee.tname, List<Employee>> emap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getTeam));

        System.out.println(emap);

        out.writeObject(emap);
        out.close();




    }

}

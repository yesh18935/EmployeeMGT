import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Functions {


    static void findemp(String sname, ArrayList<Employee> employeeList) {
        Optional<Employee> semp = employeeList.stream().filter(p -> sname.equals(p.getName())).findFirst();
        if(semp.isPresent()){
            System.out.println("The details are "+semp.get());
        }
    }

    static Double findAvg(ArrayList<Employee> employeeList){
        Double average = employeeList
                .stream()
                .filter(p ->(Employee.type.employee).equals(p.getStatus()))
                .collect(Collectors.summingDouble(p -> p.getSalary()));
        return average;
    }

    static Map<Employee.tname, List<Employee>> getEmployeeMap(ArrayList<Employee> employeeList) {
        return employeeList.stream()
                    .collect(Collectors.groupingBy(Employee::getTeam));
    }
}

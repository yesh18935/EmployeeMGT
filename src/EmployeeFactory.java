import java.util.Random;

public class EmployeeFactory {

    static Random random = new Random();

    public static Employee createRandEmployee(Employee.tname team, Employee.type status){
        String name = RandomGen.generateRandString(random,10);
        int id = RandomGen.genrateRandInt(100, 1);
        double salary = (double)RandomGen.genrateRandInt(10, 100);

        return new Employee(name, id, salary, team, status);
    }

    public static Employee createEmployee(String name, int id, double salary, Employee.tname team, Employee.type status){

        return new Employee(name, id, salary, team, status);
    }

}
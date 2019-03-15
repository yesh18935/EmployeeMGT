import java.util.Random;

public class EmployeeFactory {

    static Random random = new Random();

    public static Employee createRandEmployee( ){
        String name = RandomGen.generateRandString(random,10);
        int id = RandomGen.generateRandInt(100, 1);
        double salary = (double)RandomGen.generateRandInt(100000, 10000);
        Employee.tname team = RandomGen.generateRandTeam(random);
        Employee.type status = RandomGen.generateRandType(random);

        return new Employee(name, id, salary, team, status);
    }

    public static Employee createEmployee(String name, int id, double salary, Employee.tname team, Employee.type status){
        return new Employee(name, id, salary, team, status);
    }

}
import java.io.Serializable;

public class Employee implements Serializable {

    enum type {employee, manager, recruiter};
    enum tname {alpha, beta, gamma};

    private String name;
    private int id;
    private double salary;
    private tname team;
    private type status;

    Employee(String name,int id,double salary,tname team, type status){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.team = team;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public tname getTeam() {
        return team;
    }

    public void setTeam(tname team) {
        this.team = team;
    }

    public type getStatus() {
        return status;
    }

    public void setStatus(type status) {
        this.status = status;
    }

    void details(){
        System.out.println("Name:"+name+" Id:"+id+" Salary:"+salary+" Team:"+team+" Status:"+status);
    }

    @Override
    public String toString() {
        return ("Name:"+this.getName()+" Id:"+this.getId()+" Salary:"+this.getSalary()+" Team:"+this.getTeam()+" Status: "+getStatus());
    }
}

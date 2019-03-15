import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void getName() throws Exception {
        Employee abc = new Employee();
        assertEquals(null, abc.getName());

    }

    @Test
    public void setName() {
    }

    @Test
    public void getId() throws Exception{
        Employee abc = new Employee();
        assertEquals(0, abc.getId());
    }

    @Test
    public void setId() {
    }

    @Test
    public void getSalary() throws Exception{
        Employee abc = new Employee();
        assertEquals(0.0, abc.getSalary(), 1);
        assertTrue(abc.getSalary()>=0.0);
    }

    @Test
    public void setSalary() throws Exception{

    }

    @Test
    public void getTeam() throws Exception{
        Employee abc = new Employee();
        assertEquals(Employee.tname.alpha, abc.getTeam());
    }

    @Test
    public void setTeam() {
    }

    @Test
    public void getStatus() throws Exception{
        Employee abc = new Employee();
        assertEquals(Employee.type.employee, abc.getStatus());
    }

    @Test
    public void setStatus() {
    }


}
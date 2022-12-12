import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
public class Employee {
    private final String employeeLastName;
    private final String employeeFirstName;
    private final String employeePatronymicName;
    private final int id;
    private static int counter = 1;
    private int salary;
    private int department;

    public Employee(String employeeLastName, String employeeFirstName, String employeePatronymicName, int id, int salary, int department) {
        this.employeeLastName = employeeLastName;
        this.employeeFirstName = employeeFirstName;
        this.employeePatronymicName = employeePatronymicName;
        this.id = counter++;
        this.salary = salary;
        this.department = department;
    }

    public String getEmployeeLastName(Employee[]employeesArray) {
        return employeeLastName;
    }

    public String getEmployeeFirstName(Employee[]employeesArray) {
        return employeeFirstName;
    }

    public String getEmployeePatronymicName(Employee[]employeesArray) {
        return employeePatronymicName;
    }
    public int getSalary(Employee[]employeesArray) {
        return salary;
    }

    public int getDepartment(Employee[]employeesArray) {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getId (Employee[]employeesArray) {
        return id;
    }

    @Override
    public int hashCode() {
          return Objects.hash(id);
    }
    public String toString() {
        return employeeLastName + employeeFirstName + employeePatronymicName + " " + department + " " + salary + " " + id;
    }
}


import java.util.concurrent.atomic.AtomicInteger;
public class Employee {
    private final String employeeLastName;
    private final String employeeFirstName;
    private final String employeePatronymicName;
    private int id;
    private int salary;
    private int department;

    public Employee(String employeeLastName, String employeeFirstName, String employeePatronymicName, int id, int salary, int department) {
        this.employeeLastName = employeeLastName;
        this.employeeFirstName = employeeFirstName;
        this.employeePatronymicName = employeePatronymicName;
        this.salary = salary;
        this.id = id;
        this.department = department;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeePatronymicName() {
        return employeePatronymicName;
    }
    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    private static final AtomicInteger COUNTER = new AtomicInteger(1);
      public void IdCounter () {
          id = COUNTER.getAndIncrement();
    }
    public int getId () {
          return id;
    }
}


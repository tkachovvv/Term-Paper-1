public class Employee {
    private final String employeeLastName;
    private final String employeeFirstName;
    private final String employeePatronymicName;
    private String id;
    public static int idCounter = 0;
    private int salary;
    private int department;

    Employee(String employeeLastName, String employeeFirstName, String employeePatronymicName, String id, int idCounter, int salary, int department) {
        this.employeeLastName = employeeLastName;
        this.employeeFirstName = employeeFirstName;
        this.employeePatronymicName = employeePatronymicName;
        this.id = id;
        Employee.idCounter = idCounter;
        this.salary = salary;
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
    public String getId() {
        return id;
    }
    public int getIdCounter() {
        return idCounter;
    }
    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }
}

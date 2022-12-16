public class Methods {
    public static void fullList(Employee[] employeesArray) {
        for (Employee employee : employeesArray) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public static int calculateSum(Employee[] employeesArray) {
        int sum = 0;
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i] != null) {
                sum += employeesArray[i].getSalary();
            }
        }
        System.out.println("Сумма выплат составит: " + sum);
        return sum;
    }

    public static int findMinSalary(Employee[] employeesArray) {
        int minSalary = employeesArray[0].getSalary();
        String employeeName;
        employeeName = employeesArray[0].getFullName();
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i] != null && employeesArray[i].getSalary() < minSalary) {
                minSalary = employeesArray[i].getSalary();
                employeeName = employeeName = employeesArray[i].getEmployeeLastName() + employeesArray[i].getEmployeeFirstName() + employeesArray[i].getEmployeePatronymicName();
            }
            System.out.println("Самая низкая зарплата в компании у " + employeeName + " и она составляет: " + minSalary);
        }
        return minSalary;
    }

    public static int findMaxSalary(Employee[] employeesArray) {
        int maxSalary = employeesArray[0].getSalary();
        String employeeName;
        employeeName = employeesArray[0].getFullName();
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i] != null && employeesArray[i].getSalary() > maxSalary) {
                maxSalary = employeesArray[i].getSalary();
                employeeName = employeesArray[i].getEmployeeLastName() + employeesArray[i].getEmployeeFirstName() + employeesArray[i].getEmployeePatronymicName();
            }
            System.out.println("Самая высокая зарплата в компании у " + employeeName + " и она составляет: " + maxSalary);
        }
        return maxSalary;
    }

    public static int findMaxID(Employee[] employeesArray) {
        int maxID = employeesArray[0].getId();
        for (int i = 0; i < employeesArray.length; i++)
            if (employeesArray[i] != null && maxID < employeesArray[i].getSalary()) {
                maxID = employeesArray[i].getId();
            }
        System.out.println(maxID);
        return maxID;
    }

    public static int averageNumber(Employee[] employeesArray) {
        int average = calculateSum(employeesArray) / findMaxID(employeesArray);
        System.out.println("Средняя зарплата составляет: " + average);
        return average;
    }
    public static String getOnlyName (Employee[] employeesArray) {
        String onlyName = employeesArray[0].getEmployeeLastName() + employeesArray[0].getEmployeeFirstName() + employeesArray[0].getEmployeePatronymicName();
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i] != null) {
                onlyName = employeesArray[i].getEmployeeLastName() + employeesArray[i].getEmployeeFirstName() + employeesArray[i].getEmployeePatronymicName();
                System.out.println("ФИО работника - " + onlyName);
            }
        }
        return onlyName;
    }
}
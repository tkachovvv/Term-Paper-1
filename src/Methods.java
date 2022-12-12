public class Methods {
    public static void fullList(Employee[] employeesArray) {
        for (Employee employee : employeesArray) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static int calculateSum(Employee[] employeesArray) {
        int sum = 0;
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i] != null) {
                sum += employeesArray[i].getSalary(employeesArray);
            }
        }
        System.out.println("Сумма выплат составит: " + sum);
        return sum;
    }

    public static int findMinSalary(Employee[] employeesArray) {
        int minSalary = employeesArray[0].getSalary(employeesArray);
        String employeeName;
        employeeName = employeesArray[0].getEmployeeLastName(employeesArray) + employeesArray[0].getEmployeeFirstName(employeesArray) + employeesArray[0].getEmployeePatronymicName(employeesArray);
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i] != null && minSalary > employeesArray[i].getSalary(employeesArray)) {
                minSalary = employeesArray[i].getSalary(employeesArray);
                employeeName = employeesArray[i].getEmployeeLastName(employeesArray) + employeesArray[i].getEmployeeFirstName(employeesArray) + "  " + employeesArray[i].getEmployeePatronymicName(employeesArray);
            }
            System.out.println("Самая низкая зарплата в компании у " + employeeName + " и она составляет: " + minSalary);
        }
        return minSalary;
    }

    public static int findMaxSalary(Employee[] employeesArray) {
        int maxSalary = employeesArray[0].getSalary(employeesArray);
        String employeeName;
        employeeName = employeesArray[0].getEmployeeLastName(employeesArray) + employeesArray[0].getEmployeeFirstName(employeesArray) + employeesArray[0].getEmployeePatronymicName(employeesArray);
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i] != null && employeesArray[i].getSalary(employeesArray) > maxSalary) {
                maxSalary = employeesArray[i].getSalary(employeesArray);
                employeeName = employeesArray[i].getEmployeeLastName(employeesArray) + employeesArray[i].getEmployeeFirstName(employeesArray) + "  " + employeesArray[i].getEmployeePatronymicName(employeesArray);
            }
            System.out.println("Самая высокая зарплата в компании у " + employeeName + " и она составляет: " + maxSalary);
        }
        return maxSalary;
    }

    public static int findMaxID(Employee[] employeesArray) {
        int maxID = employeesArray[0].getId(employeesArray);
        for (int i = 0; i < employeesArray.length; i++)
            if (employeesArray[i] != null && maxID < employeesArray[i].getSalary(employeesArray)) {
                maxID = employeesArray[i].getId(employeesArray);
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
        String onlyName = employeesArray[0].getEmployeeLastName(employeesArray) + employeesArray[0].getEmployeeFirstName(employeesArray) + employeesArray[0].getEmployeePatronymicName(employeesArray);
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i] != null) {
                onlyName = employeesArray[i].getEmployeeLastName(employeesArray) + employeesArray[i].getEmployeeFirstName(employeesArray) + employeesArray[i].getEmployeePatronymicName(employeesArray);
                System.out.println("ФИО работника - " + onlyName);
            }
        }
        return onlyName;
    }
}
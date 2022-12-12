import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static Employee[] employeesArray = new Employee [10];
    public static void main(String[] args) {
        employeesArray [0]  = new Employee("Ivanov ", "Ivan ", "Ivanovich ", 1, 12000, 1);
        employeesArray[1]  = new Employee("Porada ", "Leonid ", "Sergeivich ", 2, 40000, 2);
        employeesArray[2]  = new Employee("Tkachov ", "Dmytro ", "Igorevich ", 3, 80000, 3);
        employeesArray[3]  = new Employee("Gorshkova ", "Anastasiia ", "Viktorovna ", 4, 180000, 4);
        employeesArray[4] = new Employee ("Karenina ", "Anna ", "Petrovna ", 5, 57000, 5);
        employeesArray [5] = new Employee("Ratnikova ", "Yekaterina ", "Igorevna ", 6, 34000, 4);
        employeesArray [6] = new Employee("Kalashnikov ", "Sergey ", "Viktorovich ", 7, 11000, 2);
        employeesArray [7] = new Employee("Leteinikova ", "Anna ", "Grigorievna ", 8, 60200, 5);
        employeesArray[8] = new Employee("Bondarenko ", "Sophia ", "Andreyevna ", 9, 78400, 3);
        employeesArray[9] = new Employee("Poroshenko ", "Anatoliy ", "Viktorovich ", 10, 200000, 1);
        Methods.fullList(employeesArray);
        Methods.calculateSum(employeesArray);
        Methods.findMinSalary(employeesArray);
        Methods.findMaxSalary(employeesArray);
        Methods.findMaxID(employeesArray);
        Methods.averageNumber(employeesArray);
        Methods.getOnlyName(employeesArray);
    }
}
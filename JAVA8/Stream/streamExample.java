package JAVA8.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class streamExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 25, 3000),
                new Employee("Dohn", 30, 4000),
                new Employee("Gohn", 35, 2000));
        List<Employee> highEarner = employees.stream()
                .filter(emp -> emp.salary > 3500)
                .sorted(Comparator.comparingInt(emp -> emp.age))
                .collect(Collectors.toList());
        highEarner.forEach(System.out::println);

    }

}

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
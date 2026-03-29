package New;

import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    private String name;

    private int id;
    private double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
    Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    double calculateBonus() {
        return getSalary() * 0.1; // 10% bonus
    }
}

class Developer extends Employee {
    Developer(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    double calculateBonus() {
        return getSalary() * 0.1; // 10% bonus
    }
}

class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Manager("Alice", 1, 5000));
        employees.add(new Developer("Bob", 2, 4000));
        employees.add(new Developer("Charlie", 3, 4500));
        employees.add(new Manager("David", 4, 600));

        employees.stream()
        .filter(e -> e.getSalary() > 1000)
        .map(e -> e.getName())
        .forEach(e -> System.out.println(e));

    }
}

// Encapsulation (Employee salary details)
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

// Inheritance (FullTimeEmployee, PartTimeEmployee)
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    // Polymorphism (Different pay calculations)
    public double calculatePay() {
        return getSalary() * 0.9; // 10% tax deduction
    }
}
class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    // Polymorphism (Different pay calculations)
    public double calculatePay() {
        return getSalary() * 0.8; // 20% tax deduction
    }
}

public class Payroll {
    public static void main(String[] args) {
        FullTimeEmployee john = new FullTimeEmployee("Laharitha", 5000);
        FullTimeEmployee jane = new FullTimeEmployee("Ravi", 5500);
        PartTimeEmployee bob = new PartTimeEmployee("Tanuj", 3000);
        PartTimeEmployee alice = new PartTimeEmployee("Vishal", 3500);

        // Printing employee details and pay
        System.out.println(john.getName() + "'s pay: " + john.calculatePay());
        System.out.println(jane.getName() + "'s pay: " + jane.calculatePay());
        System.out.println(bob.getName() + "'s pay: " + bob.calculatePay());
        System.out.println(alice.getName() + "'s pay: " + alice.calculatePay());

    }
    
}
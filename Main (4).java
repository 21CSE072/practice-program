class Employee {
    private String name;
    private int employeeID;
    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }
    public double calculateSalary() {
        return 50000; 
    }
    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }
}

class Manager extends Employee {
    private double bonusPercentage;
    public Manager(String name, int employeeID, double bonusPercentage) {
        super(name, employeeID);
        this.bonusPercentage = bonusPercentage;
    }
    @Override
    public double calculateSalary() {
        double basicSalary = super.calculateSalary();
        return basicSalary + (basicSalary * bonusPercentage / 100);
    }
    public double getBonusPercentage() {
        return bonusPercentage;
    }
}

class Developer extends Employee {
    private String programmingLanguage;
    public Developer(String name, int employeeID, String programmingLanguage) {
        super(name, employeeID);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public double calculateSalary() {
        double basicSalary = super.calculateSalary();
        return basicSalary + 1000; 
    }
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("iniya Manager", 101, 15.0);
        Developer developer = new Developer("ezhil Developer", 201, "Java");
        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.getName());
        System.out.println("Employee ID: " + manager.getEmployeeID());
        System.out.println("Bonus Percentage: " + manager.getBonusPercentage() + "%");
        System.out.println("Calculated Salary: $" + manager.calculateSalary());

        System.out.println("\nDeveloper Details:");
        System.out.println("Name: " + developer.getName());
        System.out.println("Employee ID: " + developer.getEmployeeID());
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        System.out.println("Calculated Salary: $" + developer.calculateSalary());
    }
}

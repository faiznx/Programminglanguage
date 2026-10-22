class Person {
    private String name;
    protected String cnic;
    public Person(String name, String cnic) {
        System.out.println("Person constructor called");
        this.name = name;
        this.cnic = cnic;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final void displayCNIC() {
        System.out.println("CNIC: " + cnic);
    }
}

class Employee extends Person {
    protected double baseSalary;

    public Employee(String name, String cnic, double salary) {
        super(name, cnic); // Must be the first statement
        System.out.println("Employee constructor called");
        this.baseSalary = salary;
    }

    public void work() {
        System.out.println("Employee is working");
    }
}

class Professor extends Employee {
    private String department;

    public Professor(String name, String cnic, double salary, String department) {
        super(name, cnic, salary);
        System.out.println("Professor constructor called");
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println("Professor is teaching students");
    }

    public void takeLecture() {
        System.out.println("Professor is taking a lecture");
    }
}
public class UniversityManagementPayrollSystem {
    public static void main(String[] args) {

        Professor p = new Professor("Ali Ahmed", "35202-1234567-1", 100000.0, "Computer Science");


        System.out.println("Name: " + p.getName());
        p.setName("Ali Khan");
        System.out.println("Updated Name: " + p.getName());

        p.displayCNIC();
        p.work();
        p.takeLecture();
    }
}
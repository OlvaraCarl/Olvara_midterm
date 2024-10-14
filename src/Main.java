// Base class for Person
class Person {
    // Fields for Person class
    protected String name;
    protected int age;

    // Constructor for Person class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print or display
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Student inherits from the Person
class Student extends Person {
    // Fields for Student class
    private String studentID;
    private String course;
    private int units;
    private final int feePerUnit = 1000; // Constant fee per unit

    // Constructor for class Student
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age); // Calls the constructor of the parent class (Person)
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    // Calculate total fee per unit
    public double calculateFees() {
        return units * feePerUnit;
    }

    // Overriding the displayInfo method from Person
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calls the displayInfo method from the Person class
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee: " + calculateFees());
    }
}

// Subclass Instructor inherits from Person
class Instructor extends Person {
    // Fields for Instructor class
    private String employeeID;
    private String department;
    private double salary;

    // Constructor for Instructor class
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age); // Calls the constructor of the parent class (Person)
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Overriding the displayInfo method from the Person class
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calls the displayInfo method from the Person class
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Demonstrating Polymorphism to class University
class University {
    // Polymorphic method to print details of Student and Instructor
    public void printDetails(Person p) {
        p.displayInfo(); // Calls the method based on the object's type (Student or Instructor)
        System.out.println(); // New line 
    }
}

// Test program
public class Main {
    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student("Carl Angelo I. Olvara", 19, "231000333", "BSCpE", 21);
        Student student2 = new Student("Haynzell Anne P. Zerna", 19, "20230602-C", "BSBA-HRM", 29);

        // Create two Instructor objects
        Instructor instructor1 = new Instructor("Engr. Tanya Carmella Jovillano", 24, "1234-0673", "CEA", 15000.00);
        Instructor instructor2 = new Instructor("Ms. Marcelina N. Cruz", 25, "5678-0914", "CFM", 17000.00);

        // Create a University object to use the printDetails method
        University university = new University();

        // displays the details of both students and instructors
        university.printDetails(student1);
        university.printDetails(student2);
        university.printDetails(instructor1);
        university.printDetails(instructor2);
    }
}
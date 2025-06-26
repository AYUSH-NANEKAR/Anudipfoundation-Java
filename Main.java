// Define Student class
class Student {
    String name;
    int age;
    String department;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 20;
        this.department = "Unassigned";
    }

    // Constructor with name and age
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

    // Constructor with name, age, and department
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
        System.out.println("Department: " + department);
        System.out.println("---------------------------");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();                                 // Default constructor
        Student s2 = new Student("Ayush", 22);                      // Two-parameter constructor
        Student s3 = new Student("Sneha", 21, "Electronics");       // Three-parameter constructor

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}

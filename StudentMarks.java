import java.util.*;

// 1. You must define the Student class so Java knows what a "Student" object is
class Student {
    String name;
    int marks;

    // Constructor that accepts a name and marks
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Overriding toString() so it prints beautifully instead of showing a memory address
    @Override
    public String toString() {
        return name + ": " + marks;
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        
        
        ArrayList<Student> students = new ArrayList<>();

        
        students.add(new Student("varsha", 85));
        students.add(new Student("Anjali", 92));
        students.add(new Student("Sameera", 78));
        students.add(new Student("Sania", 64));
        students.add(new Student("Rahul", 99));

        System.out.println("Student Records:");
        
        
        for (Student record : students) {
            System.out.println(record);
        }
    }
}
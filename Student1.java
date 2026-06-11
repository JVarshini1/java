import java.util.*;

public class Student1 {
    public static void main(String[] args) {
        
        ArrayList<Student> students = new ArrayList<>();

        // 1. Adding Students
        students.add(new Student("Varsha", 85));
        students.add(new Student("Anjali", 92));
        students.add(new Student("Sameera", 78));
        students.add(new Student("Sania", 64));
        students.add(new Student("Rahul", 99));

        
        System.out.println("--- Student Marks ---");
        int totalMarks = 0;
        for (Student s : students) {
            System.out.println(s.name + ": " + s.marks);
            totalMarks += s.marks;
        }

        double average = (double) totalMarks / students.size();
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("The Average of the class: " + average);
        System.out.println("---------------------\n");

        
        Student highest = students.get(0);
        Student lowest = students.get(0);

        for (Student s : students) {
            if (s.marks > highest.marks) {
                highest = s;
            }
            if (s.marks < lowest.marks) {
                lowest = s;
            }
        }
        System.out.println("Highest Scorer: " + highest.name + " (" + highest.marks + ")");
        System.out.println("Lowest Scorer: " + lowest.name + " (" + lowest.marks + ")\n");

        
        System.out.println("--- Students with Distinction (>= 85) ---");
        for (Student s : students) {
            if (s.marks >= 85) {
                System.out.println(s.name + " has secured distinction.");
            }
        }
        System.out.println("-----------------------------------------\n");

        
        String searchName = "Anjali";
        System.out.println("--- Searching for " + searchName + " ---");
        boolean found = false;
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(searchName)) {
                System.out.println("Found! " + s.name + "'s marks: " + s.marks);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student " + searchName + " not found.");
        }
        System.out.println("-------------------------------------\n");

       
        students.sort((s1, s2) -> Integer.compare(s2.marks, s1.marks));

        System.out.println("--- Leaderboard (Sorted by Marks High to Low) ---");
        for (Student s : students) {
            System.out.println(s.name + ": " + s.marks);
        }
        System.out.println("------------------------------------------------");
    }
}

class Student {
    String name;
    int marks;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
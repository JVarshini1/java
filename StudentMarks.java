import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        
        
        ArrayList<Student> Students = new ArrayList<>();

        Students.add(new Student("varsha",85));
        Students.add(new Student("Anjali: 92"));
        Students.add(new Student("Sameera: 78"));
        Students.add(new Student("Sania: 64"));
        Students.add(new Student("Rahul:99"));


        
        
        
        System.out.println("  ");
        for (String record : studentRecords) {
            System.out.println(record);
        }
    }
}
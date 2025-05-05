import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Create a Map with student names as keys and Student objects as values
        Map<String, Student> studentMap = new HashMap<>();

        // Create 4 Student objects and add them to the Map
        Student student1 = new Student("John", 10);
        Student student2 = new Student("Jane", 9);
        Student student3 = new Student("Jill", 8);
        Student student4 = new Student("Jack", 7);

        studentMap.put(student1.getName(), student1);
        studentMap.put(student2.getName(), student2);
        studentMap.put(student3.getName(), student3);
        studentMap.put(student4.getName(), student4);

        // Print original grades
        System.out.println( "Original grades: " + studentMap);

        // Print updated grades after 10% increase
        Map<String, Student> updatedGrades = Student.increaseGrades(studentMap);
        System.out.println("\nUpdates grades: " + updatedGrades);
    }
}
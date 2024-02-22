import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a Map with a key of the student's name (String) and a value of a Student object.
        Map<String, Student> studentMap = new HashMap<>();

        // Create 4 Student objects for your classmates and add them to the Map.
        Student student1 = new Student("John Doe", 90);
        Student student2 = new Student("Jane Doe", 85);
        Student student3 = new Student("Johnny Doette", 75);
        Student student4 = new Student("Jeanette Doette", 65);

        studentMap.put(student1.getName(), student1);
        studentMap.put(student2.getName(), student2);
        studentMap.put(student3.getName(), student3);
        studentMap.put(student4.getName(), student4);

        studentMap = increaseGrades(studentMap);

        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getGrade());
        }
    }

    // Create a method called increaseGrades that takes a Map<String, Student> as a parameter, increases every student's grade by 10% and returns the updated map.
    public static Map<String, Student> increaseGrades(Map<String, Student> studentMap) {
        for (Student student : studentMap.values()) {
            if (student.getGrade() < 100) {
                student.setGrade((int) (student.getGrade() * 1.1));
            }
        }
        return studentMap;
    }
}

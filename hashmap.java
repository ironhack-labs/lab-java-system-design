import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a Map with student names as keys and Student objects as values
        Map<String, Student> studentMap = new HashMap<>();
        // Add students to the map
        studentMap.put("Alice", new Student("Alice", 85));
        studentMap.put("Bob", new Student("Bob", 70));
        studentMap.put("Charlie", new Student("Charlie", 95));
        studentMap.put("David", new Student("David", 80));
    }
}

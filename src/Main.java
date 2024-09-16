import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> studentsMap = new HashMap<>();


        Student alice = new Student("Alice", 85);
        Student bob = new Student("Bob", 90);
        Student charlie = new Student("Charlie", 78);
        Student diana = new Student("Diana", 92);


        studentsMap.put(alice.getName(), alice);
        studentsMap.put(bob.getName(), bob);
        studentsMap.put(charlie.getName(), charlie);
        studentsMap.put(diana.getName(), diana);

        studentsMap = GradeProcessor.increaseGrades(studentsMap);

        for (Student student : studentsMap.values()) {
            System.out.println(student.getName() + ": " + student.getGrade());
        }
    }
}

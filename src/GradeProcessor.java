import java.util.Map;

public class GradeProcessor {
    public static Map<String, Student> increaseGrades(Map<String, Student> studentsMap) {
        for (Student student : studentsMap.values()) {
            int newGrade = (int) (student.getGrade() * 1.1);

            newGrade = Math.min(newGrade, 100);
            student.setGrade(newGrade);
        }
        return studentsMap;
    }
}

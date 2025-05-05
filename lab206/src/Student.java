import java.util.Map;

public class Student {
    private String name;
    private float grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public static Map<String, Student> increaseGrades(Map<String, Student> studentMap) {
        for (Student student : studentMap.values()) {
            float currentGrade = student.getGrade();
            float newGrade = currentGrade + (currentGrade * 0.1f);
            student.setGrade(newGrade);
        }
        return studentMap;
    }
}

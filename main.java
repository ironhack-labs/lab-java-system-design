import java.util.HashMap;
import java.util.Map;
import java.util.SplittableRandom;

public class main {
    public static void main(String[] args) {
        // Create 4 student
        Student Juan = new Student("Juan", 80);
        Student Irene = new Student("Irene", 50);
        Student Rene = new Student("Rene", 70);
        Student Jorge = new Student("Jorge", 60);

        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("Juan", Juan);
        studentMap.put("Irene", Irene);
        studentMap.put("Rene", Rene);
        studentMap.put("Jorge", Jorge);

        increaseGrades(studentMap);

        System.out.println(studentMap.get("Juan").getGrade());
    }


    public static void increaseGrades(Map<String, Student> studentList){
        for(String student: studentList.keySet()){
            Student studentGet = studentList.get(student);
            if (studentGet.getGrade() <= 100){
                studentGet.setGrade((int) (studentGet.getGrade() * 1.1));
            }
        }
    }
}

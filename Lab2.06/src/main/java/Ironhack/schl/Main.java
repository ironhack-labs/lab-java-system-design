package Ironhack.schl;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Student> studentMap = new HashMap<>();
        Student student1 = new Student("Iseult", 30);
        Student student2 = new Student("Yolanth", 90);
        Student student3 = new Student("Chindasvinto", 85);
        Student student4 = new Student("Jirohito", 70);

        studentMap.put(student1.getName(), student1);
        studentMap.put(student2.getName(), student2);
        studentMap.put(student3.getName(), student3);
        studentMap.put(student4.getName(), student4);

        increaseGrades(studentMap);

        for (HashMap.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Grade: " + entry.getValue().getGrade());
        }
    }

    public static void increaseGrades(HashMap<String, Student> studentMap) {
        for (HashMap.Entry<String, Student> entry : studentMap.entrySet()) {
            entry.getValue().increaseGrade();
        }
    }
}

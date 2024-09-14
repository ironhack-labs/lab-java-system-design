package com.ironhack;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Student> studentMap = new HashMap<>();


        studentMap.put("Marko", new Student("Marko", 45));
        studentMap.put("Maria", new Student("Maria", 65));
        studentMap.put("Mario", new Student("Mario", 55));
        studentMap.put("Matko", new Student("Matko", 75));


        ;

        for (String name : studentMap.keySet()) {
            Student student = studentMap.get(name);
            System.out.println(student.getName() + "," + student.getGrade());

        }

        for (Student student : studentMap.values()) {
            student.gradeIncrease();
        }

        System.out.println("Increased grades: ");
        for (String name : studentMap.keySet()) {
            Student student =studentMap.get(name);
            System.out.println(student.getName() + "," + student.getGrade());
        }



    }
}
package Ironhack.schl;


public class Student {
    private String name;
    private int grade = 0;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return this.grade;
    }

    public int setGrade(int grade) throws IllegalArgumentException {
        if (grade >= 0 && grade <= 100) {
            return grade;
        } else {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
    }

    public void increaseGrade() throws IllegalArgumentException {
        int newGrade;
        if (grade >= 0 && grade <= 100) {
            grade = grade*11/10;
            newGrade = grade;
        } else {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
    }
}

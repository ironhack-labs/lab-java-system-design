package com.ironhack;


public class  Student {

    private String name;
    private int grade;

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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    void gradeIncrease() {

        this.grade = (int)(this.grade * 1.10);

        if(this.grade > 100) {
            this.grade = 100;
        }

    }

}


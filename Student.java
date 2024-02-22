public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        setName(name);
        setGrade(grade);
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        if (grade > 100){
            this.grade = 100;
        } else if (grade < 0) {
            this.grade = 0;
        } else {
            this.grade = grade;
        }
    }
}

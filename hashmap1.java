public class Main {
    public static void main(String[] args) {
        // Create and populate the student map
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("Alice", new Student("Alice", 85));
        studentMap.put("Bob", new Student("Bob", 70));
        studentMap.put("Charlie", new Student("Charlie", 95));
        studentMap.put("David", new Student("David", 80));

        // Increase grades by 10%
        Map<String, Student> updatedMap = increaseGrades(studentMap);
    }

    public static Map<String, Student> increaseGrades(Map<String, Student> studentMap) {
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            Student student = entry.getValue();
            int increasedGrade = (int) (student.getGrade() * 1.1); // Increase by 10%
            student.setGrade(increasedGrade);
        }
        return studentMap;
    }
}

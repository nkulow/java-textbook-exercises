public class Course {

    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;

    }
    public void getStudents(){
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i] + ", ");
        }
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (student.equalsIgnoreCase(students[i])) {
                students[i] = null;
                numberOfStudents--;

                while (i < numberOfStudents) {
                    students[i] = students[i + 1];
                    i++;
                }

            }
        }
    }
}
public class testCourse {
    public static void main(String[] args){
        System.out.println("\n\n");

        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("John Doe");
        course1.addStudent("Kim Smith");
        course1.addStudent("Peter Jones");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course 1: " + course1.getNumberOfStudents());
        course1.getStudents();
        System.out.println("\n\n");
    }
}

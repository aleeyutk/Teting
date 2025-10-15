package schoolmanagement;

public class Main {
    public static void main(String[] args) {
        System.out.println("**** SCHOOL MANAGEMENT SYSTEM ****\n");

        // Test Student
        Student student1 = new Student("Lamine Yamal", 1001, 10);
        student1.setGpa(3.8);
        System.out.println("Student: " + student1.getName() + ", GPA: " + student1.getGpa());

        // Test Teacher
        Teacher teacher1 = new Teacher("Dr. Kwami", 2001, "Mathematics");
        teacher1.setYearsExperience(5);
        teacher1.teachCourse("Algebra");
        teacher1.prepareMaterials();


        // Test Course
        CourseOffering course1 = new CourseOffering();
        course1.setCourseCode("MTH111");
        course1.setCourseName("Algebra");
        course1.enrollStudent("Lamine Yamal");


        // Test Grade
        Grade grade = new Grade();
        grade.setAssessmentName("Final Exam");
        grade.setMaxScore(100);
        grade.assignGrade("Lamine Yamal", 85);
        System.out.println("Grade: " + grade.calculateGrade() + "%");

        // Test Attendance
        Attendance attendance = new Attendance();
        attendance.markAttendance("Lamine Yamal", true);
        attendance.markAttendance("Lamine Yamal", false);
        System.out.println("Attendance: " + attendance.calculateAttendanceRate("Lamine Yamal") + "%");

    }
}

package schoolmanagement;

public class CourseOffering extends Course implements Enrollable, Reportable {
    // Fields
    private String semester;
    private int enrolledStudents;
    
    // Getters and Setters
    public String getSemester() {
        return semester;
    }
    
    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    public int getEnrolledStudents() {
        return enrolledStudents;
    }
    
    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
    
    // Abstract method implementations
    @Override
    public int getCredits() {
        return 3; // Default credits
    }
    
    @Override
    public String getDepartment() {
        return "Computer Science";
    }
    
    // Enrollable interface methods
    @Override
    public void enrollStudent(String student) {
        enrolledStudents++;
        System.out.println("Enrolled " + student + " in " + getCourseName());
    }
    
    @Override
    public void dropStudent(String student) {
        enrolledStudents--;
        System.out.println("Dropped " + student + " from " + getCourseName());
    }
    
    @Override
    public boolean isEnrolled(String student) {
        return enrolledStudents > 0;
    }
    
    // Reportable interface methods
    @Override
    public String generateReport() {
        return "Course Report: " + getCourseName() + " - Students: " + enrolledStudents;
    }
    
    @Override
    public void saveReport(String filename) {
        System.out.println("Saving report to: " + filename);
    }
    
    @Override
    public void printReport() {
        System.out.println(generateReport());
    }
}

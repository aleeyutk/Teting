package schoolmanagement;

public class Student extends Person implements Enrollable {
    // Fields
    private int gradeLevel;
    private double gpa;
    
    // Constructor
    public Student(String name, int id, int gradeLevel) {
        super(name, id);
        this.gradeLevel = gradeLevel;
        this.gpa = 0.0;
    }
    // Getters and Setters
    public int getGradeLevel() {
        return gradeLevel;
    }
    
    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    // Abstract method implementation
    @Override
    public String getRole() {
        return "Student";
    }
    
    // Interface methods
    @Override
    public void enrollStudent(String student) {
        System.out.println("Enrolling student: " + student);
    }
    
    @Override
    public void dropStudent(String student) {
        System.out.println("Dropping student: " + student);
    }
    
    @Override
    public boolean isEnrolled(String student) {
        return true; // Simplified
    }
}

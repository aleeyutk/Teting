package schoolmanagement;

public class Teacher extends Person implements Teachable, Gradable {
    // Fields
    private String subject;
    private int yearsExperience;
    
    // Constructor
    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
        this.yearsExperience = 0;
    }
    
    // Getters and Setters
    public String getSubject() {
        return subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public int getYearsExperience() {
        return yearsExperience;
    }
    
    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }
    
    // Abstract method implementation
    @Override
    public String getRole() {
        return "Teacher";
    }
    
    // Teachable interface methods
    @Override
    public void teachCourse(String course) {
        System.out.println("Teaching course: " + course);
    }
    
    @Override
    public void prepareMaterials() {
        System.out.println("Preparing teaching materials");
    }
    
    @Override
    public void assessStudents() {
        System.out.println("Assessing students");
    }
    
    // Gradable interface methods
    @Override
    public void assignGrade(String student, double grade) {
        System.out.println("Assigning grade " + grade + " to " + student);
    }
    
    @Override
    public double calculateAverage() {
        return 85.5; // Simplified
    }
    
    @Override
    public String generateReport() {
        return "Grade report generated";
    }
}

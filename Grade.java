package schoolmanagement;

public class Grade extends Assessment implements Gradable, Reportable {
    // Fields
    private String studentName;
    private double actualScore;
    
    // Getters and Setters
    public String getStudentName() {
        return studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public double getActualScore() {
        return actualScore;
    }
    
    public void setActualScore(double actualScore) {
        this.actualScore = actualScore;
    }
    
    // Abstract method implementations
    @Override
    public double calculateGrade() {
        return (actualScore / getMaxScore()) * 100;
    }
    
    @Override
    public boolean isPassed() {
        return calculateGrade() >= 60;
    }
    
    // Gradable interface methods
    @Override
    public void assignGrade(String student, double grade) {
        this.studentName = student;
        this.actualScore = grade;
    }
    
    @Override
    public double calculateAverage() {
        return actualScore; // Simplified
    }
    
    @Override
    public String generateReport() {
        return "Grade Report for " + studentName + ": " + calculateGrade() + "%";
    }
    
    // Reportable interface methods
    @Override
    public void saveReport(String filename) {
        System.out.println("Saving grade report to: " + filename);
    }
    
    @Override
    public void printReport() {
        System.out.println(generateReport());
    }
}

package schoolmanagement;

public abstract class Assessment {
    // Fields
    private String assessmentName;
    private double maxScore;
    
    // Getters and Setters
    public String getAssessmentName() {
        return assessmentName;
    }
    
    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }
    
    public double getMaxScore() {
        return maxScore;
    }
    
    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }
    
    // Abstract methods
    public abstract double calculateGrade();
    public abstract boolean isPassed();
}

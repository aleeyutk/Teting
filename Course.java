package schoolmanagement;

public abstract class Course {
    // Fields
    private String courseCode;
    private String courseName;
    
    // Getters and Setters
    public String getCourseCode() {
        return courseCode;
    }
    
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    // Abstract methods
    public abstract int getCredits();
    public abstract String getDepartment();
}

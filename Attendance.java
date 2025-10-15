package schoolmanagement;

public class Attendance implements Attendable, Reportable {
    // Fields
    private String studentName;
    private int daysPresent;
    private int totalDays;
    
    // Getters and Setters
    public String getStudentName() {
        return studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public int getDaysPresent() {
        return daysPresent;
    }
    
    public void setDaysPresent(int daysPresent) {
        this.daysPresent = daysPresent;
    }
    
    public int getTotalDays() {
        return totalDays;
    }
    
    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }
    
    // Attendable interface methods
    @Override
    public void markAttendance(String student, boolean present) {
        this.studentName = student;
        if (present) {
            daysPresent++;
        }
        totalDays++;
    }
    
    @Override
    public int getAttendanceCount(String student) {
        return daysPresent;
    }
    
    @Override
    public double calculateAttendanceRate(String student) {
        if (totalDays == 0) return 0;
        return (double) daysPresent / totalDays * 100;
    }
    
    // Reportable interface methods
    @Override
    public String generateReport() {
        return "Attendance Report: " + studentName + " - " + 
               calculateAttendanceRate(studentName) + "% present";
    }
    
    @Override
    public void saveReport(String filename) {
        System.out.println("Saving attendance report to: " + filename);
    }
    
    @Override
    public void printReport() {
        System.out.println(generateReport());
    }
}

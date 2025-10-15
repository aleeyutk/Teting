package schoolmanagement;

public interface Gradable {
    void assignGrade(String student, double grade);
    double calculateAverage();
    String generateReport();
}

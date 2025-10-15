package schoolmanagement;

public interface Reportable {
    String generateReport();
    void saveReport(String filename);
    void printReport();
}

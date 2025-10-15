package schoolmanagement;

public interface Enrollable {
    void enrollStudent(String student);
    void dropStudent(String student);
    boolean isEnrolled(String student);
}

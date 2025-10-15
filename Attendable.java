package schoolmanagement;

public interface Attendable {
    void markAttendance(String student, boolean present);
    int getAttendanceCount(String student);
    double calculateAttendanceRate(String student);
}

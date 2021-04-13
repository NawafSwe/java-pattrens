// creating singleton class

import java.util.Objects;

public class StudentSingleton {
    private static StudentSingleton singleton = null;
    private String studentId, studentName;

    private StudentSingleton() {
    }

    public static StudentSingleton getInstance() {
        return Objects.requireNonNullElseGet(singleton, StudentSingleton::new);

    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}

// creating singleton class

import java.util.Objects;

public class StudentSingleton {
    public static StudentSingleton singleton = null;
    private String studentId, studentName;

    private StudentSingleton() {
    }

    public static StudentSingleton getInstance() {
        return Objects.requireNonNullElseGet(singleton, StudentSingleton::new);

    }
}

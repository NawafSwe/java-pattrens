// creating singleton class

import java.util.Objects;

public class StudentSingleton {
    private static StudentSingleton singleton = null;
    private String studentId, studentName;
    // limiting number of instances
    private static final int LIMIT = 8;
    private static int instanceCount = 0;

    private StudentSingleton() {
    }

    // get instance to get current instance
    public static synchronized StudentSingleton getInstance() {

        if (instanceCount > LIMIT) {
            return null;
        } else {
            singleton = new StudentSingleton();
            instanceCount++;
            return singleton;
        }
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

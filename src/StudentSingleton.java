// creating singleton class

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class StudentSingleton {

    private int studentId;
    private String studentName;
    // limiting number of instances
    private static final int LIMIT = 3;
    private static int instanceCount = 0;

    private StudentSingleton() {
    }

    // get instance to get current instance
    public static synchronized StudentSingleton[] getInstance() {
        if (instanceCount > LIMIT) {
            return StudentStore.getSingletonList();
        } else {
            StudentStore.initList(LIMIT);
            StudentStore.getSingletonList()[instanceCount] = new StudentSingleton();
            Random rand = new Random();
            StudentStore.getSingletonList()[instanceCount].studentId = rand.nextInt(8);
            StudentStore.getSingletonList()[instanceCount].studentName = "this is obj numb " + instanceCount;
            instanceCount++;
            return StudentStore.getSingletonList();
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


}

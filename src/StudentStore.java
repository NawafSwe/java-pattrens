import java.util.Arrays;

public class StudentStore {
    private static StudentSingleton[] singletonList = null;

    private StudentStore() {
    }

    public static StudentSingleton[] getSingletonList() {
        return singletonList;
    }

    // getting obj by id
    public static StudentSingleton getById(int id) {
        return (StudentSingleton) Arrays.stream(singletonList).filter(obj -> obj.getStudentId() == id);
    }
}

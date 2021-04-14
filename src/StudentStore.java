public class StudentStore {
    private static StudentSingleton[] singletonList = null;
    private static final int LIMIT = 3;
    private static int instanceCount = 0;

    private StudentStore() {
    }

    public static StudentSingleton[] getSingletonList() {
        return singletonList;
    }

    // getting obj by id
    public static StudentSingleton getById(int id) {
        for (StudentSingleton studentSingleton : singletonList) {
            if (studentSingleton != null)
                if (studentSingleton.getStudentId() == id)
                    return studentSingleton;
        }
        return null;
    }

    public static void initList() {
        singletonList = new StudentSingleton[LIMIT];
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static int getLIMIT() {
        return LIMIT;
    }

    public static void setInstanceCount(int instanceCount) {
        StudentStore.instanceCount = instanceCount;
    }
}

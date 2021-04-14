// creating singleton class
public class StudentSingleton {
    private int studentId;
    private String studentName;
    private StudentSingleton() { }
    // get instance to get current instance
    public static synchronized StudentSingleton[] getInstance() {
        if (StudentStore.getSingletonList() != null) {
            if (StudentStore.getInstanceCount() < StudentStore.getLIMIT()) {
                int index = StudentStore.getInstanceCount();
                StudentStore.getSingletonList()[index] = new StudentSingleton();
                StudentStore.getSingletonList()[index].setStudentId(index);
                StudentStore.getSingletonList()[index].setStudentName("this is obj numb " + index);
                StudentStore.setInstanceCount(StudentStore.getInstanceCount() + 1);
            }

        } else {
            StudentStore.initList();
            int index = StudentStore.getInstanceCount();
            StudentStore.getSingletonList()[index] = new StudentSingleton();
            StudentStore.getSingletonList()[index].setStudentId(index);
            StudentStore.getSingletonList()[index].setStudentName("this is obj numb " + index);
            StudentStore.setInstanceCount(index + 1);

        }
        // if exceeding limit return the list itself
        return StudentStore.getSingletonList();
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

    @Override
    public String toString() {
        return "StudentSingleton{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}

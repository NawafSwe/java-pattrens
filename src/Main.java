import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        try {
            // this will call func to get list of current instance if limit reached it will return the current list,
            // otherwise it will create new instance and added to the current list and return it
            StudentSingleton.getInstance();
            StudentSingleton.getInstance();
            StudentSingleton.getInstance();
            // trying to reach the limit
            //StudentSingleton.getInstance();
            for (StudentSingleton item : Objects.requireNonNull(StudentStore.getSingletonList())) {
                System.out.println(item);
            }

            System.out.println("---------------------- getting items by id ---------------");
            System.out.println(StudentStore.getById(1));
            System.out.println(StudentStore.getById(0));
            System.out.println(StudentStore.getById(2));
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}


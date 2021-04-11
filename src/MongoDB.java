public class MongoDB extends Database {
    public MongoDB(String uri, String name) {
        super(uri, name);
    }

    @Override
    void connect() {
        // different databases can have different ways of connections
        System.out.println("MongoDB connection successfully done");
        System.out.println("Database name { " + this.getName() + " }");
    }
}

public class MySql extends Database {
    public MySql(String uri, String name) {
        super(uri, name);
    }

    @Override
    void connect() {
        // different databases can have different ways of connections
        System.out.println("MySql connection successfully done");
        System.out.println("Database name { " + this.getName() + " }");
    }
}

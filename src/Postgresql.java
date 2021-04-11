public class Postgresql extends Database {

    public Postgresql(String uri, String name) {
        super(uri, name);
    }

    @Override
    void connect() {
        // different databases can have different ways of connections
        System.out.println("Postgresql connection successfully done");
        System.out.println("Database name { " + this.getName() + " }");
    }
}

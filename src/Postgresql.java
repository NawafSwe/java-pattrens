public class Postgresql implements Database {

    private String uri, name;

    public Postgresql(String uri, String name) {
        this.uri = uri;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getUri() {
        return uri;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    // overriding to connect to the db
    @Override
    public void connect() {
        // different databases can have different ways of connections
        System.out.println("Postgresql connection successfully done");
        System.out.println("Database name { " + this.getName() + " }");
    }

    @Override
    public String toString() {
        return "MySql{" +
                "uri='" + uri + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

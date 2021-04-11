
// abstract database class that will init a database clas
public abstract class Database {
    private String uri;
    private String name;

    Database(String uri, String name) {
        this.uri = uri;
        this.name = name;
    }

    // abstract function will be implemented later
    abstract void connect();

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

    // to show current database
    @Override
    public String toString() {
        return "Database{" +
                "uri='" + uri + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

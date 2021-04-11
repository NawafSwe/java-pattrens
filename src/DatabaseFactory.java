public abstract class DatabaseFactory {
    public DatabaseFactory(){}

    public static Database createDatabase(String type, String uri, String name) throws Exception {
        return switch (type) {
            case "MongoDB" -> new MongoDB(uri, name);
            case "Postgresql" -> new Postgresql(uri, name);
            case "MySql" -> new MySql(uri, name);
            default -> throw new Exception("Not valid type");
        };
    }
}

public class DatabaseFactory {

    public static Database createDatabase(String type, String uri, String name) {
        return switch (type) {
            case "MongoDB" -> new MongoDB(uri, name);
            case "Postgresql" -> new Postgresql(uri, name);
            case "MySql" -> new MySql(uri, name);
            default -> null;
        };
    }
}

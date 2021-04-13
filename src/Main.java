
public class Main {
    // to avoid typos in strings
    enum databasesEnum {MongoDB, Postgresql, MySql}

    public static void main(String[] args) {
        // testing database factory

//        // mongoDB database
//        String mongoName = "MongoDB";
//        String mongoUri = "localhost:mongod";
//
//        // mysql database
//        String mysqlName = "MySql";
//        String mysqlUri = "localhost:msql";
//
//        // psql database
//        String psqlName = "Psql";
//        String psqlUri = "localhost:psql";
//
//        // testing factory class
//        // using try catch in case there is null
//        try {
//            Database mongo = DatabaseFactory.createDatabase(databasesEnum.MongoDB.name(), mongoUri, mongoName);
//            // testing database for mongo if it was created or not
//            mongo.connect();
//
//            // testing database for MySql if it was created or not
//            Database mysql = DatabaseFactory.createDatabase(databasesEnum.MySql.name(), mysqlUri, mysqlName);
//            mysql.connect();
//
//            // testing database for Postgresql if it was created or not
//            Database psql = DatabaseFactory.createDatabase(databasesEnum.Postgresql.name(), psqlUri, psqlName);
//            psql.connect();
//
//        } catch (Exception e) {
//            System.out.println(e.getLocalizedMessage());
//        }
    }
}


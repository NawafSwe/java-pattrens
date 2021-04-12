
public class Main {

    // to avoid typos
    enum databasesEnum {MongoDB, Postgresql, MySql}

    public static void main(String[] args) {
        // write your code here
        // declaring enum for databases

        // testing database factory
        Database[] databases = new Database[3];

        // mongoDB database
        String mongoName = "MongoDB";
        String mongoUri = "localhost:mongod";

        // mysql database
        String mysqlName = "MySql";
        String mysqlUri = "localhost:msql";

        // psql database
        String psqlName = "Psql";
        String psqlUri = "localhost:psql";

        // testing factory class
        try {

            databases[0] = DatabaseFactory.createDatabase(databasesEnum.MongoDB.name(), mongoUri, mongoName);
            // testing database for mongo if it was created or not
            System.out.println(databases[0]);

            // testing database for MySql if it was created or not
            databases[1] = DatabaseFactory.createDatabase(databasesEnum.MySql.name(), mysqlUri, mysqlName);
            System.out.println(databases[1]);

            // testing database for Postgresql if it was created or not
            databases[2] = DatabaseFactory.createDatabase(databasesEnum.Postgresql.name(), psqlUri, psqlName);
            System.out.println(databases[2]);

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }


    }
}


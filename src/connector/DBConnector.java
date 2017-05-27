package connector;


import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnector {
    private Connection conn = null;
    public void connect() {
        try {
            String userName = "root";
            String password = "";
            String sterownik = "com.mysql.jdbc.Drive";
            String url = "jdbc:mysql://localhost/prototyp";
            Class.forName(sterownik);
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Database connection established");
        } catch (Exception e) {
            System.err.println("Cannot connect to database server");
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Database connection terminated");
                } catch (Exception e) { /* ignore close errors */ }
            }
        }
    }
}


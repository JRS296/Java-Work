import java.sql.*;

public class FAT_prac_q3 {
    static final String DB_URL = "jdbc:mysql://localhost:3307/world";
    static final String USER = "root";
    static final String PASS = "pama2018";
    static final String QUERY = "SELECT * FROM city WHERE population > 500000000";

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(QUERY);) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Population: " + rs.getInt("population"));
                System.out.print(", Name: " + rs.getString("name"));
                System.out.println(", District: " + rs.getString("district"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*
Step 1: Start MySQL Command Line Client
Step 2: create database Demo1;
Step 3: show databases;
Step 4: connect Demo1;
Step 5: show tables;
Step 6: CREATE NEW TABLE (xyz varchar(50), submission_date DATE, abc INT(50), fgh DOUBLE(50))
Step 7: ADD mysql-connector-java-5.1.44-bin.jar to reference library
Step 8: import java.sql.*;
*/
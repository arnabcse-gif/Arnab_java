import java.sql.*;

public class MyDatabaseDemo {
    public static void main(String[] args) {
        try {
            // Connection details
            String url = "jdbc:mysql://localhost:3306/cse16";
            String user = "root";
            String password = "Arnab@2004"; // put your MySQL password

            // Create connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL!");

            // Create statement
            Statement stmt = con.createStatement();

            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // Display data
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            // Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
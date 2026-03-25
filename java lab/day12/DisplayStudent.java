import java.sql.*;

public class DisplayStudent {

    public static void main(String[] args) {

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to Database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college", "root", "password");

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Display Records
            System.out.println("ID\tName\tMarks");

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + "\t" +
                                rs.getString(2) + "\t" +
                                rs.getInt(3));
            }

            // Close Connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
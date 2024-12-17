
import java.sql.*;

public class Database {

    public static void main(String[] args) {
        try {
            // Register JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");
            // Open JDBC connection.
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            //  Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            System.out.println("connection created");
            conn.close();
            String sql = "INSERT INTO students (name, age, grade) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

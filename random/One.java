package random;

import java.sql.*;

public class One {

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            //Register JDBC driver.
            Class.forName("com.mysql.jdbc.Driver");
            //Open JDBC connection.
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            //wite sql query.
            String sql = "INSERT INTO students (name,age) VALUES (?,?)";
            //Prepare statement using conn and sql.
            PreparedStatement stmt = conn.prepareStatement(sql);
            //Get resultset
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                rs.getString("name");
                rs.getInt("id");
            }
            conn.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
//1. Register JDBC driver.
//2.Open JDBC connection.
//3. write sql query.
//4. Prepare statement using conn and sql.
//5. Get resultset using stmt.executeQuery();
//6. loop through resultset and print something.
//7. close the connection.


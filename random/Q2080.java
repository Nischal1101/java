package random;

import java.sql.*;

public class Q2080 {

    public static void main(String[] args) throws ClassNotFoundException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MOVIE", "root", "nischal");
            String insSql = "INSERT INTO MOVIE (id,title,genre) VALUES (?,?,?)";
            PreparedStatement insStmt = conn.prepareStatement(insSql);
            insStmt.setInt(1, 1);
            insStmt.setString(2, "HTV");
            insStmt.setString(3, "Action");
            insStmt.executeUpdate();
            insStmt.setInt(1, 2);
            insStmt.setString(2, "Puspa2");
            insStmt.setString(3, "Action");
            insStmt.executeUpdate();
            insStmt.setInt(1, 3);
            insStmt.setString(2, "Jatra");
            insStmt.setString(3, "Romantic");
            insStmt.executeUpdate();
            // String updateSql = "UPDATE MOVIE SET genre=? WHERE title=? ";
            // PreparedStatement updateStmt = conn.prepareStatement(updateSql);
            // updateStmt.setString(2, "Jatra");
            // updateStmt.setString(1, "Comedy");
            // updateStmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}

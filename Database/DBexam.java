import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBexam {
 public static void main(String[] args) {
  try
  {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        conn.close();
        String sql="";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setString("name","nischal");
        pstmt.executeQuery();

  }
  catch(SQLException se)
  {
    System.out.println(se.getMessage());
 } 
 catch(Exception e)
 {
  System.out.println(e.getMessage());
 }
}
}

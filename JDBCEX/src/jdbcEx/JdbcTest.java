package jdbcEx;

//0. import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    try {
      // 1. JDBC 드라이버 (Oracle) 로딩
      Class.forName("oracle.jdbc.driver.OracleDriver");
      
      // 2. Connection 얻어오기
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      conn = DriverManager.getConnection(url, "webdb", "1234");
      System.out.println("접속성공");
      
      // 3. SQL문 준비 (/ 바인딩 / 실행)
      String query = "select author_id, author_name name, author_desc from author";
      pstmt = conn.prepareStatement(query);
      
      // 실행
      rs = pstmt.executeQuery();
      
      // 4.결과처리
      while (rs.next()) {
          int authorId = rs.getInt("author_id");
          String authorName = rs.getString("name");
          String authorDesc = rs.getString("author_desc");
          System.out.println(authorId + "\t" + authorName + "\t" + authorDesc + "\t");
      }
      
    } catch (ClassNotFoundException | SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}




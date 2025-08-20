package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTest2 {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // 1. JDBC 드라이버 로딩
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 2. DB 연결
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            conn = DriverManager.getConnection(url, "webdb", "1234");
            System.out.println("접속성공");

            // 3. SQL 작성 및 실행
            String query = "INSERT INTO author VALUES (author_id_seq.nextval, ?, ?)";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "테스트");
            pstmt.setString(2, "테스트 테스트 테스트...");

            int count = pstmt.executeUpdate();

            // 4. 결과 처리
            System.out.println(count + "건이 등록되었습니다.");

        } catch (ClassNotFoundException e) {
            System.out.println("error: 드라이버 로딩 실패 - " + e);
        } catch (SQLException e) {
            System.out.println("error: SQL 오류 - " + e);
        } finally {
            // 5. 자원 정리
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.out.println("error: 자원 정리 중 오류 - " + e);
            }
        }
    }
}
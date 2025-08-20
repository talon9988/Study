package com.javaex.dao; // Ensure this package matches your project structure

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date; // Required for java.util.Date

import com.javaex.vo.QuickOrderVo; // Ensure this import is correct

public class QuickOrderDao {

    // Database connection method (same as your EmaillistDao example)
    private Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String dburl = "jdbc:oracle:thin:@localhost:1521:xe"; // Ensure this is correct
            conn = DriverManager.getConnection(dburl, "webdb", "1234"); // Ensure credentials are correct
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC 드라이버 로드 실패!");
            // In a web application, consider throwing a custom exception or logging more robustly
        }
        return conn;
    }

    // Method to insert a new order
    public int insert(QuickOrderVo vo) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int count = 0;

        try {
            conn = getConnection();
            String query = "INSERT INTO quick_order (order_no, full_name, user_id, email, contact, password, " +
                           "product_type, order_quantity, agree_personal_info, agree_service_terms, " +
                           "agree_email_ads, order_date) " +
                           "VALUES (seq_quick_order_no.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, SYSDATE)";
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, vo.getFullName());
            pstmt.setString(2, vo.getUserId());
            pstmt.setString(3, vo.getEmail());
            pstmt.setString(4, vo.getContact());
            pstmt.setString(5, vo.getPassword()); // Storing plain password - not recommended for production
            pstmt.setString(6, vo.getProductType());
            pstmt.setInt(7, vo.getOrderQuantity());
            pstmt.setString(8, vo.getAgreePersonalInfo());
            pstmt.setString(9, vo.getAgreeServiceTerms());
            pstmt.setString(10, vo.getAgreeEmailAds());

            count = pstmt.executeUpdate();
            System.out.println(count + "건 주문 등록 성공");

        } catch (SQLException e) {
            System.err.println("SQL Error in insert: " + e.getMessage());
            e.printStackTrace(); // For detailed error logging
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
        return count;
    }

    // Method to get a list of all orders
    public List<QuickOrderVo> getList() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<QuickOrderVo> list = new ArrayList<>();

        try {
            conn = getConnection();
            String query = "SELECT order_no, full_name, user_id, email, contact, password, " +
                           "product_type, order_quantity, agree_personal_info, agree_service_terms, " +
                           "agree_email_ads, order_date " +
                           "FROM quick_order ORDER BY order_no DESC";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                int orderNo = rs.getInt("order_no");
                String fullName = rs.getString("full_name");
                String userId = rs.getString("user_id");
                String email = rs.getString("email");
                String contact = rs.getString("contact");
                String password = rs.getString("password"); // Retrieving password - be careful with this
                String productType = rs.getString("product_type");
                int orderQuantity = rs.getInt("order_quantity");
                String agreePersonalInfo = rs.getString("agree_personal_info");
                String agreeServiceTerms = rs.getString("agree_service_terms");
                String agreeEmailAds = rs.getString("agree_email_ads");
                Date orderDate = rs.getDate("order_date");

                QuickOrderVo vo = new QuickOrderVo(orderNo, fullName, userId, email, contact, password,
                                                   productType, orderQuantity, agreePersonalInfo,
                                                   agreeServiceTerms, agreeEmailAds, orderDate);
                list.add(vo);
            }
        } catch (SQLException e) {
            System.err.println("SQL Error in getList: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
        return list;
    }

    // You can add other methods like delete(int orderNo), getOrderById(int orderNo), update(QuickOrderVo vo) as needed.
}

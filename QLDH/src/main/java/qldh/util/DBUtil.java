package qldh.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/order_management";


    private static final String USER = "root";         // thay bằng user MySQL của bạn
    private static final String PASSWORD = "12345";   // thay bằng mật khẩu MySQL của bạn

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/QLBH";
        String user = "root";
        String password = "your_password";
        System.out.println(">>> Đang kết nối tới: " + JDBC_URL);
        System.out.println("Connecting to: " + url);


        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }
}

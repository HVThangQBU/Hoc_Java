package connectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBContext {
  public Connection connection;
  private static String DB_URL = "jdbc:mysql://localhost:3307/scrapy";
  private static String USER_NAME = "root";
  private static String PASSWORD = "2001";

  /**
   * main
   *
   * @author viettuts.vn
   * @param args
   */
//  public static void main(String args[]) {
//    try {
//      // connnect to database 'testdb'
//      Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
//      // crate statement
//      Statement stmt = conn.createStatement();
//      // get data from table 'student'
//      ResultSet rs = stmt.executeQuery("select * from danhmucbaiviet");
//      // show data
//      while (rs.next()) {
//        System.out.println(rs.getInt(1) + "  " + rs.getString(2) + " "+ rs.getString(3)
//          + "  ");
//      }
//      // close connection
//      conn.close();
//    } catch (Exception ex) {
//      ex.printStackTrace();
//    }
//  }

//  public static Connection getConnection(String dbURL, String userName,
//                                         String password) {
//    Connection conn = null;
//    try {
//      Class.forName("com.mysql.jdbc.Driver");
//      conn = DriverManager.getConnection(dbURL, userName, password);
//      System.out.println("connect successfully!");
//    } catch (Exception ex) {
//      System.out.println("connect failure!");
//      ex.printStackTrace();
//    }
//    return conn;
//  }
  public DBContext()  {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
//      System.out.println("connect successfully!");
    } catch (Exception ex) {
      System.out.println("connect failure!");
      ex.printStackTrace();
    }
  }
}

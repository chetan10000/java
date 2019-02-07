 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.sql.Statement;

 public class NewSql {
     public static void main(String[] args) {
         String connectionUrl = "jdbc:sqlserver://CHETAN-PC:1433;databaseName=Hey;user=sa;password=chetan";
         
         try (Connection con = DriverManager.getConnection(connectionUrl);
                 Statement stmt = con.createStatement();) {
             String SQL = "SELECT * FROM chet";
             ResultSet rs = stmt.executeQuery(SQL);
             while (rs.next()) {
                 System.out.println(rs.getString("name"));
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }
 }
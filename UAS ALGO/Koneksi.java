import greenfoot.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class Koneksi
{
    public static Connection con;
    public static Statement stm;
    
    public Koneksi(){
        try {
            String url ="jdbc:mysql://localhost/arah";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
           
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
        
}  
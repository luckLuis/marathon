package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author jacom
 */
public class Conexion {
    
    
    private static final String BD = "test";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";
    private static final String PORT = "localhost";
    private static final String IP = "5433";
    private static final String URL = "jdbc:mysql://localhost:3306/marathondb?useSSL=false&useTimezone=true&serverTimeZone=UTC&allowPublicKeyRetrieval=true";
    
    Connection con;
    
    public Conexion() {
                       
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marathon?useSSL=false&useTimezone=true&serverTimeZone=UTC&allowPublicKeyRetrieval=true", "root", "123456");
                System.out.println("Se conectó");
            } catch(Exception e){
                System.out.println("no Se conectó");
            }              
    }  
    
    public Connection getConnection(){
        return con;
    }
    

    public static void Close(ResultSet rs){
        
        try {
            rs.close();
        } catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
    
    public static void Close(PreparedStatement stm){
        
        try {
            stm.close();
        } catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
    
    public static void Close(Connection conn){
        
        try {
            conn.close();
        } catch (Exception e){
            e.printStackTrace(System.out);
        }
    }
    
    
    public static void main(String[] args){
    Conexion conexion = new Conexion();
    
    Statement st;
    ResultSet rs;
    
    try {
        
        
        
        st =conexion.con.createStatement();
        System.out.println("Tabla");
        rs = st.executeQuery("SELECT * FROM enterprises");
        
        while (rs.next()){
            System.out.println(rs.getInt("id") + " " + rs.getString("addres"));
            System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            System.out.println(rs.getInt("id") + " " + rs.getInt("phone"));
            
            
        }
        conexion.con.close();
    
    } catch(Exception e){}
    
    
    }
    
}

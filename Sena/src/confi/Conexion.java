
package confi;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
    Connection conn;
    public int x;
    
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sena" , "root" , "");
            System.out.println("Conexion OK");
            x = 1;
        } catch (Exception e) {
            System.err.println("error" + e);
            JOptionPane.showMessageDialog(null, "Error de conexion con la basede datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            x = 0;
        }
    }
    public Connection getConnection(){
        return conn;
    }
}
package mx.itson.totoro.persistencia;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public Connection obtener() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/totorodb", "diego", "761834925");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return conexion;
    }
}

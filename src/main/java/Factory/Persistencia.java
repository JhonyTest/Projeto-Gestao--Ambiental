
package Factory;

import java.sql.Connection; // conexão SQL para Java
import java.sql.DriverManager; // driver de conexão SQL para Java
import java.sql.SQLException; // classe para tratamento de exceções
import java.util.logging.Level;
import java.util.logging.Logger;

public class Persistencia {

    private static Connection connection = null;

    private Persistencia() {
        try {
            Class.forName("");
            this.connection = DriverManager.getConnection("");
        } catch (ClassNotFoundException ex) {
            System.err.println("Error - Ao abrir conexão." + ex.toString());
        } catch (SQLException ex) {
            System.err.println("Error - Ao abrir conexão." + ex.toString());
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            new Persistencia();
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            connection.close();
            connection = null;
        } catch (SQLException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

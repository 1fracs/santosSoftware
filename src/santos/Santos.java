/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package santos;

import Cliente.GestionarCliente;
import java.sql.SQLException;

/**
 *
 * @author juanfracastellar
 */
public class Santos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        GestionarCliente con = new GestionarCliente();
        con.selectAllCliente();
        con.desconectar();
        
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Cliente.Cliente;
import bd.ConfigBd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juanfracastellar
 */


public class GestionarCliente {

    public String bd = ConfigBd.getBd();
    public String login = ConfigBd.getUsuario();
    public String password = ConfigBd.getPassword();
    public String url = "jdbc:mysql://"+ConfigBd.getServidor()+"/"+bd;
    Connection connection = null;
 
 
 

    public GestionarCliente() {
        try{
            //obtenemos el driver de para mysql
            Class.forName("org.gjt.mm.mysql.Driver");
            //obtenemos la conexión
            connection = DriverManager.getConnection(url,login,password);

        }
        catch(SQLException e){
           System.out.println(e);
        }catch(ClassNotFoundException e){
           System.out.println(e);
        }catch(Exception e){
           System.out.println(e);
        }
    }
   /**Permite retornar la conexión*/
   public Connection getConnection(){
      return connection;
   }
 
   public void desconectar(){
      connection = null;
   }
   
   public ArrayList<Cliente> selectAllCliente(){
       ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 
       try {
            Statement comando=connection.createStatement();
            ResultSet registro = comando.executeQuery("select * from Cliente");
            boolean especial = false;
            while (registro.next()){
                if(registro.getString(5).equalsIgnoreCase("1")){
                    especial=true;
                }
                Cliente c = new Cliente(registro.getInt(1), registro.getString(2), registro.getString(3), registro.getString(4), especial);
                clientes.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
          return clientes;
   }
  
   public void modificarCliente(Cliente c){
        try {
            int especial = 0;
            if(c.isEspecial()){
                especial = 1;
            }
            Statement comando=connection.createStatement();
            comando.executeUpdate("UPDATE Cliente SET "
                    + "Nombre='"+c.getNombre()+"',"
                    + "Apellidos='"+c.getApellidos()+"',"
                    + "Apodo='"+c.getApodo()+"',"
                    + "Especial='"+Integer.toString(especial)+"'"
                    + " WHERE idCliente='"+c.getIdCliente()+"'");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(GestionarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   public ArrayList<Cliente> buscarCliente(String tipo, String condicion){
       Cliente clienteBuscado=null;
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        try {
            Statement comando=connection.createStatement();
            //System.out.println("select * from Cliente where "+tipo+" like %'"+condicion+"'%");
            ResultSet registro = comando.executeQuery("select * from Cliente where "+tipo+" like '%"+condicion+"%'");
            
            boolean especial = false;
            while (registro.next()){
                if(registro.getString(5).equalsIgnoreCase("1")){
                    especial=true;
                }
                clienteBuscado = new Cliente(registro.getInt(1), registro.getString(2), registro.getString(3), registro.getString(4), especial);
                clientes.add(clienteBuscado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
       return clientes;
   }
   public void insertarCliente(Cliente c){
        try {
            Statement comando=connection.createStatement();
            int especial = 0;
            if(c.isEspecial()){
                especial = 1;
            }
            System.out.println(especial);
             /*System.out.println("INSERT INTO Cliente" +
                    "(idCliente," +
                    "'Nombre," +
                    "'Apellidos'," +
                    "'Apodo'," +
                    "'Especial')" +
                    "VALUES" +
                    "(null,'" +
                    c.getNombre()+"','" +
                    c.getApellidos()+"','" +
                    c.getApodo()+"','" +
                    especial+"')");*/
            comando.executeUpdate(
                    "INSERT INTO Cliente" +
                    "(idCliente," +
                    "Nombre," +
                    "Apellidos," +
                    "Apodo," +
                    "Especial)" +
                    "VALUES" +
                    "(NULL,'" +
                    c.getNombre()+"','" +
                    c.getApellidos()+"','" +
                    c.getApodo()+"','" +
                    especial+"')");
           
            
        } catch (SQLException ex) {
            Logger.getLogger(GestionarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   

   
}

    


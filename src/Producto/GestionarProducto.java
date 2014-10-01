/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Producto;

import Cliente.Cliente;
import Cliente.GestionarCliente;
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
 * @author Juanfra
 */

public class GestionarProducto {
    public String bd = ConfigBd.getBd();
    public String login = ConfigBd.getUsuario();
    public String password = ConfigBd.getPassword();
    public String url = "jdbc:mysql://"+ConfigBd.getServidor()+"/"+bd;
    Connection connection = null;
    
    public GestionarProducto(){
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
    
    public Connection getConnection(){
      return connection;
    }
 
    public void desconectar(){
      connection = null;
    }
    
    public ArrayList<Producto> selectAllProducto(){
       ArrayList<Producto> productos = new ArrayList<Producto>(); 
       try {
            Statement comando=connection.createStatement();
            ResultSet r = comando.executeQuery("select * from Productos");
            boolean especial = false;
            while (r.next()){
                Producto p = new Producto(r.getInt(1), r.getString(2),r.getString(3), r.getDouble(4), r.getInt(5));
                productos.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
          return productos;
   }
    
    public void modificarProducto(Producto p){
        try {
            Statement comando=connection.createStatement();
           
            comando.executeUpdate("UPDATE Productos SET "
                    + "Nombre='"+p.getNombre()+"',"
                    + "Ref='"+p.getRef()+"',"
                    + "Precio='"+Double.toString(p.getPrecio())+"',"
                    + "Combinacion='"+Integer.toString(p.getCombinacion())+"'"
                    + " WHERE idProducto='"+p.getIdProducto()+"'");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(GestionarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertarProducto(Producto p){
        try {
            Statement comando=connection.createStatement();
            comando.executeUpdate(
                    "INSERT INTO Productos" +
                    "(idProducto," +
                    "Nombre," +
                    "Ref," +
                    "Precio," +
                    "Combinacion)" +
                    "VALUES" +
                    "(NULL,'" +
                    p.getNombre()+"','" +
                    p.getRef()+"','" +
                    p.getPrecio()+"','" +
                    p.getCombinacion()+"')");
           
            
        } catch (SQLException ex) {
            Logger.getLogger(GestionarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Almacen;

/**
 *
 * @author Juanfra
 */
public class Almacen {
    private int idAlmacen;
    private String nombre;
    private String posicion;

    public Almacen(int idAlmacen, String nombre, String posicion) {
        this.idAlmacen = idAlmacen;
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
}

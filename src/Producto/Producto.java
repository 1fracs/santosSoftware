/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Producto;

/**
 *
 * @author Juanfra
 */
public class Producto {
    private int idProducto;
    private String nombre;
    private String ref;
    private double precio;
    private int combinacion;

    public Producto(int idProducto, String nombre, String ref, double precio, int combinacion) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.ref = ref;
        this.precio = precio;
        this.combinacion = combinacion;
    }
    public Producto(String nombre, String ref, double precio, int combinacion) {
        this.nombre = nombre;
        this.ref = ref;
        this.precio = precio;
        this.combinacion = combinacion;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCombinacion() {
        return combinacion;
    }

    public void setCombinacion(int combinacion) {
        this.combinacion = combinacion;
    }
    
    
}

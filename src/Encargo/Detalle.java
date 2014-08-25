/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Encargo;

import Producto.Producto;

/**
 *
 * @author Juanfra
 */
public class Detalle {
    private int idDetalle;
    private Encargo encargo;
    private Producto producto;
    private String otro;
    private double precio;
    private int cantidad;
    private String color;

    public Detalle(int idDetalle, Encargo encargo, Producto producto, String otro, double precio, int cantidad, String color) {
        this.idDetalle = idDetalle;
        this.encargo = encargo;
        this.producto = producto;
        this.otro = otro;
        this.precio = precio;
        this.cantidad = cantidad;
        this.color = color;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Encargo getEncargo() {
        return encargo;
    }

    public void setEncargo(Encargo encargo) {
        this.encargo = encargo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}

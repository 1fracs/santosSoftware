/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tpv;

import Encargo.Encargo;
import Producto.Producto;

/**
 *
 * @author Juanfra
 */
public class Detalle {
    private int idDetalle;
    private Tpv tpv;
    private Encargo encargo;
    private Producto producto;
    private String otro;
    private double cantidad;
    private double precio;

    public Detalle(int idDetalle, Tpv tpv, Encargo encargo, Producto producto, String otro, double cantidad, double precio) {
        this.idDetalle = idDetalle;
        this.tpv = tpv;
        this.encargo = encargo;
        this.producto = producto;
        this.otro = otro;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Tpv getTpv() {
        return tpv;
    }

    public void setTpv(Tpv tpv) {
        this.tpv = tpv;
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

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}

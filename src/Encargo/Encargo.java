/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Encargo;

import java.util.GregorianCalendar;

/**
 *
 * @author Juanfra
 */
public class Encargo {
    private int idEncargo;
    private int cliente;
    private GregorianCalendar fechaEncargo;
    private String horaEncargo;
    private String fechaRecogida;
    private String horaRecogida;
    private int ubicacion;
    private double total;
    private double entrega;

    public Encargo(int idEncargo, int cliente, GregorianCalendar fechaEncargo, String horaEncargo, String fechaRecogida, String horaRecogida, int ubicacion, double total, double entrega) {
        this.idEncargo = idEncargo;
        this.cliente = cliente;
        this.fechaEncargo = fechaEncargo;
        this.horaEncargo = horaEncargo;
        this.fechaRecogida = fechaRecogida;
        this.horaRecogida = horaRecogida;
        this.ubicacion = ubicacion;
        this.total = total;
        this.entrega = entrega;
    }

    public int getIdEncargo() {
        return idEncargo;
    }

    public void setIdEncargo(int idEncargo) {
        this.idEncargo = idEncargo;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public GregorianCalendar getFechaEncargo() {
        return fechaEncargo;
    }

    public void setFechaEncargo(GregorianCalendar fechaEncargo) {
        this.fechaEncargo = fechaEncargo;
    }

    public String getHoraEncargo() {
        return horaEncargo;
    }

    public void setHoraEncargo(String horaEncargo) {
        this.horaEncargo = horaEncargo;
    }

    public String getFechaRecogida() {
        return fechaRecogida;
    }

    public void setFechaRecogida(String fechaRecogida) {
        this.fechaRecogida = fechaRecogida;
    }

    public String getHoraRecogida() {
        return horaRecogida;
    }

    public void setHoraRecogida(String horaRecogida) {
        this.horaRecogida = horaRecogida;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getEntrega() {
        return entrega;
    }

    public void setEntrega(double entrega) {
        this.entrega = entrega;
    }
    
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tpv;

import Cliente.Cliente;
import java.util.GregorianCalendar;

/**
 *
 * @author Juanfra
 */
public class Tpv {
    private int idTpv;
    private GregorianCalendar fecha;
    private GregorianCalendar hora;
    private Cliente cliente;
    private double total;
    private double entrega;

    public Tpv(int idTpv, GregorianCalendar fecha, GregorianCalendar hora, Cliente cliente, double total, double entrega) {
        this.idTpv = idTpv;
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.total = total;
        this.entrega = entrega;
    }

    public int getIdTpv() {
        return idTpv;
    }

    public void setIdTpv(int idTpv) {
        this.idTpv = idTpv;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public GregorianCalendar getHora() {
        return hora;
    }

    public void setHora(GregorianCalendar hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

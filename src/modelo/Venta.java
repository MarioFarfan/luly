/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author mfarf
 */
public class Venta {
    private String idVenta;
    private int cantidad;
    private Date fecha;
    private double importe;
    private String hora; /*CREO QUE DEBEMOS BUSCAR COMO GUARDARLO*/

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Venta(String idVenta, int cantidad, Date fecha, double importe, String hora) {
        this.idVenta = idVenta;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.importe = importe;
        this.hora = hora;
    }
    
}

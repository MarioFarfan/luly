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
public class Compra {
    private String idCompra;
    private int cantidad;
    private Date fecha;

    public Compra(String idVentaP, int cantidad, Date fecha) {
        this.idCompra = idVentaP;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public String getIdVentaP() {
        return idCompra;
    }

    public void setIdVentaP(String idCompra) {
        this.idCompra = idCompra;
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
    
}

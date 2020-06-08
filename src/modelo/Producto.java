/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author mfarf
 */
public class Producto {
    private String idProducto;
    private String nombre;
    private double preciocompra;
    private double precioventa;
    private int existencia;
    
    public Producto(String idProducto, String nombre, double preciocompra, double precioventa, int existencia) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.preciocompra = preciocompra;
        this.precioventa = precioventa;
        this.existencia = existencia;
    }
    
    public Producto() {
        idProducto = "";
        nombre = "";
        preciocompra = 0.0;
        precioventa = 0.0;
        existencia = 0;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(double preciocompra) {
        this.preciocompra = preciocompra;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

}

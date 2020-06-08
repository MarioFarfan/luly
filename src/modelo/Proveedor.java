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
public class Proveedor {
    private String idProveedor;
    private String nombrep;
    private String telefonop;
    private String colonia;
    private String calle;

    public Proveedor (){
        idProveedor = "";
        nombrep = "";
        telefonop = "";
        colonia = "";
        calle = "";
        numero = "";
    }

    public Proveedor(String idProveedor, String nombrep, String telefonop, String colonia, String calle, String numero) {
        this.idProveedor = idProveedor;
        this.nombrep = nombrep;
        this.telefonop = telefonop;
        this.colonia = colonia;
        this.calle = calle;
        this.numero = numero;
    }
    
    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public String getTelefonop() {
        return telefonop;
    }

    public void setTelefonop(String telefonop) {
        this.telefonop = telefonop;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    private String numero;
    
}

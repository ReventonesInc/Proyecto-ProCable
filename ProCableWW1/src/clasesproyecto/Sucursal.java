/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesproyecto;

import clasesproyecto.listas.*;
import java.util.*;

/* Haashmap de planes conectado con la sucursal
*/

public class Sucursal {
    //private ListaFactura facturasSucursales;   
    private String nombreSucursal;
    private String direccionSurcursal;
    private String rutSucursal;

    private HashMap<String, ListaFactura> facturasAnuales;

    public Sucursal(String nombreSucursal, String direccionSurcursal, String rutSucursal) {
        this.nombreSucursal = nombreSucursal;
        this.direccionSurcursal = direccionSurcursal;
        this.rutSucursal = rutSucursal;
        this.facturasAnuales = new HashMap<>();
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getDireccionSurcursal() {
        return direccionSurcursal;
    }

    public void setDireccionSurcursal(String direccionSurcursal) {
        this.direccionSurcursal = direccionSurcursal;
    }

    public String getRutSucursal() {
        return rutSucursal;
    }

    public void setRutSucursal(String rutSucursal) {
        this.rutSucursal = rutSucursal;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesproyecto;

import clasesproyecto.listas.*;
import java.util.*;

/* Un Hashmap de planes conectado con la sucursal*/

public class Sucursal {
    //private ListaFactura facturasSucursales;  
    private int ID;
    private String nombreSucursal;
    private String direccionSurcursal;
    private String rutSucursal;

    private HashMap<String, HashMap<String, ListaFactura>> facturasAnuales;
    
//--------------------------------------Constructor--------------------------------------------------//
    
    public Sucursal(int ID, String nombreSucursal, String direccionSurcursal, String rutSucursal) {
        this.ID = ID;
        this.nombreSucursal = nombreSucursal;
        this.direccionSurcursal = direccionSurcursal;
        this.rutSucursal = rutSucursal;
        this.facturasAnuales = new HashMap<>();
    }

//--------------------------------------------- Getters y setters -----------------------------------//
    
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

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFacturasAnuales(HashMap<String, HashMap<String, ListaFactura>> facturasAnuales) {
        this.facturasAnuales = facturasAnuales;
    }

    public int getID() {
        return ID;
    }

//---------------------------------------- Métodos ---------------------------------------------//
    
    public HashMap<String, HashMap<String, ListaFactura>> getFacturasAnuales() {
        return facturasAnuales;
    }
    
    public boolean equals(Sucursal comparado){
        if(nombreSucursal.equals(comparado.getNombreSucursal())){
            return true;
        }
        else{
            return rutSucursal.equals(comparado.getRutSucursal());
        }
    }
    
}
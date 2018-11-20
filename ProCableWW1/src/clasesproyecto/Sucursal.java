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
    private int ID;
    private String nombreSucursal;
    private String direccionSurcursal;
    private String rutSucursal;

    private MapFacturasAnuales facturasAnuales;
    
//--------------------------------------Constructor--------------------------------------------------//
    
    public Sucursal(int ID, String nombreSucursal, String direccionSurcursal, String rutSucursal) {
        this.ID = ID;
        this.nombreSucursal = nombreSucursal;
        this.direccionSurcursal = direccionSurcursal;
        this.rutSucursal = rutSucursal;
        this.facturasAnuales = new MapFacturasAnuales();
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

    public int getID() {
        return ID;
    }
    
    public MapFacturasAnuales getFacturasAnuales() {
        return facturasAnuales;
    }
    
//---------------------------------------- Métodos ---------------------------------------------//  
    public boolean equals(Sucursal comparado){
        if(nombreSucursal.equals(comparado.getNombreSucursal())){
            return true;
        }
        else{
            return rutSucursal.equals(comparado.getRutSucursal());
        }
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesproyecto.listas;
import clasesproyecto.Factura;

import java.util.*;

public class MapFacturasAnuales {
    private HashMap<String, ListaMes> facturas;
    
    public MapFacturasAnuales(){
        this.facturas = new HashMap<>();
    }

    public HashMap<String, ListaMes> getFacturas() {
        return facturas;
    }
    
    public void setFacturas(HashMap<String, ListaMes> facturas) {
        this.facturas = facturas;
    }
    
    public boolean estaVacio(){
        return facturas.isEmpty();
    }
    
    public ListaFactura facturasAnoyMes(String year, int mes){
        if(estaVacio()){
            return null;
        }
        else{
            if(facturas.get(year).estaVacio()){
                return null;
            }
            else{
                return facturas.get(year).getMeses().get(mes).getFacturasMensuales();
            }
        }
    }
    
    public boolean agregarFactura(String year,int mes, Factura nuevaFactura){
        return facturas.get(year).agregarFactura(mes, nuevaFactura);
    }
}

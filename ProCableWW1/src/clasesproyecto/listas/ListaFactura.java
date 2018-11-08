/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesproyecto.listas;
import java.util.*;
import clasesproyecto.*;

public class ListaFactura {
    private ArrayList<Factura> facturas;
    
    
    public ListaFactura(){
        this.facturas = new ArrayList<Factura>();
    }
    
    public boolean estaVacio() {
        return facturas.isEmpty();
    }
    
    public int tamano(){
        return facturas.size();
    }
    
    public Factura buscarFactura (int idFactura){
        if(estaVacio()){
            return null;
        }
        else{
            for(int i = 0; i < tamano(); i++){
                if(facturas.get(i).getIdFactura() == idFactura){
                    return facturas.get(i);
                }
            }
        }
        return null;
    }
    
    public ArrayList<Factura> buscarFacturasCliente (String rutCliente){ //Funcionalidad propia
        
        ArrayList<Factura> facturasCliente = new ArrayList<Factura>();
        
        if(estaVacio()){
            return null;
        }
        else{
            for(int i = 0; i < tamano(); i++){
                if(facturas.get(i).getClienteAbonante().getRut().equals(rutCliente)){
                    facturasCliente.add(facturas.get(i));
                }
            }
        }
        return facturasCliente;
    }
    
    public boolean agregarFactura (Factura nuevaFactura){
        if(estaVacio()){
            facturas.add(nuevaFactura);
            return true;
        }
        else {
            if(buscarFactura(nuevaFactura.getIdFactura()) != null){
                return false;
            }
            else{
                facturas.add(nuevaFactura);
                return true;
            }
        }
    }
    
    
}

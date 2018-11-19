/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesproyecto;
import clasesproyecto.listas.*;

public class Mes {
    private int numeroMes;
    private ListaFactura facturasMensuales;
    
//--------------------------------------Constructor--------------------------------------------------//
    
    public Mes(int numeroMes) {
        this.numeroMes = numeroMes;
        this.facturasMensuales = new ListaFactura();
    }
    
//------------------------------------- Getters y setters -------------------------------------------//
    
    public int getNumeroMes() {
        return numeroMes;
    }

    public void setNumeroMes(int numeroMes) {
        this.numeroMes = numeroMes;
    }

    public ListaFactura getFacturasMensuales() {
        return facturasMensuales;
    }

    public void setFacturasMensuales(ListaFactura facturasMensuales) {
        this.facturasMensuales = facturasMensuales;
    }
    
//----------------------- Métodos ----------------------------------------------------------//
    
    
    
}
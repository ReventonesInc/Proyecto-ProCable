/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesproyecto.listas;
import java.util.*;
import clasesproyecto.*;

public class ListaMes {
    private ArrayList<Mes> meses;    

    public ListaMes() {
        this.meses = new ArrayList<Mes>();
        for(int i = 0; i < 12; i++){
            meses.add(new Mes(i));
        }        
    }

    public ArrayList<Mes> getMeses() {
        return meses;
    }

    public void setMeses(ArrayList<Mes> meses) {
        this.meses = meses;
    }
    
    public boolean estaVacio() {
        return meses.isEmpty();
    }
    
    public int tamano() {
        return meses.size();
    }
    
    public int indice(int numeroMes) {
        if(estaVacio()){
            return -1;
        }
        else{
            for(int i = 0; i < tamano(); i++){
                if(meses.get(i).getNumeroMes() == numeroMes){
                    return i;
                }
            }
        }
        return -1;
    }
    
    public boolean agregarFactura(int numMes, Factura nuevaFactura){
        return meses.get(numMes).getFacturasMensuales().agregarFactura(nuevaFactura);
    }
}
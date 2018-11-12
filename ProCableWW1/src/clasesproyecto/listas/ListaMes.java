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

//-------------------------------------- Constructor ------------------------------------------------//
    
    public ListaMes() {
        this.meses = new ArrayList<Mes>();
        for(int i = 0; i < 12; i++){
            meses.add(new Mes(i));
        }        
    }

//-------------------------------------- Getter y setter ------------------------------------------------//
    
    public ArrayList<Mes> getMeses() {
        return meses;
    }

    public void setMeses(ArrayList<Mes> meses) {
        this.meses = meses;
    }

//-------------------------------------- Metodos ------------------------------------------------//
    
    public boolean estaVacio() {
        return meses.isEmpty();
    }
    
    public int tamano() {
        return meses.size();
    }
    
    public int indice(int numeroMes) {                                          //Metodo que busca un mes por su numero y entrega el indice donde esta ubicado
        if(estaVacio()){                                                        //Si la lista esta vacia retorna un valor "nulo"
            return -1;
        }
        else{                                                                   //Sino, la recorre buscando una coincidencia en el numero de mes y retorna su posicion
            for(int i = 0; i < tamano(); i++){
                if(meses.get(i).getNumeroMes() == numeroMes){
                    return i;
                }
            }
        }
        return -1;                                                              //En caso de no encontrarlo, retorna un valor "nulo"
    }
    
    public boolean agregarFactura(int numMes, Factura nuevaFactura){                    //Metodo que agrega una factura dado el numero del mes y una factura
        return meses.get(numMes).getFacturasMensuales().agregarFactura(nuevaFactura);   //Retorna true si la factura fue agregada satisfactoriamente y false en caso contrario
    }
}
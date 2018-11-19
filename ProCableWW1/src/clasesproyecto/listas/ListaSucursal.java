/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesproyecto.listas;
import java.util.*;
import clasesproyecto.*;

import clasesproyecto.Sucursal;

public class ListaSucursal {
    private ArrayList<Sucursal> sucursales;

//--------------------------- Constructor ----------------------------------------------//
    
    public ListaSucursal(){
        this.sucursales = new ArrayList<Sucursal>();
    }
    
//---------------------------- Getter y setter ----------------------------------------------//

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

//---------------------------- Metodos ----------------------------------------------//

    
    public int tamano(){                                                        //Reemplazo para el metodo isEmpty
        return sucursales.size();
    }
    
    public boolean estaVacio(){                                                 //Reemplazo para el metodo size
        return sucursales.isEmpty();
    }
    
    public Sucursal buscarSucursal(String rutBuscada){                          //Metodo para buscar una sucursal segun un rut
        for(int i = 0; i < tamano(); i++){
            if(sucursales.get(i).getRutSucursal().equals(rutBuscada)){          //Si hay coincidencia entre los rut
                return sucursales.get(i);                                       //Se retorna la sucursal que tenga dicho rut
            }
        }
        return null;                                                            //Sino se retorna null ya que no se encontro
    }
    
    public Sucursal buscarSucursal(Sucursal buscada){                           //Metodo para buscar una sucursal dada una sucursal
        for(int i = 0; i < tamano(); i++){                                      //Se busca la sucursal, si se encuentra se retorna
            if(sucursales.get(i).equals(buscada)){
                return sucursales.get(i);
            }
        }
        return null;                                                            //Sino se retorna null
    }
    
    public boolean agregarSucursal(Sucursal nuevaSucursal){                     //Metodo para agregar sucursales
        if(buscarSucursal(nuevaSucursal) != null){                              //Si la sucursal ya esta no se agrega y retorna false
            return false;
        }
        else{
            sucursales.add(nuevaSucursal);                                      //Sino, se agrega y retorna true
            return true;
        }
    }
    
    public int indice(Sucursal buscado) {					//Metodo para retornar el indice del array
        if(estaVacio()) {							//Si la lista esta vacia retorna un valor fuera del vector
            return -1;									
        }
        else {								
            for(int i = 0; i < tamano(); i++) {					//Sino se busca el cleinte y se retorna su posicion	
                if(sucursales.get(i).equals(buscado)) {
                    return i;
		}
            }
            return -1;									
        }
    }
    public int indice(String rut) {						//Metodo para retornar el indice del array
        if(estaVacio()) {							//Si la lista esta vacia retorna un valor fuera del vector
            return -1;									
        }
        else {								
            for(int i = 0; i < tamano(); i++) {					//Sino se busca el cleinte y se retorna su posicion	
                if(sucursales.get(i).getRutSucursal().equals(rut)){
                    return i;
		}
            }
            return -1;									
        }
    }
    
    public boolean eliminarSucursal(String rutSucursal){                            //Metodo para eliminar una sucursal dado su rut
        Sucursal buscado = buscarSucursal(rutSucursal);                             //Variable que almacena la sucursal a eliminar
        if(buscado == null){                                                        //Si no se encuentra retorna false
            return false;
        }
        else{
            if(sucursales.get(tamano()-1).equals(buscado)){                         //En caso de encontrarlo al final
                    sucursales.remove(buscado);                                     //Se elimina y retorna true
                    return true;
                }
                else {
                    for(int i = indice(buscado)+1; i < tamano(); i++) {             //En caso de estar en medio
                        this.sucursales.get(i).setID(sucursales.get(i).getID()-1);  //Se modifican los id de las sucursales desde la sucursal a eliminar hasta el ultimo
                    }
                    sucursales.remove(buscado);                                     //Luego se elimina la sucursal y retorna true
                    return true;
                }
        }
    }
    
    public boolean agregarFactura(String rutSucursal, String year, int mes, Factura nuevaFactura){
        return buscarSucursal(rutSucursal).getFacturasAnuales().agregarFactura(year, mes, nuevaFactura);
    }
    
}

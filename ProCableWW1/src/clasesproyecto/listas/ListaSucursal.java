/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesproyecto.listas;
import java.util.*;

import clasesproyecto.Sucursal;

public class ListaSucursal {
    private ArrayList<Sucursal> sucursales;
    
    public ListaSucursal(){
        this.sucursales = new ArrayList<Sucursal>();
    }
    
    public int tamano(){
        return sucursales.size();
    }
    
    public boolean estaVacio(){
        return sucursales.isEmpty();
    }
    
    public Sucursal buscarSucursal(String rutBuscada){
        for(int i = 0; i < tamano(); i++){
            if(sucursales.get(i).getRutSucursal().equals(rutBuscada)){
                return sucursales.get(i);
            }
        }
        return null;
    }
    
    public Sucursal buscarSucursal(Sucursal buscada){
        for(int i = 0; i < tamano(); i++){
            if(sucursales.get(i).equals(buscada)){
                return sucursales.get(i);
            }
        }
        return null;
    }
    
    public boolean agregarSucursal(Sucursal nuevaSucursal){
        if(buscarSucursal(nuevaSucursal) != null){
            return false;
        }
        else{
            sucursales.add(nuevaSucursal);
            return true;
        }
    }
    
    public int indice(Sucursal buscado) {						//Metodo para retornar el indice del array
        if(estaVacio()) {										//Si la lista esta vacia retorna un valor fuera del vector
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
        if(estaVacio()) {										//Si la lista esta vacia retorna un valor fuera del vector
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
    
    public boolean eliminarSucursal(String rutSucursal){
        Sucursal buscado = buscarSucursal(rutSucursal);
        if(buscado == null){
            return false;
        }
        else{
            if(sucursales.get(tamano()-1).equals(buscado)){	//En caso de encontrarlo lo elimina y retorna true
                    sucursales.remove(buscado);
                    return true;
                }
                else {
                    for(int i = indice(buscado)+1; i < tamano(); i++) {
                        this.sucursales.get(i).setID(sucursales.get(i).getID()-1);
                    }
                    sucursales.remove(buscado);
                    return true;
                }
        }
    }
    
}

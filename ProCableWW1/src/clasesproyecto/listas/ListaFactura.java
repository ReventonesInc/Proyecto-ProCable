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
    
//-------------------------------------- Constructor ------------------------------------------------//    
    
    public ListaFactura(){
        this.facturas = new ArrayList<Factura>();
    }
    
//-------------------------------------- Getter y setters ------------------------------------------------//
    
    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }    
    
//-------------------------------------- Metodos ------------------------------------------------//    
    
    public boolean estaVacio() {                                                //Reemplazo para el metodo isEmpty
        return facturas.isEmpty();
    }
    
    public int tamano(){                                                        //Reemplazo para el metodo size
        return facturas.size();
    }
    
    public int indice(int idFactura){                                           //Metodo para calcular el indice en base a un id
        if(estaVacio()){                                                        //Si la lista esta vacia retorna un valor "nulo"
            return -1;
        }
        else{                                                                   //Sino, recorre y entrega el la posicion en donde haya coincidencia de de id
            for(int i = 0; i < tamano(); i++){
                if(facturas.get(i).getIdFactura() == idFactura){
                    return i;
                }
            }
            return -1;                                                          //En caso de no encontrarla, entrega un valor "nulo"
        }
    }
    
    public Factura buscarFactura (int idFactura){                               //Metodo que busca una factura en base a un id
        if(estaVacio()){                                                        //Si la lista esta vacia retorna nulo
            return null;
        }
        else{                                                                   //De otro modo, busca la factura y en caso de encontrarla la retorna
            for(int i = 0; i < tamano(); i++){
                if(facturas.get(i).getIdFactura() == idFactura){
                    return facturas.get(i);
                }
            }
        }
        return null;                                                            //Si no la encuentra retorna null;
    }
    
    public ArrayList<Factura> buscarFacturasCliente (String rutCliente){                //Funcionalidad propia, que busca las facturas de un cliente en base a un rut
        
        ArrayList<Factura> facturasCliente = new ArrayList<Factura>();
        
        if(estaVacio()){                                                                //Si esta vacia la lista, retorna nulo
            return null;
        }
        else{                                                                           //De otro modo, busca la factura en el la lista
            for(int i = 0; i < tamano(); i++){
                if(facturas.get(i).getClienteAbonante().getRut().equals(rutCliente)){   //Comprueba coincidencias de rut del cliente
                    facturasCliente.add(facturas.get(i));                               //Añade la factura en el ArrayList
                }
            }
        }
        return facturasCliente;                                                         //Retorna el ArrayList con las facturas del cliente
    }
    
    public boolean agregarFactura (Factura nuevaFactura){                       //Metodo para agregar una factura a la lista
        if(estaVacio()){                                                        //Si la lista esta vacia se agrega la factura nueva y retorna true
            facturas.add(nuevaFactura);
            return true;
        }
        else {                                                                  //En caso contrario, se busca en la lista la factura a agregar
            if(buscarFactura(nuevaFactura.getIdFactura()) != null){
                return false;                                                   //Si la encuentra retorna false, porque la factura ya esta en la lista
            }
            else{                                                               //Sino, se agrega la factura a la lista y retorna true
                facturas.add(nuevaFactura);
                return true;
            }
        }
    }
    
    public float totalIngresosMes (){                                           //Funcionalidad propia, metodo que retorna el valor de ingresos totales en un mes
        float total = 0;
        for(int i = 0; i < tamano(); i++){                                      //Recorre la lista y suma los pagos de las facturas
            total += facturas.get(i).getMontoPagado();
        }        
        return total;                                                           //Retorna el valor de la suma de todos estos pagos
    }
    
    public boolean eliminarFactura (int idFactura){                             //Metodo para eliminar una factura en base a su id
        Factura buscado = buscarFactura(idFactura);                             //Variable que almacena la factura a eliminar
        if (buscado != null){                                                   //Si se encuentra, se elimina y retorna true
            facturas.remove(buscado);
            return true;
        }
        else{                                                                   //En caso de no encontrarla, se retorna false
            return false;
        }
    }
}
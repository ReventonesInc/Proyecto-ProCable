package clasesproyecto.listas;

import java.util.*;

import clasesproyecto.Cliente;

public class ListaCliente {
	
    private ArrayList<Cliente> clientes;
	
    //-------------------------------------- Constructor ------------------------------------------------//
    
    public ListaCliente() {
        this.clientes = new ArrayList<Cliente>();
    }	
	
    //---------------------------------------Setters y getters ------------------------------------------//
	
    public ArrayList<Cliente> getClientes() {	
        return clientes;
    }
	
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    //--------------------------------------- M�todos-----------------------------------------------------//
	
    public boolean estaVacio() {								//Reemplazo para el metodo isEmpty
        return clientes.isEmpty();
    }
	
    public int tamano() {										//Reemplazo para el metodo size
        return clientes.size();
    }
	
    public int indice(Cliente buscado) {						//Metodo para retornar el indice del array
        if(estaVacio()) {										//Si la lista esta vacia retorna un valor fuera del vector
            return -1;									
        }
        else {								
            for(int i = 0; i < tamano(); i++) {					//Sino se busca el cleinte y se retorna su posicion	
                if(clientes.get(i).equals(buscado)) {
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
                if(clientes.get(i).getRut().equals(rut)){
                    return i;
		}
            }
            return -1;									
        }
    }
        
    public Cliente buscarCliente(Cliente buscado) {				//Metodo para buscar un cliente en la lista
        if(estaVacio()) {										//Si la lista esta vacia
            return null;										//No se encuentra ningun cliente y retorna null
        }
        else {													//Sino, la lista no esta vacia y hay que recorrerla
            for(int i = 0; i < tamano(); i++) {					//Ciclo que recorrera la ArrayList
                if(clientes.get(i).equals(buscado)) {			//Busca el cliente y si lo encuentra lo retorna
                    return clientes.get(i);
            	}
            }
            return null;										//En caso contrario, ya que no lo encuentra retorna null
        }
    }
	
    public Cliente buscarCliente(String rutCliente) {			//Metodo para buscar un cliente en la lista usando su rut
        if(estaVacio()) {										//Si la lista esta vacia
            return null;										//No se encuentra ningun rut que coincida y retorna null
        }
        else {													//Sino, la lista no esta vacia y hay que recorrela
            for(int i = 0; i < tamano(); i++) {
                if(clientes.get(i).getRut().equals(rutCliente)) {	//Busca el rut en el ArrayList esperando una coincidencia
                    return clientes.get(i);							//Si lo encuentra, retorna el cliente con dicho rut
                }
            }
            return null;										//En caso contrario retorna null, ya que no encontro el rut
        }
    }
	
    public boolean agregarCliente(Cliente nuevoCliente) {
        if(estaVacio()) {										//Si la lista esta vacia
            clientes.add(nuevoCliente);							//Agrega el cliente al final
            return true;
        }
        else {													//Si no esta vacia
            if(buscarCliente(nuevoCliente)!=null) {				//Busca el cliente
                return false;									//Si lo encuentra retorna false
            }
            else {												//Si lo encuentra
                clientes.add(nuevoCliente);					//Lo agrega al final
                return true;
            }
        }
    }
	
    public boolean eliminarCliente (String rutCliente) {		//Metodo para eliminar un cliente de la lista
        if(estaVacio()) {										//Si la lista no esta vacia, retorna false
            return false;
        }
        else {
            Cliente buscado = buscarCliente(rutCliente);		//En caso contrario, se busca el cliente
            if(buscado == null) {								//Si no se encuentra, retorna false
                return false;
            }
            else {
                if(clientes.get(tamano()-1).equals(buscado)){	//En caso de encontrarlo lo elimina y retorna true
                    clientes.remove(buscado);
                    return true;
                }
                else {
                    for(int i = indice(buscado)+1; i < tamano(); i++) {
                        this.clientes.get(i).setID(clientes.get(i).getID()-1);
                    }
                    clientes.remove(buscado);
                    return true;
                }
            }
        }
    }
    
    public void modificarCliente(String rutCliente, Cliente modificado){
        int i = indice(rutCliente);
        clientes.get(i).setNombre(modificado.getNombre());
        clientes.get(i).setApellido(modificado.getApellido());
        clientes.get(i).setCorreoElectronico(modificado.getCorreoElectronico());
        clientes.get(i).setRut(modificado.getRut());
        clientes.get(i).setTelefono(modificado.getTelefono());
    }
    
    public void mostrarCliente(){
        
        for (int i = 0; i < clientes.size(); i++){
            System.out.println("Datos: "+ clientes.get(i).getNombre());
            System.out.println("Datos: "+ clientes.get(i).getApellido());
            System.out.println("Datos: "+ clientes.get(i).getRut());
            System.out.println("Datos: "+ clientes.get(i).getTelefono());
            System.out.println("Datos: "+ clientes.get(i).getCorreoElectronico());
        }
    }
    
    public Cliente clienteMasEndeudado(){
        for(int i = 0; i < tamano(); i++){
            
        }
    }
    
    //Javier culiao chupala <3<3<3<3
    
    
//OJOOO RECORDAR QUE LOS CLIENTES NO PUEDEN SER AÑADIDOS SI NO HAY PLANESSSS
}
//---------------------------------------------------------------------------------------------------//
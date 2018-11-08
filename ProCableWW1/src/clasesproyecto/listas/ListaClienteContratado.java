package clasesproyecto.listas;

import java.util.ArrayList;

import clasesproyecto.Cliente;

public class ListaClienteContratado {
    
    private ArrayList<Cliente> clientesContratados;	
    
//--------------------------------------Constructor--------------------------//
    public ListaClienteContratado() {
	this.clientesContratados = new ArrayList<Cliente>();
    }
		
//-------------------------------------- Setters y getters-------------------//
	
    public ArrayList<Cliente> getClientesContratados() {
	return clientesContratados;
    }
	
    public void setClientes(ArrayList<Cliente> clientesContratados) {
	this.clientesContratados = clientesContratados;
    }
	
//-------------------------------------- M�todos ----------------------------//
	
    public boolean estaVacio() {
        return clientesContratados.isEmpty();
    }
    
    public int tamano() {
	return clientesContratados.size();
    }
	
    public int indice(Cliente buscado) {
        if(estaVacio()) {						
            return -1;									
	}
	else {								
            for(int i = 0; i < tamano(); i++) {	
		if(clientesContratados.get(i).equals(buscado)) {
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
                if(clientesContratados.get(i).getRut().equals(rut)){
                    return i;
		}
            }
            return -1;									
        }
    }
    
    public Cliente buscarClienteContratado(Cliente buscado) {					//Metodo de busqueda de cliente
	if(estaVacio()) {														//Si no se encuentra retorn null														
            return null;
         }
        else {
            for(int i = 0; i < tamano(); i++) {									//Sino, se busca y retorna el cliente
                if(clientesContratados.get(i).equals(buscado)) {
                    return clientesContratados.get(i);
		}
            }
            return null;
	}
    }
	
    public Cliente buscarClienteContratado(String rutClienteContratado) {				//Metodo de busqueda de cliente con string
	if(estaVacio()) {																//Si la lista esta vacia retorna null
            return null;
	}
	else {
            for(int i = 0; i < tamano(); i++) {											//Sino, busca el cliente y lo retorna
                if(clientesContratados.get(i).getRut().equals(rutClienteContratado)) {
                    return clientesContratados.get(i);
		}
            }
            return null;
	}
    }
	
    public boolean agregarClienteContratado(Cliente nuevoClienteContratado) {			//Metodo para agregar cliente
	if(estaVacio()) {
            clientesContratados.add(nuevoClienteContratado);							//Si esta vacia lo agrera y retorna true
            return true;
        }
	else {																			//Sino, busca el cliente
            if(buscarClienteContratado(nuevoClienteContratado) != null) {				//Si no lo encuentra retorna false
		return false;
            }
            else {																		//En caso contrario lo agrega y retorna true
		clientesContratados.add(nuevoClienteContratado);
		return true;
            }
	}
    }
	
    public boolean eliminarClienteContratado(String rutClienteContratado) {
        Cliente buscado = buscarClienteContratado(rutClienteContratado);
        if(buscado == null) {
            return false;
        }
        else {
            if(clientesContratados.get(tamano()-1).equals(buscado)){
                clientesContratados.remove(buscado);
                return true;
            }
            else {
                for(int i = indice(buscado)+1; i < tamano(); i++) {
                    this.clientesContratados.get(i).setID(clientesContratados.get(i).getID()-1);
                }
                clientesContratados.remove(buscado);
                return true;
            }
        }
    }
    
    public void modificarCliente(String rutCliente, Cliente modificado){
        int i = indice(rutCliente);
        clientesContratados.get(i).setNombre(modificado.getNombre());
        clientesContratados.get(i).setApellido(modificado.getApellido());
        clientesContratados.get(i).setCorreoElectronico(modificado.getCorreoElectronico());
        clientesContratados.get(i).setRut(modificado.getRut());
        clientesContratados.get(i).setTelefono(modificado.getTelefono());
    }
}

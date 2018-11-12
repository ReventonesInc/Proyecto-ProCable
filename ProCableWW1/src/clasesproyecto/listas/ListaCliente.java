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
    
//--------------------------------------- Metodos-----------------------------------------------------//
	
    public boolean estaVacio() {						//Reemplazo para el metodo isEmpty
        return clientes.isEmpty();
    }
	
    public int tamano() {							//Reemplazo para el metodo size
        return clientes.size();
    }
	
    public int indice(Cliente buscado) {					//Metodo para retornar el indice del array
        if(estaVacio()) {							//Si la lista esta vacia retorna un valor fuera del vector
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
        if(estaVacio()) {							//Si la lista esta vacia retorna un valor fuera del vector
            return -1;									
        }
        else {								
            for(int i = 0; i < tamano(); i++) {					//Sino se busca el cliente y se retorna su posicion	
                if(clientes.get(i).getRut().equals(rut)){
                    return i;
		}
            }
            return -1;									
        }
    }
        
    public Cliente buscarCliente(Cliente buscado) {				//Metodo para buscar un cliente en la lista
        if(estaVacio()) {							//Si la lista esta vacia
            return null;							//No se encuentra ningun cliente y retorna null
        }
        else {									//Sino, la lista no esta vacia y hay que recorrerla
            for(int i = 0; i < tamano(); i++) {					//Ciclo que recorrera la ArrayList
                if(clientes.get(i).equals(buscado)) {                           //Busca el cliente y si lo encuentra lo retorna
                    return clientes.get(i);
            	}
            }
            return null;							//En caso contrario, ya que no lo encuentra retorna null
        }
    }
	
    public Cliente buscarCliente(String rutCliente) {                           //Metodo para buscar un cliente en la lista usando su rut
        if(estaVacio()) {							//Si la lista esta vacia
            return null;							//No se encuentra ningun rut que coincida y retorna null
        }
        else {									//Sino, la lista no esta vacia y hay que recorrela
            for(int i = 0; i < tamano(); i++) {
                if(clientes.get(i).getRut().equals(rutCliente)) {               //Busca el rut en el ArrayList esperando una coincidencia
                    return clientes.get(i);					//Si lo encuentra, retorna el cliente con dicho rut
                }
            }
            return null;							//En caso contrario retorna null, ya que no encontro el rut
        }
    }
    
    public boolean buscarClienteMenu(String rutCliente){
        if(estaVacio()) {							//Si la lista esta vacia
            return false;							//No se encuentra ningun rut que coincida y retorna null
        }
        else {									//Sino, la lista no esta vacia y hay que recorrela
            for(int i = 0; i < tamano(); i++) {
                if(clientes.get(i).getRut().equals(rutCliente)) {               //Busca el rut en el ArrayList esperando una coincidencia
                    return true;						//Si lo encuentra, retorna el cliente con dicho rut
                }
            }
            return false;							//En caso contrario retorna null, ya que no encontro el rut
        }
    }
    
    public boolean agregarCliente(Cliente nuevoCliente) {
        if(estaVacio()) {							//Si la lista esta vacia
            clientes.add(nuevoCliente);						//Agrega el cliente al final
            return true;
        }
        else {									//Si no esta vacia
            if(buscarCliente(nuevoCliente)!=null) {				//Busca el cliente
                return false;							//Si lo encuentra retorna false
            }
            else {								//Si lo encuentra
                clientes.add(nuevoCliente);					//Lo agrega al final
                return true;
            }
        }
    }
	
    public boolean eliminarCliente (String rutCliente) {                        //Metodo para eliminar un cliente de la lista
    Cliente buscado = buscarCliente(rutCliente);                                //Se busca el cliente   
        if(buscado == null) {							//Si no se encuentra, retorna false
            return false;
        }
        else {
            if(clientes.get(tamano()-1).equals(buscado)){                       //En caso de encontrarlo lo elimina y retorna true
                clientes.remove(buscado);
                return true;
            }
            else {                                                              //Sino, se actualiza el id del cliente
                for(int i = indice(buscado)+1; i < tamano(); i++) {
                    this.clientes.get(i).setID(clientes.get(i).getID()-1);
                }
                clientes.remove(buscado);
                return true;
            }
        }
    }
    
    public void modificarCliente(String rutCliente, Cliente modificado){            //Metodo que modifica los datos de un cliente
        int i = indice(rutCliente);
        clientes.get(i).setNombre(modificado.getNombre());
        clientes.get(i).setApellido(modificado.getApellido());
        clientes.get(i).setCorreoElectronico(modificado.getCorreoElectronico());
        clientes.get(i).setRut(modificado.getRut());
        clientes.get(i).setTelefono(modificado.getTelefono());
        clientes.get(i).setPlanContratado(modificado.getPlanContratado());
    }
    
    public void mostrarCliente(){                                                   //Metodo que muestra los datos de un cliente
        for (int i = 0; i < clientes.size(); i++){
            System.out.println("Datos: "+ clientes.get(i).getNombre());
            System.out.println("Datos: "+ clientes.get(i).getApellido());
            System.out.println("Datos: "+ clientes.get(i).getRut());
            System.out.println("Datos: "+ clientes.get(i).getTelefono());
            System.out.println("Datos: "+ clientes.get(i).getCorreoElectronico());
            System.out.println("Datos: "+ clientes.get(i).getPlanContratado());
        }
    }
    /*
    public Cliente clienteMasEndeudado(){
        for(int i = 0; i < tamano(); i++){
            
        }
    }
    */

    /*------------------------------------------------------------------------*/
    /* Métodos temporales para el uso de la interfaz grafica del proyecto
     * ProCable sin base de datos. La interfaz grafica 
     * está en la carpeta "ventanas".
     */
    
    public String obtenerNombre (String rut){                                       //Método para obtener el nombre del cliente según el rut ingresado
        for(int i = 0; i < tamano(); i++){                                          //Se recorre la lista y compara el rut del cliente con la que fue
            if(clientes.get(i).getRut().equals(rut)) {                              //recibida por parametro
                return clientes.get(i).getNombre();                                 //Retorna el nombre del cliente
            }
        }
        return null;
    }
    
    public String obtenerApellido (String rut){                                     //Método para obtener el apellido del cliente según el rut ingresado
        for(int i = 0; i < tamano(); i++){                                          //Se recorre la lista y compara el rut del cliente con la que fue
            if(clientes.get(i).getRut().equals(rut)) {                              //recibida por parametro
                return clientes.get(i).getApellido();                               //Retorna el apellido del cliente
            }
        }
        return null;
    }
    
    public String obtenerRut (String rut){                                          //Método para obtener el RUT del cliente según el rut ingresado
        for(int i = 0; i < tamano(); i++){                                          //Se recorre la lista y compara el rut del cliente con la que fue
            if(clientes.get(i).getRut().equals(rut)) {                              //recibida por parametro
                return clientes.get(i).getRut();                                    //Retorna el rut del cliente
            }
        }
        return null;
    }
    
    public String obtenerMail (String rut){                                         //Método para obtener el correo electronico del cliente según el rut ingresado
        for(int i = 0; i < tamano(); i++){                                          //Se recorre la lista y compara el rut del cliente con la que fue
            if(clientes.get(i).getRut().equals(rut)) {                              //recibida por parametro
                return clientes.get(i).getCorreoElectronico();                      //Retorna el correo electronico del cliente
            }
        }
        return null;
    }
    
    public String obtenerTelefono (String rut){                                     //Método para obtener el telefono del cliente según el rut ingresado
        for(int i = 0; i < tamano(); i++){                                          //Se recorre la lista y compara el rut del cliente con la que fue
            if(clientes.get(i).getRut().equals(rut)) {                              //recibida por parametro
                return clientes.get(i).getTelefono();                               //Retorna el telefono del cliente
            }
        }
        return null;
    }
    
    public String obtenerPlanContratado (String rut){                               //Método para obtener el plan contratado del cliente según el rut ingresado
        for(int i = 0; i < tamano(); i++){                                          //Se recorre la lista y compara el rut del cliente con la que fue
            if(clientes.get(i).getRut().equals(rut)) {                              //recibida por parametro
                return clientes.get(i).getPlanContratado();                         //Retorna el plan contratado del cliente
            }
        }
        return null;
    }
}
//---------------------------------------------------------------------------------------------------//

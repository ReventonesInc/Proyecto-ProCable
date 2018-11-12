package clasesproyecto.listas;

import java.util.*;

import clasesproyecto.Plan;

public class ListaPlan {
	
    private ArrayList<Plan> planes;
	
//---------------------- Constructor ----------------------------------------------//
    
    public ListaPlan() {
        this.planes =  new ArrayList<Plan>();
    }
	
//----------------------- Getters y setters ----------------------------------------//
	
    public ArrayList<Plan> getPlanes() {
	return planes;
    }
	
    public void setPlanes(ArrayList<Plan> nuevosPlanes) {
        this.planes = nuevosPlanes;
    }
    
//----------------------------- Metodos ----------------------------------------------//
    
    public int tamano() {
        return planes.size();
    }
	
    public boolean estaVacio() {
        return planes.isEmpty();
    }
	
    public int indice(Plan buscado) {                                           //Metodo que retoran el indice donde se encuentra un plan
	if(estaVacio()) {                                                       //Si la lista esta vacia se retorna un valor fuera del vector
            return -1;									
	}
	else {                                                                  //Sino, se busca el plan, si se encuentra se retorna el indice
            for(int i = 0; i < tamano(); i++) {	
		if(planes.get(i).equals(buscado)) {
                    return i;
		}
            }
            return -1;                                                          //En caso de no encontrarlo se retorna un valor fuera del vector
	}
    }
    
    public int indice(String nombre){
        if(estaVacio()) {						
            return -1;									
	}
	else {								
            for(int i = 0; i < tamano(); i++) {	
		if(planes.get(i).getNombrePlan().equals(nombre)) {
                    return i;
		}
            }
            return -1;									
	}
    }
	
	
    public Plan buscarPlan(Plan buscado) {				//Metodo para buscar un plan
        if(estaVacio()) {						//Si la lista esta vacia retorna null
            return null;
	}
        else {                                                          //Si lo encuentra, retorna el plan encontrado
            for(int i = 0; i < tamano(); i++) {
		if(planes.get(i).equals(buscado)) {
                    return planes.get(i);
		}
            }
            return null;                                                //En caso de no encontrarlo retorna null
	}
    }
	
    public Plan buscarPlan(String nombrePlan) {                             //Metodo busqueda de plan con string
	if(estaVacio()) {                                                   //Si la lista esta vacia, retorna null
            return null;
	}
	else {                                                              //Sino, retorna el plan en caso de encontrarlo
            for(int i = 0; i < tamano(); i++) {
                if(planes.get(i).getNombrePlan().equals(nombrePlan)) {
                    return planes.get(i);
		}
            }
            return null;                                                    //En caso de no encontrarlo retorna null
        }
    }
    
    public boolean buscarPlanMenu(String nombrePlan){                           //Metodo para buscar un plan en el menu segun su el nombre del plan
        if(estaVacio()) {							//Si la lista esta vacia retorna false
            return false;
	}
	else {                                                                  //Se busca el plan y en caso de encontralo se retorna true
            for(int i = 0; i < tamano(); i++) {
                if(planes.get(i).getNombrePlan().equals(nombrePlan)) {
                    return true;
		}
            }
            return false;                                                       //Sino se encuentra se retorna false
        }
    }
	
    public boolean agregarPlan(Plan nuevoPlan) {                    //Metodo para agregar planes
        if(estaVacio()) {                                           //Si la lista esta vacia, lo agrega y retorna true
            planes.add(nuevoPlan);
            return true;
	}
	else {                                                      //Sino, se busca el plan
            if(buscarPlan(nuevoPlan.getNombrePlan())!=null) {       //En caso de encontrar el plan, no lo agrega y retorna false
		return false;
            }
            else {                                                  //En caso contrario, se agrega el plan y retorna true
                planes.add(nuevoPlan);
                return true;
            }
	}
    }
	
    public boolean eliminarPlan(String nombrePlan) {                        //Metodo para eliminar planes, segun el nombre del plan
        Plan eliminar = buscarPlan(nombrePlan);                             //Variable que almacena el plan a eliminar
        if(eliminar == null) {                                              //Si la variable que almacena el plan es nula, retorna false. Es decir, no se encontro el plan
            return false;
        }
        else {                                                              //Sino, si el plan a eliminar esta en ultima posicion
            if(planes.get(tamano()-1).equals(eliminar)){                    //Se elimina el plan y retorna true
                planes.remove(eliminar);
                return true;
            }
	    else {                                                          //Sino, se modifican los id de los planes hacia la derecha restandole 1 a su id
                for(int i = indice(eliminar)+1; i < tamano()-1; i++) {      //desde la posicion del plan a eliminar hasta el final del vector
                    this.planes.get(i).setID(planes.get(i).getID()-1);
                }
                planes.remove(eliminar);                                    //Luego se elimina el plan y retorna true
                return true;
            }
        }
    }
    
    public void modificarPlan(String nombrePlan, Plan modificado){          //Metodo void que modifica el plan segun el nombre del plan y el nuevo plan
        int i = indice(nombrePlan);                                         //Se ubica el indice
        planes.get(i).setNombrePlan(modificado.getNombrePlan());            
        planes.get(i).setValorPlan(modificado.getValorPlan());              //Modificar los datos con los actuales
        planes.get(i).setCantCanales(modificado.getCantCanales());
    }
    
    public void mostrarPlan(){                                                          //Método para mostrar los planes registrados por consola
        for(int i = 0; i < tamano(); i++){                                              //Se recorre la lista y se imprime los datos que poseen cada plan
            System.out.println("Nombre: "+ planes.get(i).getNombrePlan());
            System.out.println("Valor: "+ planes.get(i).getValorPlan());
            System.out.println("Cantidad Canales: "+ planes.get(i).getCantCanales());
            System.out.println("Cantidad Clientes contratado: "+planes.get(i).getCantVentas());
            System.out.println("____________________________________________");
        }
    }
    
    public void aumentarVentaPlan(String nombre){
        for(int i = 0; i < tamano(); i++){
            if(planes.get(i).getNombrePlan().equals(nombre)){
                planes.get(i).setCantVentas(planes.get(i).getCantVentas() + 1);
            }
        }
    }
    
    public void eliminarVentaPlan(String nombre){
        for(int i = 0; i < tamano(); i++){
            if(planes.get(i).getNombrePlan().equals(nombre)){
                planes.get(i).setCantVentas(planes.get(i).getCantVentas() - 1);
            }
        }
    }
    
    public String calcularMayorVenta(){
        int pivote = 0;
        String planMayorVenta = null;
        
        for(int i = 0; i < tamano(); i++){
            if(pivote < planes.get(i).getCantVentas()){
                pivote = planes.get(i).getCantVentas();
                planMayorVenta = planes.get(i).getNombrePlan();
            }
        }
        return planMayorVenta;
    }
    
//-----------------------------------------------------------------------------------
/* Métodos temporales para el uso de la interfaz grafica del proyecto
 * ProCable sin base de datos. La interfaz grafica 
 * está en la carpeta "ventanas".
 */
    
    public String obtenerNombrePlan (String nombrePlan){                            //Método para obtener el nombre del plan según el nombre que se desea buscar
        for(int i = 0; i < tamano(); i++){                                          //Se recorre la lista y compara el nombre del plan con la que fue
            if(planes.get(i).getNombrePlan().equals(nombrePlan)) {                  //recibida por parametro
                return planes.get(i).getNombrePlan();                               //Retorna el nombre del plan
            }
        }
        return null;
    }
    
    public float obtenerValor (String nombrePlan){                                  //Método para obtener el valor o precio del plan según el nombre
        for(int i = 0; i < tamano(); i++){                                          //Se recorre la lista y compara el nombre del plan con la que fue
            if(planes.get(i).getNombrePlan().equals(nombrePlan)){                   //recibida por parametro
                return planes.get(i).getValorPlan();                                //Retorna el valor del plan
            }
        }
        return 0;
    }
    
    public int obtenerCantidadCanales (String nombrePlan){                          //Método para obtener la cantidad de canales que posee el plan según el nombre
        for(int i = 0; i < tamano(); i++){                                          //Se recorre la lista y compara el nombre del plan con la que fue
            if(planes.get(i).getNombrePlan().equals(nombrePlan)){                   //recibida por parametro
                return planes.get(i).getCantCanales();                              //Retorna la cantidad de canales del plan
            }
        }
        return 0;
    }
}

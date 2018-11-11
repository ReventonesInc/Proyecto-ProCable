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
	
    public int indice(Plan buscado) {
	if(estaVacio()) {						
            return -1;									
	}
	else {								
            for(int i = 0; i < tamano(); i++) {	
		if(planes.get(i).equals(buscado)) {
                    return i;
		}
            }
            return -1;									
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
	
	
    public Plan buscarPlan(Plan buscado) {				//Metodo busqueda del plan, retorna null si esta vacia o no lo encuentra
        if(estaVacio()) {								//Y el plan, en caso de encontrarlo
            return null;
	}
        else {
            for(int i = 0; i < tamano(); i++) {
		if(planes.get(i).equals(buscado)) {
                    return planes.get(i);
		}
            }
            return null;
	}
    }
	
    public Plan buscarPlan(String nombrePlan) {			//Metodo busqueda de plan con string, retorna null si no lo encuentra o esta vacia
	if(estaVacio()) {								//Sino, retorna el plan en caso de encontrarlo
            return null;
	}
	else {
            for(int i = 0; i < tamano(); i++) {
                if(planes.get(i).getNombrePlan().equals(nombrePlan)) {
                    return planes.get(i);
		}
            }
            return null;
        }
    }
    
    public boolean buscarPlanMenu(String nombrePlan){
        if(estaVacio()) {								//Sino, retorna el plan en caso de encontrarlo
            return false;
	}
	else {
            for(int i = 0; i < tamano(); i++) {
                if(planes.get(i).getNombrePlan().equals(nombrePlan)) {
                    return true;
		}
            }
            return false;
        }
    }
	
    public boolean agregarPlan(Plan nuevoPlan) {		//Metodo para agregar planes, agrega el plan en caso de estar vacia o si no esta el plan
        if(estaVacio()) {								//En caso de encontrar el plan, no lo agrega y retorna false
            planes.add(nuevoPlan);
            return true;
	}
	else {
            if(buscarPlan(nuevoPlan.getNombrePlan())!=null) {
		return false;
            }
            else {
                planes.add(nuevoPlan);
                return true;
            }
	}
    }
	
    public boolean eliminarPlan(String nombrePlan) {	//Metodo para eliminar planes, si no lo encuentra retorna false
        Plan eliminar = buscarPlan(nombrePlan);
        if(eliminar == null) {
            return false;
        }
        else {
            if(planes.get(tamano()-1).equals(eliminar)){
                planes.remove(eliminar);
                return true;
            }
	    else {
                for(int i = indice(eliminar)+1; i < tamano()-1; i++) {
                    this.planes.get(i).setID(planes.get(i).getID()-1);
                }
                planes.remove(eliminar);
                return true;
            }
        }
    }
    
    public void modificarPlan(String nombrePlan, Plan modificado){
        int i = indice(nombrePlan);
        planes.get(i).setNombrePlan(modificado.getNombrePlan());
        planes.get(i).setValorPlan(modificado.getValorPlan());
        planes.get(i).setCantCanales(modificado.getCantCanales());
    }
    
    public void mostrarPlan(){                                                          //Método para mostrar los planes registrados por consola
        for(int i = 0; i < tamano(); i++){                                              //Se recorre la lista y se imprime los datos que poseen cada plan
            System.out.println("Nombre: "+ planes.get(i).getNombrePlan());
            System.out.println("Valor: "+ planes.get(i).getValorPlan());
            System.out.println("Cantidad Canales: "+ planes.get(i).getCantCanales());
            System.out.println("____________________________________________");
        }
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

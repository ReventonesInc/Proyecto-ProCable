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
        if(estaVacio()) {								//Y si lo encuentra lo elimina y retorna true
            return false;
        }
	else {
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
    }
}

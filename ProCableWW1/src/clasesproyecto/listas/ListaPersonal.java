package clasesproyecto.listas;

import java.util.*;

import clasesproyecto.Personal;

public final class ListaPersonal {
	
    private ArrayList<Personal> personal;
	
    //-------------------------------------- Constructor ------------------------------------------------//
    
    public ListaPersonal() {
        this.personal = new ArrayList<Personal>();
    }
	
    //-------------------------------------- Getters y setters ------------------------------------------//
	
    public ArrayList<Personal> getPersonal() {
        return personal;
    }

    public void setPersonal(ArrayList<Personal> personal) {
        this.personal = personal;
    }
	
    //--------------------------------------- M�todos  -------------------------------------------------//
	
    public boolean estaVacio() {								//Reemplazo para el metodo isEmpty
        return personal.isEmpty();
    }
	
    public int tamano() {										//Reemplazo para el metodo size
        return personal.size();
    }
	
    public Personal buscarPersonal(Personal buscado) {				//Metodo para buscar un Personal en la lista
        if(estaVacio()) {										//Si la lista esta vacia
            return null;										//No se encuentra ningun Personal y retorna null
        }
        else {													//Sino, la lista no esta vacia y hay que recorrerla
            for(int i = 0; i < tamano(); i++) {					//Ciclo que recorrera la ArrayList
                if(personal.get(i).equals(buscado)) {			//Busca el Personal y si lo encuentra lo retorna
                    return personal.get(i);
                }
            }
            return null;										//En caso contrario, ya que no lo encuentra retorna null
        }
    }
	
    public Personal buscarPersonal(String rutPersonal) {			//Metodo para buscar un Personal en la lista usando su rut
        if(estaVacio()) {										//Si la lista esta vacia
            return null;										//No se encuentra ningun rut que coincida y retorna null
        }
        else {													//Sino, la lista no esta vacia y hay que recorrela
            for(int i = 0; i < tamano(); i++) {
                if(personal.get(i).getRut().equals(rutPersonal)) {	//Busca el rut en el ArrayList esperando una coincidencia
                    return personal.get(i);							//Si lo encuentra, retorna el Personal con dicho rut
                }
            }
            return null;										//En caso contrario retorna null, ya que no encontro el rut
        }
    }
    
    public Boolean buscarPersonalMenu(String rutPersonal) {			//Metodo para buscar un Personal en la lista usando su rut (Se utiliza en en la VentanaRut)
        if(estaVacio()) {										//Si la lista esta vacia
            return false;										//No se encuentra ningun rut que coincida y retorna false
        }
        else {													//Sino, la lista no esta vacia y hay que recorrela
            for(int i = 0; i < tamano(); i++) {
                if(personal.get(i).getRut().equals(rutPersonal)) {	//Busca el rut en el ArrayList esperando una coincidencia
                    return true;                                                                //Si lo encuentra, retorna el true
                }                                                                                   
            }
            return false;                                                                               //En caso contrario retorna false
        }
    }
    
    public int indice(String rut) {						//Metodo para retornar el indice del array
        if(estaVacio()) {										//Si la lista esta vacia retorna un valor fuera del vector
            return -1;									
        }
        else {								
            for(int i = 0; i < tamano(); i++) {					//Sino se busca el cleinte y se retorna su posicion	
                if(personal.get(i).getRut().equals(rut)){
                    return i;
		}
            }
            return -1;									
        }
    }
	
    public int indice(Personal buscado) {
        if(estaVacio()) {						
            return -1;									
        }
        else {								
            for(int i = 0; i < tamano(); i++) {	
                if(personal.get(i).equals(buscado)) {
                    return i;
                }
            }
            return -1;									
        }
    }
	
    public boolean agregarPersonal(Personal nuevoPersonal) {
        if(estaVacio()) {										//Si la lista esta vacia
            personal.add(nuevoPersonal);							//Agrega el Personal al final
            return true;
        }
        else {													//Si no esta vacia
            if(buscarPersonal(nuevoPersonal)!=null) {				//Busca el Personal
            return false;									//Si lo encuentra retorna false
            }
            else {												//Si lo encuentra
                personal.add(nuevoPersonal);					//Lo agrega al final
                return true;
            }
        }
    }
	
    public boolean eliminarPersonal (String rutPersonal) {		//Metodo para eliminar un Personal de la lista
        if(estaVacio()) {										//Si la lista no esta vacia, retorna false
            return false;
        }
	else {
            Personal buscado = buscarPersonal(rutPersonal);		//En caso contrario, se busca el Personal
            if(buscado == null) {								//Si no se encuentra, retorna false
                return false;
            }
            else {
                if(personal.get(tamano()-1).equals(buscado)){
                    personal.remove(buscado);
                    return true;
                }
                else {
                    for(int i = indice(buscado)+1; i < tamano(); i++) {
                        this.personal.get(i).setID(personal.get(i).getID()-1);
                    }
                    personal.remove(buscado);
                    return true;
                }
            }
        }
    }
    
    public void modificarPersonal (String rutPersonal, Personal modificado){
        int i = indice(rutPersonal);
        personal.get(i).setNombre(modificado.getNombre());
        personal.get(i).setApellido(modificado.getApellido());
        personal.get(i).setCorreoElectronico(modificado.getCorreoElectronico());
        personal.get(i).setRut(modificado.getRut());
        personal.get(i).setPassword(modificado.getPassword());
    }

    public Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /*------------------------------------------------------------------------*/
    //Métodos temporales para el uso sin archivo para la interfaz
    
    public String obtenerNombre (String rut){
        for(int i = 0; i < tamano(); i++){
            if(personal.get(i).getRut().equals(rut)) {
                return personal.get(i).getNombre();
            }
        }
        return null;
    }
    
    public String obtenerApellido (String rut){
        for(int i = 0; i < tamano(); i++){
            if(personal.get(i).getRut().equals(rut)) {
                return personal.get(i).getApellido();
            }
        }
        return null;
    }
    
    public String obtenerRut (String rut){
        for(int i = 0; i < tamano(); i++){
            if(personal.get(i).getRut().equals(rut)) {
                return personal.get(i).getRut();
            }
        }
        return null;
    }
    
    public String obtenerMail (String rut){
        for(int i = 0; i < tamano(); i++){
            if(personal.get(i).getRut().equals(rut)) {
                return personal.get(i).getCorreoElectronico();
            }
        }
        return null;
    }
    
    public String obtenerPassword (String rut){
        for(int i = 0; i < tamano(); i++){
            if(personal.get(i).getRut().equals(rut)) {
                return personal.get(i).getPassword();
            }
        }
        return null;
    }
}

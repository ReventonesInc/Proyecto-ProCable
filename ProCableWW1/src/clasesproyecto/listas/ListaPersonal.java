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
        Personal buscado = buscarPersonal(rutPersonal);		//Se busca el Personal
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
    
    public void modificarPersonal (String rutPersonal, Personal modificado){        //Método para modificar un empledo según su rut antiguo
        int i = indice(rutPersonal);                                                //Primero se buscar la posición del empleado en lista personal con el método indice
        personal.get(i).setNombre(modificado.getNombre());                          /*Al encontrar la posición del empleado*/
        personal.get(i).setApellido(modificado.getApellido());                      /*se modifica los datos según lo que se*/
        personal.get(i).setCorreoElectronico(modificado.getCorreoElectronico());    /*envió por parametro*/
        personal.get(i).setRut(modificado.getRut());
        personal.get(i).setPassword(modificado.getPassword());
    }
    
    public void mostrarPersonal (){                                                 //Método para mostrar la lista personal por consola
        for(int i = 0; i < tamano(); i++){                                          //Se recorre la lista y se imprime los datos que contiene cada casilla
            System.out.println("Nombre: "+personal.get(i).getNombre());
            System.out.println("Apellido: "+personal.get(i).getApellido());
            System.out.println("Rut: "+personal.get(i).getRut());
            System.out.println("Mail: "+personal.get(i).getCorreoElectronico());
            System.out.println("Password: "+personal.get(i).getPassword());
            System.out.println("------------------------------------------");
        }
    }
    
    public boolean buscarPassword (String passwordBuscar){                          //Método para buscar la contraseña del empleado
        for(int i = 0; i < tamano(); i++){                                          //Se recorre la lista y compara la contraseña del empleado con la que fue
            if(personal.get(i).getPassword().equals(passwordBuscar)){               //recibida por parametro
                return true;
            }
        }
        return false;
    }
    
    public boolean buscarMail (String username){                                    //Método para buscar el mail del empleado
        for(int i = 0; i < tamano(); i++){                                          //Se recorre la lista y compara el mail del empleado con la que fue
            if(personal.get(i).getCorreoElectronico().equals(username)){            //recibida por parametro
                return true;
            }
        }
        return false;
    }
    
    /*------------------------------------------------------------------------*/
    /* Métodos temporales para el uso de la interfaz grafica del proyecto
     * ProCable sin base de datos. La interfaz grafica 
     * está en la carpeta "ventanas".
     */
    
    public String obtenerNombre (String rut){                                       //Método para obtener el nombre del empleado según el rut ingresado
        for(int i = 0; i < tamano(); i++){                                          //Se recorre la lista y compara el rut del empleado con la que fue
            if(personal.get(i).getRut().equals(rut)) {                              //recibida por parametro
                return personal.get(i).getNombre();                                 //Retorna el nombre del empleado
            }
        }
        return null;
    }
    
    public String obtenerApellido (String rut){                                     //Método para obtener el nombre del empleado según el rut ingresado
        for(int i = 0; i < tamano(); i++){                                          //Se recorre la lista y compara el rut del empleado con la que fue
            if(personal.get(i).getRut().equals(rut)) {                              //recibida por parametro
                return personal.get(i).getApellido();                               //Retorna el apellido del empleado
            }
        }
        return null;
    }
    
    public String obtenerRut (String rut){                                          //Método para obtener el nombre del empleado según el rut ingresado
        for(int i = 0; i < tamano(); i++){                                          //Se recorre la lista y compara el rut del empleado con la que fue
            if(personal.get(i).getRut().equals(rut)) {                              //recibida por parametro
                return personal.get(i).getRut();                                    //Retorna el rut del empleado
            }
        }
        return null;
    }
    
    public String obtenerMail (String rut){                                         //Método para obtener el nombre del empleado según el rut ingresado
        for(int i = 0; i < tamano(); i++){                                          //Se recorre la lista y compara el rut del empleado con la que fue
            if(personal.get(i).getRut().equals(rut)) {                              //recibida por parametro
                return personal.get(i).getCorreoElectronico();                      //Retorna el correo electronico del empleado
            }
        }
        return null;
    }
    
    public String obtenerPassword (String rut){                                     //Método para obtener el nombre del empleado según el rut ingresado
        for(int i = 0; i < tamano(); i++){                                          //Se recorre la lista y compara el rut del empleado con la que fue
            if(personal.get(i).getRut().equals(rut)) {                              //recibida por parametro
                return personal.get(i).getPassword();                               //Retorna la contraseña del empleado
            }
        }
        return null;
    }
}

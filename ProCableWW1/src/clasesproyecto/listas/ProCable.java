/**
 * Clase madre llamada ProCable, se encarga de llamar los métodos de las clases
 * de menor rango.
 * @author Carlos Ardila, Luis Maturana y Javier Ortiz
 */


package clasesproyecto.listas;

import clasesproyecto.*;

public class ProCable {
    public ListaPersonal personal;  //Lista que contiene los empleados
    public ListaCliente clientes;   //Lista que contiene los clientes suscritos
    public ListaPlan planes;        //Lista que contiene los planes
    
/**
 * Constructor de la clase ProCable
 * contiene la declaraciones de las listas personal, clientes, planes
 */
	
//---------------------------- Constructor -------------------------------------//
    public ProCable() {
    	this.personal = new ListaPersonal();
	this.clientes = new ListaCliente();
        this.planes = new ListaPlan();
    }
	
//---------------------------- Metodos -----------------------------------------//
	
    public boolean agregarCliente(String planContratado, String nombre, String apellido, String rut, String correoElectronico, String telefono) {          //Método para agregar un cliente según los datos entregados por parámetros
        if(clientes.estaVacio()) {
            return clientes.agregarCliente(new Cliente(1, planContratado, nombre, apellido, rut, correoElectronico, telefono));                     //Retorna un true si el cliente se agregó de forma correcta, si es el caso contrario retorna false
	}
	else {                                                                                                                      //Si el Arraylist esta no esta vacio, el cliente se agregará en la última casilla de éste.
            return clientes.agregarCliente(new Cliente(clientes.tamano(), planContratado, nombre, apellido, rut, correoElectronico, telefono));
        }
    }
	
    public boolean eliminarCliente(String rutCliente) {                                                                             //Método para eliminar un cliente según el rut
        return clientes.eliminarCliente(rutCliente);                                   
    }
    
    public void modificarCliente(String rutViejo, String planContratado, String nombre, String apellido, String rutNuevo, String correoElectronico, String telefono){                                   //Método para modificar un cliente según los datos entregados por parámetro
        clientes.modificarCliente(rutViejo,new Cliente(0, planContratado, nombre, apellido, rutNuevo, correoElectronico, telefono));                                                            //Se modifica el cliente en lista clientes y lista de clientes de contratados
    }    
    
    public boolean buscarCliente(String rut){
        return clientes.buscarClienteMenu(rut);
    }
    
    public void mostrarCliente(){                                                       //Método para mostrar todos los clientes por consola
        clientes.mostrarCliente();                                                      //Se imprime los datos de los clientes de forma ordenada.
    }
	
    public boolean agregarPlan(String nombre, int valorPlan, int cantCanales) {                         //Método para agregar un plan según los datos que se entregan por parámetro
	if(planes.estaVacio()) {                                                                        //Si el Arraylist de planes está vacio, el plan se agrega en la primera posición
            return planes.agregarPlan(new Plan(1, nombre, valorPlan, cantCanales));                     //En el caso contrario se agregará en la última posición
	}
	else {
            return planes.agregarPlan(new Plan(planes.tamano(), nombre, valorPlan, cantCanales));
	}
    }
	
    public boolean eliminarPlan(String nombrePlan) {                                    //Método para eliminar un plan según su nombre
        return planes.eliminarPlan(nombrePlan);                                         //Retorna true si el plan se elimina de forma exitosa, en el caso contrario
    }                                                                                   //retornará false

    public void mostrarPlanes(){                                                        //Método para mostrar todos los planes por consola
        planes.mostrarPlan();                                                           //Se imprime todos los datos de cada plan de forma ordenada
    }
    
    public boolean agregarPersonal(String nombre, String apellido, String rut, String correoElectronico, String password){              //Método para agregar un empleado según los datos entregados por parámetro
        if(personal.estaVacio()){                                                                                                       //Si el Arraylist de personal esta vacio, el empleado se agrega en la primera posición
            return personal.agregarPersonal(new Personal(1, nombre, apellido, rut, correoElectronico, password));                       //En el caso contrario, el empleado se agrega en la última posición
        }
        else{
            return personal.agregarPersonal(new Personal(personal.tamano(), nombre, apellido, rut, correoElectronico, password));
        }
    }
    
    public boolean eliminarPersonal(String rut){                                        //Método para eliminar un empleado según su rut
        return personal.eliminarPersonal(rut);                                          //Retorna true si el empleado se eliminó de forma exitosa, en el caso contrario
    }                                                                                   //Retorna false
    
    public void modificarPersonal(String nombre, String apellido, String rutNuevo, String rutViejo, String correoElectronico, String password){         //Método para modificar un empleado según los datos entregados por parámetro
        personal.modificarPersonal(rutViejo, new Personal(0, nombre, apellido, rutNuevo, correoElectronico, password));                                 //Se llama el método modificarPersonal para modificar los datos del empleado
    }
    
    public boolean buscarPersonal(String rut){                                          //Método para buscar un empleado según su rut
        return personal.buscarPersonalMenu(rut);                                        //Retorna true si lo encuentra, en el caso contrario retorna false 
    }
    
    public void mostrarPersonal(){                                                      //Método para mostrar todo el personal por consola
        personal.mostrarPersonal();                                                     //Se imprimirá los datos de cada empleado de forma ordenada
    }
    
    public String VerificarLogin(String username, String password){                     //Método para verificar los datos para iniciar sesión
        return personal.IngresarLogin(username, password);                              //Se buscan los datos ingresados por parámetros y retorna un booleano
    }
    
    public String SalirLogin(String username, String password){                         //Método para verificar los datos para cerrar sesión correctamente
        return personal.SalirLogin(username, password);                                 //Se buscan los datos ingresados por parámetros y retorna un booleano
    }
    
    /*------------------------------------------------------------------------*/
    /* Métodos temporales para el uso de la interfaz grafica del proyecto
     * ProCable sin base de datos. La interfaz grafica 
     * está en la carpeta "ventanas".
     */
    
    public String obtenerNombreEmpleado(String rut){
        return personal.obtenerNombre(rut);
    }
    
    public String obtenerApellidoEmpledo(String rut){
        return personal.obtenerApellido(rut);
    }
    
    public String obtenerRutEmpleado(String rut){
        return personal.obtenerRut(rut);
    }
    
    public String obtenerMailEmpleado(String rut){
        return personal.obtenerMail(rut);
    }
    
    public String obtenerPasswordEmpleado(String rut){
        return personal.obtenerPassword(rut);
    }
    
    public String obtenerNombreCliente(String rut){
        return clientes.obtenerNombre(rut);
    }
    
    public String obtenerApellidoCliente(String rut){
        return clientes.obtenerApellido(rut);
    }
    
    public String obtenerMailCliente(String rut){
        return clientes.obtenerMail(rut);
    }
    
    public String obtenerTelefonoCliente(String rut){
        return clientes.obtenerTelefono(rut);
    }
    
    public String obtenerPlanContratadoCliente(String rut){
        return clientes.obtenerPlanContratado(rut);
    }
}   


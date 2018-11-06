package clasesproyecto.listas;
//CHUPALAAAAAAAAAAAAAAAAAAAAAAA
import clasesproyecto.*;

public class ProCable {
    public ListaPersonal personal;
    public ListaCliente clientes;
    public ListaPlan planes;
	
//---------------------------- Constructor -------------------------------------//
    public ProCable() {
    	this.personal = new ListaPersonal();
	this.clientes = new ListaCliente();
        this.planes = new ListaPlan();
    }
	
//---------------------------- Metodos ----------------------------------------//
	
    public boolean agregarCliente(String nombre, String apellido, String rut, String correoElectronico, String telefono) {
        if(clientes.estaVacio()) {
            return clientes.agregarCliente(new Cliente(1, nombre, apellido, rut, correoElectronico, telefono));
	}
	else {
            return clientes.agregarCliente(new Cliente(clientes.tamano(), nombre, apellido, rut, correoElectronico, telefono));
        }
    }
	
    public boolean eliminarCliente(String rutCliente) {
        boolean flag = false;       
        for(int i = 0; i < planes.getPlanes().size(); i++){
            if(planes.getPlanes().get(i).getClientesContratados().eliminarClienteContratado(rutCliente)){
                flag = true;
            }
        }
        return flag && clientes.eliminarCliente(rutCliente);
    }
    
    public void mostrarCliente(){
        clientes.mostrarCliente();
    }
	
    public boolean agregarPlan(String nombre, int valorPlan, int cantCanales) {
	if(planes.estaVacio()) {
            return planes.agregarPlan(new Plan(1, nombre, valorPlan, cantCanales));
	}
	else {
            return planes.agregarPlan(new Plan(planes.tamano(), nombre, valorPlan, cantCanales));
	}
    }
	
    public boolean eliminarPlan(String nombrePlan) {
        return planes.eliminarPlan(nombrePlan);
    }
    
    public void modificarCliente(String rutViejo,String nombre, String apellido, String rutNuevo, String correoElectronico, String telefono){
        clientes.modificarCliente(rutViejo,new Cliente(0 ,nombre, apellido, rutNuevo, correoElectronico, telefono));
        for(int i = 0; i < planes.tamano(); i++){
            if(planes.getPlanes().get(i).getClientesContratados().buscarClienteContratado(rutViejo) != null){
                planes.getPlanes().get(i).getClientesContratados().modificarCliente(rutViejo, new Cliente(0 ,nombre, apellido, rutNuevo, correoElectronico, telefono));
            }
        }
    }
    
    public boolean agregarPersonal(String nombre, String apellido, String rut, String correoElectronico, String password){
        if(personal.estaVacio()){
            return personal.agregarPersonal(new Personal(1, nombre, apellido, rut, correoElectronico, password));
        }
        else{
            return personal.agregarPersonal(new Personal(personal.tamano(), nombre, apellido, rut, correoElectronico, password));
        }
    }
    
    public boolean eliminarPersonal(String rut){
        return personal.eliminarPersonal(rut);
    }
    
    public boolean buscarPersonal(String rut){
        return personal.buscarPersonalMenu(rut);
    }
    
    public void modificarPersonal(String nombre, String apellido, String rutNuevo, String rutViejo, String correoElectronico, String password){
        personal.modificarPersonal(rutViejo, new Personal(0, nombre, apellido, rutNuevo, correoElectronico, password));
    }
}

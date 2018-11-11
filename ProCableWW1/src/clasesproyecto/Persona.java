package clasesproyecto;

import Interfaces.Verificar;

public abstract class Persona implements Verificar{
	
    private int ID;
    private String nombre;
    private String apellido;
    private String rut;
    private String correoElectronico;

//-------------------------------------- Constructor ----------------------------------------------//
    
    public Persona(int ID, String nombre, String apellido, String rut, String correoElectronico) {
	this.ID = ID;
	this.nombre = nombre;
	this.apellido = apellido;
	this.rut = rut;
	this.correoElectronico = correoElectronico;		
    }

//-------------------------------------- Getters y setters ----------------------------------------//
    
    public int getID() {
	return ID;
    }

    public void setID(int iD) {
	ID = iD;
    }
    
    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getApellido() {
    	return apellido;
    }

    public void setApellido(String apellido) {
    	this.apellido = apellido;
    }

    public String getRut() {
    	return rut;
    }

    public void setRut(String rut) {
	this.rut = rut;
    }

    public String getCorreoElectronico() {
    	return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
    	this.correoElectronico = correoElectronico;
    }

//---------------------------------------- Métodos ---------------------------------------------//
    
    public boolean equals(Persona p){ //Método para comparar el nombre, apellido y rut
        Persona otro = (Persona)p;
        return (nombre.equals(otro.getNombre())) && (apellido.equals(otro.getApellido())) && (rut.equals(otro.getRut()));
    }
    
    @Override
    public String ingresar(){ //Metodo que retorna mensaje de bienvenida de X persona
        return "Bienvenido "+this.nombre+" "+this.apellido+"!";
    }

    @Override
    public String salir(){ //Metodo que retorna mensaje de cerrar sesion de X persona
        return "Cerrando sesión de "+this.nombre+" "+this.apellido+"!";
    }
}

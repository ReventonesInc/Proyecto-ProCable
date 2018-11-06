package clasesproyecto;

import java.util.*;

public class Cliente extends Persona {
    private String telefono;
    private Date fechaContrato;
	
//--------------------------------------Constructor--------------------------------------------------//
    public Cliente(int ID, String nombre, String apellido, String rut, String correoElectronico, String telefono) {
        super(ID, nombre, apellido, rut, correoElectronico);
	this.telefono = telefono;
	this.fechaContrato = new Date();
    }
//------------------------------------- Getters y setters -------------------------------------------//
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
	this.telefono = telefono;
    }
	
    public Date getFecha() {
        return fechaContrato;
    }
    
    public void setFecha(Date nuevaFecha) {
        this.fechaContrato = nuevaFecha;
    }
}

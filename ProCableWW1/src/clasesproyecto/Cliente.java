package clasesproyecto;

import java.util.*;
import java.text.*;


public class Cliente extends Persona {
    private String telefono;
    private SimpleDateFormat fechaContrato;
	
//--------------------------------------Constructor--------------------------------------------------//
    public Cliente(int ID, String nombre, String apellido, String rut, String correoElectronico, String telefono) {
        super(ID, nombre, apellido, rut, correoElectronico);
	this.telefono = telefono;
	this.fechaContrato = new SimpleDateFormat();
    }
//------------------------------------- Getters y setters -------------------------------------------//
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
	this.telefono = telefono;
    }
	
    public SimpleDateFormat getFecha() {
        return fechaContrato;
    }
    
    public void setFecha(SimpleDateFormat nuevaFecha) {
        this.fechaContrato = nuevaFecha;
    }
}

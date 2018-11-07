package clasesproyecto;

import java.util.*;
import java.text.*;



public class Cliente extends Persona {
    private String telefono;
    private SimpleDateFormat fechaContrato;
    private SimpleDateFormat ultimoMesPagado;
    private int numeroDeudas;
    private  float deuda;
	
//--------------------------------------Constructor--------------------------------------------------//
    public Cliente(int ID, String nombre, String apellido, String rut, String correoElectronico, String telefono) {
        super(ID, nombre, apellido, rut, correoElectronico);
	this.telefono = telefono;
	this.fechaContrato = new SimpleDateFormat();
        this.ultimoMesPagado =  new SimpleDateFormat();
        this. deuda = 0;
        this.numeroDeudas = 0;
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
    
    public void calcularDeuda(float otrosPagos){
        int i;
         /*
        WNNN NO SE COMO  HACER LA WEA DE LA DIFERENCIA DE MESES CON LAS DOS FECHAS
        */
    }
}

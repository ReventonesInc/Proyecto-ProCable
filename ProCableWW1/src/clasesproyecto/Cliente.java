package clasesproyecto;

import java.text.*;

public class Cliente extends Persona {      //Herencia: Clase cliente hereda persona
    private String planContratado;
    private String telefono;
    private SimpleDateFormat fechaContrato;
    private SimpleDateFormat ultimoMesPagado;
    private int numeroDeudas;
    private  float deuda;
	
//--------------------------------------Constructor--------------------------------------------------//
    
    public Cliente(int ID, String planContratado, String nombre, String apellido, String rut, String correoElectronico, String telefono) {
        super(ID, nombre, apellido, rut, correoElectronico);
        this.planContratado = planContratado;
	this.telefono = telefono;
	this.fechaContrato = new SimpleDateFormat();
        this.ultimoMesPagado =  new SimpleDateFormat();
        this.deuda = 0;
        this.numeroDeudas = 0;
    }
    
//------------------------------------- Getters y setters -------------------------------------------//
    
    public String getPlanContratado() {
        return planContratado;
    }

    public void setPlanContratado(String planContratado) {
        this.planContratado = planContratado;
    }
    
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
    
//----------------------- Métodos ----------------------------------------------------------//
    
    //Calcular diferencia entre fecha contrato y ultimo mes pagado
    //Luego, calcular cantidad de meses fecha actual y fecha ultimo pago
    //Acualizar deuda como valor en $$ de lo que debe en "x" meses
    //Y numero de deudas como la cantidad de meses que hay entre fecha actual y fecha ultimo pago
    
    public void calcularDeuda(float otrosPagos){
        int i;
        /*
        WNNN NO SE COMO  HACER LA WEA DE LA DIFERENCIA DE MESES CON LAS DOS FECHAS
        */
    }

    @Override
    public String ingresar() {
        return super.ingresar();
    }
}
package clasesproyecto;

import clasesproyecto.listas.ListaClienteContratado;

public class Plan {
    private int ID;
    private String nombrePlan;
    private float valorPlan;
    private int cantCanales;
    private ListaClienteContratado clientesContratados;
	
//--------------------------------------------- Constructor -----------------------------------------//
    public Plan(int ID, String nombrePlan, float valorPlan, int cantCanales) {
        this.ID = ID;
        this.clientesContratados = new ListaClienteContratado();
	this.nombrePlan = nombrePlan;
	this.valorPlan = valorPlan;
	this.cantCanales = cantCanales;
    }
	
//--------------------------------------------- Getters y setters -----------------------------------//
    public String getNombrePlan() {
	return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public float getValorPlan() {
        return valorPlan;
    }
    
    public void setValorPlan(int valorPlan) {
	this.valorPlan = valorPlan;
    }

    public int getCantCanales() {
	return cantCanales;
    }

    public void setCantCanales(int cantCanales) {
	this.cantCanales = cantCanales;
    }

    public ListaClienteContratado getClientesContratados() {
	return clientesContratados;
    }

    public void setClientesContratados(ListaClienteContratado usuariosContratados) {
	this.clientesContratados = usuariosContratados;
    }

    public int getID() {
	return ID;
    }

    public void setID(int iD) {
        this.ID = iD;
    }	
}
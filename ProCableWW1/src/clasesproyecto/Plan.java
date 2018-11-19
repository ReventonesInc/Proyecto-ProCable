package clasesproyecto;

public class Plan {
    private int ID;
    private String nombrePlan;
    private float valorPlan;
    private int cantCanales;
    private int cantVentas;
	
//--------------------------------------------- Constructor -----------------------------------------//
    
    public Plan(int ID, String nombrePlan, float valorPlan, int cantCanales) {
        this.ID = ID;
	this.nombrePlan = nombrePlan;
	this.valorPlan = valorPlan;
	this.cantCanales = cantCanales;
        this.cantVentas = 0;
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
    
    public void setValorPlan(float valorPlan) {
	this.valorPlan = valorPlan;
    }

    public int getCantCanales() {
	return cantCanales;
    }

    public void setCantCanales(int cantCanales) {
	this.cantCanales = cantCanales;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }

    public int getID() {
	return ID;
    }

    public void setID(int iD) {
        this.ID = iD;
    }	
}
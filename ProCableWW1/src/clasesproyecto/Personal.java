package clasesproyecto;

public class Personal extends Persona {
    
    private String password;
	
//---------------------------------------------- Constructor ------------------------------------------------//
    
    public Personal(int ID, String nombre, String apellido, String rut, String correoElectronico, String password) {
    	super(ID, nombre, apellido, rut, correoElectronico);
    	this.password = password;
    }

//---------------------------------------------- Getters y setters ------------------------------------------//
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }
    
//---------------------------------------- Métodos ---------------------------------------------//
    
    @Override
    public String ingresar() {
        return super.ingresar();
    }

    @Override
    public String salir() {
        return super.salir();
    }
}

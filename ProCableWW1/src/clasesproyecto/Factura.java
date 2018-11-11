
package clasesproyecto;


public class Factura {
    private Cliente clienteAbonante;
    private float montoPagado;
    private int idFactura;
    
//--------------------------------------Constructor--------------------------------------------------//    
    
    public Factura(Cliente clienteAbonante, float montoPagado, int idFactura){
        this.clienteAbonante = clienteAbonante;
        this.montoPagado = montoPagado;
        this.idFactura = idFactura;
    }
    
//------------------------------------- Getters y setters -------------------------------------------//    
    
    public Cliente getClienteAbonante() {
        return clienteAbonante;
    }

    public float getMontoPagado() {
        return montoPagado;
    }
    
    public int getIdFactura() {
        return idFactura;
    }

    public void setClienteAbonante(Cliente clienteAbonante) {
        this.clienteAbonante = clienteAbonante;
    }

    public void setMontoPagado(float montoPagado) {
        this.montoPagado = montoPagado;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }
    
//----------------------- Métodos ----------------------------------------------------------//

}

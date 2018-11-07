
package clasesproyecto;


public class Factura {
    private Cliente clienteAbonante;
    private float montoPagado;
    
    public Factura(Cliente clienteAbonante, float montoPagado){
        this.clienteAbonante = clienteAbonante;
        this.montoPagado = montoPagado;
    }

    public Cliente getClienteAbonante() {
        return clienteAbonante;
    }

    public float getMontoPagado() {
        return montoPagado;
    }

    public void setClienteAbonante(Cliente clienteAbonante) {
        this.clienteAbonante = clienteAbonante;
    }

    public void setMontoPagado(float montoPagado) {
        this.montoPagado = montoPagado;
    }
    
}

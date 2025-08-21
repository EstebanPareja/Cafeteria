package co.edu.uniquindio.poo.cafeteriajfx;

public class Cliente extends Persona {
    private TipoCliente tipoCliente;

    public Cliente(String nombre, String id, TipoCliente tipoCliente) {
        super(nombre, id);
        this.tipoCliente = tipoCliente;
    }
}

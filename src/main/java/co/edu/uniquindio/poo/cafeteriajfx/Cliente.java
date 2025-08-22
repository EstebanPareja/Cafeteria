package co.edu.uniquindio.poo.cafeteriajfx;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private TipoCliente tipoCliente;
    private List<Pedido> listPedidosCliente;

    public Cliente(String nombre, String id, TipoCliente tipoCliente) {
        super(nombre, id);
        this.tipoCliente = tipoCliente;
        this.listPedidosCliente = new ArrayList<>();
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public List<Pedido> getListPedidosCliente() {
        return listPedidosCliente;
    }

    public void setListPedidosCliente(List<Pedido> listPedidosCliente) {
        this.listPedidosCliente = listPedidosCliente;
    }
}

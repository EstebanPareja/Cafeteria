package co.edu.uniquindio.poo.cafeteriajfx;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements AplicarDescuento, CalcularCostoTotal, RecomendarHistorial{
    private String id;
    private Cliente cliente;
    private List<ProductoPedido> listProductosPedido;
    private LocalDate fecha;
    private LocalTime hora;
    private boolean descuento;
    private double descuentoAplicado;
    private double subtotal;
    private double total;

    public Pedido(String id, Cliente cliente, List<ProductoPedido> listProductosPedido, boolean descuento, double descuentoAplicado) {
        this.id = id;
        this.cliente = cliente;
        this.listProductosPedido = new ArrayList<>();
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
        this.descuento = descuento;
        this.descuentoAplicado = descuentoAplicado;

    }


    /**
     * Metodo para agregar un pedido a una lista
     * @param productoPedido
     * @return boolean
     */
    public boolean agregarProductoPedido(ProductoPedido productoPedido) {
        if (listProductosPedido == null) {
            listProductosPedido = new ArrayList<>();
        }
        return listProductosPedido.add(productoPedido);
    }

    /**
     * Metodo para crear un producto pedido
     * @param producto
     * @param cantidad
     * @return boolean
     */

    public boolean crearProductoPedido(Producto producto, int cantidad) {
        if (producto == null || cantidad <= 0) {
            return false;
        }
        double subtotalProducto = producto.getPrecio() * cantidad;
        ProductoPedido productoPedido = new ProductoPedido(producto, cantidad, subtotalProducto);

        boolean agregado = agregarProductoPedido(productoPedido);

        if (agregado) {
            this.subtotal += subtotalProducto;
        }
        return agregado;
    }



    public double aplicarDescuento() {
        double subtotalSinDescuento = 0;
        double subtotalConDescuento = 0;
        for (ProductoPedido productoPedido : listProductosPedido) {
            subtotalSinDescuento += productoPedido.getSubtotalSinDescuento();
        }
        subtotalConDescuento += subtotalSinDescuento - (subtotalSinDescuento * this.descuentoAplicado);
        return this.subtotal = subtotalConDescuento;

    }

    public double calcularCostoTotal() {
        if (subtotal <= 0) {
            throw new IllegalArgumentException("Subtotal negativo");
        }
        double costoTotal = this.subtotal + (this.subtotal * IVA);
        return this.total =  costoTotal;
    }

    /**
     * Metodo para validar la existencia de un pedido en una lista de un cliente
     * @param pedido
     * @return boolean
     */

    public boolean verificarPedidoCliente(Pedido pedido) {
        Cliente cliente1 = pedido.getCliente();
        for (Pedido pedido1: cliente1.getListPedidosCliente()) {
            if (pedido.getId().equals(pedido1.getId())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo para agregar un pedido a una lista de un cliente
     * @param pedido
     * @return boolean
     */

    public boolean agregarPedidoCliente(Pedido pedido) {
        Cliente cliente1 = pedido.getCliente();
        if (verificarPedidoCliente(pedido)) {
            return false;
        } else {
            return cliente1.getListPedidosCliente().add(pedido);
        }
    }


    @Override
    public String recomendarHistorial() {
        return "b";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ProductoPedido> getListProductosPedido() {
        return listProductosPedido;
    }

    public void setListProductosPedido(List<ProductoPedido> listProductosPedido) {
        this.listProductosPedido = listProductosPedido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public double getDescuentoAplicado() {
        return descuentoAplicado;
    }

    public void setDescuentoAplicado(double descuentoAplicado) {
        this.descuentoAplicado = descuentoAplicado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


}

package co.edu.uniquindio.poo.cafeteriajfx;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Pedido {
    private String id;
    private Cliente cliente;
    private List<Producto> listProductosPedido;
    private LocalDate fecha;
    private LocalTime hora;
    private boolean descuento;
    private double descuentoAplicado;
    private double total;

    public Pedido(String id, Cliente cliente, List<Producto> listProductosPedido, boolean descuento, double descuentoAplicado, double total) {
        this.id = id;
        this.cliente = cliente;
        this.listProductosPedido = listProductosPedido;
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
        this.descuento = descuento;
        this.descuentoAplicado = descuentoAplicado;
        this.total = total;


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

    public List<Producto> getListProductosPedido() {
        return listProductosPedido;
    }

    public void setListProductosPedido(List<Producto> listProductosPedido) {
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

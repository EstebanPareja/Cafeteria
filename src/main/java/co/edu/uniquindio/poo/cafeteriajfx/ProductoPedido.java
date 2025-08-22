package co.edu.uniquindio.poo.cafeteriajfx;

public class ProductoPedido {
    private Producto productoPedido;
    private int cantidad;
    private double subtotalSinDescuento;

    public ProductoPedido(Producto productoPedido, int cantidad,  double subtotalSinDescuento) {
        this.productoPedido = productoPedido;
        this.cantidad = cantidad;
        this.subtotalSinDescuento = productoPedido.getPrecio() * cantidad;
    }

    public Producto getProductoPedido() {
        return productoPedido;
    }

    public void setProductoPedido(Producto productoPedido) {
        this.productoPedido = productoPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotalSinDescuento() {
        return subtotalSinDescuento;
    }

    public void setSubtotalSinDescuento(double subtotalSinDescuento) {
        this.subtotalSinDescuento = subtotalSinDescuento;
    }
}

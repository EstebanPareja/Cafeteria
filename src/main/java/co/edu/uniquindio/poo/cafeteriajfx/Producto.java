package co.edu.uniquindio.poo.cafeteriajfx;


public class Producto {
    private String nombre, id;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, String id, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", id=" + id + ", price=" + precio;
    }
}

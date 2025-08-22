package co.edu.uniquindio.poo.cafeteriajfx;


public class Producto {
    private String nombre, id;
    private double precio;

    public Producto(String nombre, double precio, String id) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
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



    @Override
    public String toString() {
        return "nombre=" + nombre + ", id=" + id + ", price=" + precio;
    }
}

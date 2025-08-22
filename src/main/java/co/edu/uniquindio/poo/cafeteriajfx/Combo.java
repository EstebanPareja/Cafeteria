package co.edu.uniquindio.poo.cafeteriajfx;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Producto{
    private String nombre, id;
    private double precio;
    private List<Bebida> bebidasCombo;
    private  List<Comestible> comestibleCombo;

    public Combo(String nombre, String id){
        super (nombre, 0.0, id);
        this.nombre = nombre;
        this.id = id;
        this.bebidasCombo = new ArrayList<>();
        this.comestibleCombo = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Bebida> getBebidasCombo() {
        return bebidasCombo;
    }

    public void setBebidasCombo(List<Bebida> bebidasCombo) {
        this.bebidasCombo = bebidasCombo;
    }

    public List<Comestible> getComestibleCombo() {
        return comestibleCombo;
    }

    public void setComestibleCombo(List<Comestible> comestibleCombo) {
        this.comestibleCombo = comestibleCombo;
    }
}

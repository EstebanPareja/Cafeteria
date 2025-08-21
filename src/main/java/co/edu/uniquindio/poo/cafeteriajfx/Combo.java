package co.edu.uniquindio.poo.cafeteriajfx;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Producto {

    private List<Bebida> bebidasCombo;
    private  List<Comestible> comestibleCombo;

    public Combo(String name, double price, String id,  int stock) {
        super(name, price, id,  stock);
        this.bebidasCombo = new ArrayList<>();
        this.comestibleCombo = new ArrayList<>();
    }
}

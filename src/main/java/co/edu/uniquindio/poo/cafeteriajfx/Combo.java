package co.edu.uniquindio.poo.cafeteriajfx;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Product {

    private List<Drinks> comboDrinks;
    private  List<Comestibles> comboComestibles;

    public Combo(String name, double price, String id) {
        super(name, price, id);
        this.comboDrinks = new ArrayList<Drinks>();
        this.comboComestibles = new ArrayList<>();
    }
}

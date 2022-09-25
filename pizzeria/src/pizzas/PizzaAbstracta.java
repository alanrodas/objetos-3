package pizzas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

abstract class PizzaAbstracta implements Pizza, Comida {
    private List<String> ingredientes;

    public PizzaAbstracta() {
        this.ingredientes = new ArrayList<String>();
        this.addToppings();
        this.addQueso();
        this.addSalsa();
        this.addMasa();
    }

    private List<String> getSalsa() {
        return this.ingredientes;
    }

    protected void agregarSalsa(String salsa) {
        this.getSalsa().add(salsa);
    }

    public abstract void addToppings();
    public abstract void addQueso();
    public abstract void addSalsa();
    public void addMasa() {
        this.masas.add("Masa");
    }

    @Override
    public List<String> getIngredientes() {
        List<String> ingredientes = new ArrayList<String>();

        ingredientes.addAll(this.toppings);
        ingredientes.addAll(this.quesos);
        ingredientes.addAll(this.salsas);
        ingredientes.addAll(this.masas);
        return ingredientes;
    }

    @Override
    public int getCalorias() {
        return 1000;
    }
}

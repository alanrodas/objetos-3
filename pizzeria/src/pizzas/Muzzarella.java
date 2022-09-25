package pizzas;

import java.util.ArrayList;
import java.util.List;

public class Muzzarella extends PizzaAbstracta {
    public void addToppings() {
    }
    public void addQueso() {
        this.quesos.add("Muzzarella");
    }
    public void addSalsa() {
        this.agregarSalsa("Salsa");
        this.agregarSalsa("Oregano");
    }
}

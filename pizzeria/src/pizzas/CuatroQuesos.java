package pizzas;

public class CuatroQuesos  extends PizzaAbstracta {
    public void addToppings() {

    }
    public void addQueso() {
        this.ingredientes.add("Muzzarella");
        this.ingredientes.add("Provolone");
        this.ingredientes.add("Roquefort");
        this.ingredientes.add("Ricotta");
    }
    public void addSalsa() {
        this.ingredientes.add("Salsa");
    }
}

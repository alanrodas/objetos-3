package pizzas;

public class Napolitana extends Muzzarella {
    @Override
    public void addToppings() {
        this.ingredientes.add("Aceitunas verdes");
        this.ingredientes.add("Tomate");
    }
}

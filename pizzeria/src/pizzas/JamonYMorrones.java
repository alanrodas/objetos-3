package pizzas;

public class JamonYMorrones extends Muzzarella {
    @Override
    public void addToppings() {
        this.toppings.add("Jamón");
        this.toppings.add("Morrones");
    }

    @Override
    public void addSalsa() {
        this.salsas.add("Salsa de tomate");
        super.addSalsa();
    }
}

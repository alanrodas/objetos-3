package pizzeria;

import pizzas.*;

public class Pizzeria {
    public Pizza pizzaMuzzarella() {
        return new Muzzarella();
    }
    public Pizza pizzaAnchoas() {
        return new Anchoas();
    }
    public Pizza pizzaNapolitana() {
        return new Napolitana();
    }
    public Pizza pizzaJamonYMorrones() {
        return new JamonYMorrones();
    }
    public Pizza pizzaCalabresa() {
        return new Calabresa();
    }
    public Pizza pizzaFugazzeta() {
        return new Fugazzeta();
    }
    public Pizza pizzaCuatroQuesos() {
        return new CuatroQuesos();
    }
}

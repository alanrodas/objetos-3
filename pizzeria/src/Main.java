import pizzas.Comida;
import pizzas.Pizza;
import pizzeria.Pizzeria;

public class Main {
    public static void show(Pizza pizza) {
        System.out.println(pizza.getIngredientes());
    }

    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();
        show(pizzeria.pizzaMuzzarella());
        show(pizzeria.pizzaAnchoas());
        show(pizzeria.pizzaNapolitana());
        show(pizzeria.pizzaJamonYMorrones());
        show(pizzeria.pizzaCalabresa());
        show(pizzeria.pizzaFugazzeta());
        show(pizzeria.pizzaCuatroQuesos());
    }
}

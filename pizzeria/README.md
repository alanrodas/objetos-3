### Ej. 1.A.
# Pizzería

### Enunciado:


Queremos poder representar el trabajo de una fábrica de pizzas utilizando un modelo orientado a objetos.

Lo que vamos a querer es poder tener un objeto que representa a nuestra fábrica de pizzas, y pedirle a este que haga pizzas de distinto tipo (ej. Muzzarella, calabresa, napolitana, fugazzeta, etc.), por lo que se espera que responda a los métodos de la forma "pizzaMuzzarella", "pizzaCalabresa", etc.

Lo que se espera es que al pedir una pizza se obtenga un objeto de tipo "Pizza". Una pizza está formada de una serie de ingredientes, que incluyen los toppings (ej. Salamín, tomate, aceitunas, etc.), el queso (aunque no todas llevan queso, ni solo uno, ni siempre el mismo), la salsa de tomate (aunque algunas no tienen) y la masa. Cada pizza debe, al menos, saber responder a su lista de ingredientes, los cuales son simplemente strings que se presentan en la lista en orden, desde los toppings a la masa, según lo mencionado anteriormente.

Se deben definir al menos las siguientes pizzas:
* Muzzarella (no tiene toppings, su queso es de tipo muzzarella, lleva salsa)
* Anchoas (anchoas y aceitunas negras son sus toppings, no tiene queso, pero lleva salsa)
* Napolitana (lleva tomate y aceitunas verdes, su queso es de tipo muzzarella, lleva salsa)
* Jamón y Morrones (lleva jamón y marrones como toppings, queso muzzarella y salsa)
* Calabresa (salamín y aceitunas verdes, muzzarella y salsa)
* Fugazzetta (cebolla como topping, queso muzzarella, sin salsa)
* Cuatro quesos (no lleva toppings, pero tiene queso muzzarella, provolone, roquefort y ricotta, con salsa)

Tips:
* Debe haber un main en donde se pida una pizza de cada sabor, y se impriman sus ingredientes.
* Puede crear tantas clases como quiera para implementar la solución.
* No puede utilizar métodos de clase para la solución.
* Puede agregar tantos métodos como crea convenientes.

A ver que surge…

### Sobre la solución:

La solución no es compleja, pero implica poner en práctica algún patrón de diseño. Se utilizó el patrón factory para la pizzería, pudiendo pedirle diversas pizzas.

En cuando a las pizzas, la idea es utilizar el patrón de template method, para construirlas de forma apropiada.
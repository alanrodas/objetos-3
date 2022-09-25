### Ej. 2.A.
# Complejos

### Enunciado:

Queremos agregar los numeros complejos al compendio de números que se pueden manipular en el lenguaje, ya que para la mayoría de los lenguajes, no es un tipo de número primitivo.

Vamos a usar por ahora la representación binomial de un número complejo, es decir, representado por la fórmula `a + bi`, donde `a` y `b` son números reales, e `i = sqrt(-1)`.

##### Punto 1
Vamos a querer poder obtener la parte real y la imaginaria de un número complejo, pero también poder sumarlos y restarlos entre si. Un número complejo se suma con otro mediante la siguiente fórmula:
```
(a + bi) + (c + di) = (a+c) + (b+d)i

(a + bi) - (c + di) = (a-c) + (b-d)i
```

Se pide que implemente entonces en Java y en Python la clase `Complejo` que soporte las operaciones mencionadaas.

Luego conteste:

* ¿Cuál es la forma más natural de escribir una suma entre complejos en Java?
* ¿Y en python?
* ¿Hay algún mecanismo del lenguaje que permita mejorar la sintaxis para manipular complejos?

##### Punto 2
Los números complejos pueden ademas sumarse o restarse con numeros reales.
Cuando se suma o resta con un real, solo la parte real se ve afectada.
La formula es:
```
(a + bi) + c = (a+c) + bi

(a + bi) - c = (a-c) + bi
```

Implemente la suma soportando números reales ademas de complejos. Luego conteste:
* ¿Que se utiliza para soportar más de una forma de sumar en Java? ¿Y en python?
* Siendo que la suma es conmutativa, ¿Hay alguna forma de escribir `c + (a + bi)` de forma "natural" en el lenguaje?

### Sobre la solución:

La solución no es compleja, pero implica poner en práctica algún patrón de diseño. Se utilizó el patrón factory para la pizzería, pudiendo pedirle diversas pizzas.

En cuando a las pizzas, la idea es utilizar el patrón de template method, para construirlas de forma apropiada.
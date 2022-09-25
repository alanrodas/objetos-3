public class Main {
    public static void main(String[] args) {
        Complejo primero = new Complejo(3, 5);
        Complejo segundo = new Complejo(2, 1);

        Complejo suma = primero.add(segundo);
        Complejo resta = primero.sub(segundo);

        System.out.print(primero.toString() + " + " + segundo.toString() + " = " + suma.toString());
        System.out.print(primero.toString() + " - " + segundo.toString() + " = " + resta.toString());
    }
}

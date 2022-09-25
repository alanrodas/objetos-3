public class MainMejorado {
    public static void main(String[] args) {
        ComplejoMejorado primero = new ComplejoMejorado(3, 5);
        double real = 3;

        ComplejoMejorado suma = primero.add(real);
        ComplejoMejorado resta = primero.sub(real);

        System.out.print(primero.toString() + " + " + real + " = " + suma.toString());
        System.out.print(primero.toString() + " - " + real + " = " + resta.toString());
    }
}

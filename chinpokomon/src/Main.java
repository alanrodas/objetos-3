import factories.ChinpokomonFactory;
import models.Chinpokomon;
import models.SimuladorDeBatallas;

public class Main {
    public static void main(String[] args) {
        Chinpokomon carnotron = ChinpokomonFactory.Carnotron();
        Chinpokomon gallotronix = ChinpokomonFactory.Gallotronix();
        Chinpokomon zapato1 = ChinpokomonFactory.Zapato1();
        Chinpokomon zapato2 = ChinpokomonFactory.Zapato2();

        SimuladorDeBatallas.pelear_Contra_(carnotron, zapato1);
    }
}

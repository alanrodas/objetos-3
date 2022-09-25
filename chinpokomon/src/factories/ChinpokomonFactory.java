package factories;

import models.Chinpokomon;
import models.ataque.strategy_decorator.Ataque;

import java.util.ArrayList;
import java.util.List;

public class ChinpokomonFactory {
    public static Chinpokomon Carnotron() {
        List<Ataque> ataques = new ArrayList<Ataque>(2);
        ataques.add(AtaqueFactory.CanhonSonico());
        ataques.add(AtaqueFactory.RayoVeloz());
        return new Chinpokomon("Carnotron", 20, ataques);
    }

    public static Chinpokomon Gallotronix() {
        List<Ataque> ataques = new ArrayList<Ataque>(2);
        ataques.add(AtaqueFactory.GarraMecanica());
        return new Chinpokomon("Gallotronix", 25, ataques);
    }

    public static Chinpokomon Zapato1() {
        List<Ataque> ataques = new ArrayList<Ataque>(2);
        ataques.add(AtaqueFactory.Zapatazo());
        return new Chinpokomon("Zapato", 30, ataques);
    }

    public static Chinpokomon Zapato2() {
        List<Ataque> ataques = new ArrayList<Ataque>(2);
        ataques.add(AtaqueFactory.PomadaWassinton());
        return new Chinpokomon("Zapato", 30, ataques);
    }
}

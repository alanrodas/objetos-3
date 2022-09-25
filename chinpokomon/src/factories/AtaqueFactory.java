package factories;

import models.ataque.strategy_decorator.*;

public class AtaqueFactory {
    public static Ataque RayoVeloz() {
        return new TipoDeAtaqueDeDanhoSimple("rayo veloz", 3);
    }

    public static Ataque CanhonSonico() {
        return new TipoDeAtaqueDeDanhoSimple("cañon sónico", 4);
    }

    public static Ataque GarraMecanica() {
        return new ModificadorDeAtaqueCritico(0.1, new TipoDeAtaqueDeDanhoSimple("garra mecánica", 2));
    }

    public static Ataque Zapatazo() {
        return new ModificadorDeAtaqueMultiple(0.5, 2, new TipoDeAtaqueDeDanhoSimple("zapatazo", 1));
    }

    public static Ataque PomadaWassinton() {
        return new TipoDeAtaqueDeRestauracion("Pomada Wassinton", 5);
    }
}

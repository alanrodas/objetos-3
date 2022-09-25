package models.ataque.strategy_decorator;

import helpers.Logger;
import helpers.Randoms;
import models.Chinpokomon;

public class ModificadorDeAtaqueMultiple extends ModificadorDeAtaque {

    private double probabilidadDeAtaqueMultiple;
    private int cantidadDeAtaqueMultiple;

    public ModificadorDeAtaqueMultiple(double probabilidadDeAtaqueMultiple, int cantidadDeAtaqueMultiple, Ataque ataque) {
        super(ataque);
        Randoms.validatePercentageOrFail(probabilidadDeAtaqueMultiple);
        this.probabilidadDeAtaqueMultiple = probabilidadDeAtaqueMultiple;
        this.cantidadDeAtaqueMultiple = cantidadDeAtaqueMultiple;
    }

    public double getProbabilidadDeAtaqueMultiple() {
        return probabilidadDeAtaqueMultiple;
    }

    public int getCantidadDeAtaqueMultiple() {
        return cantidadDeAtaqueMultiple;
    }

    public void aplicarAtaqueDe_A_(Chinpokomon atacante, Chinpokomon atacado) {
        int vecesAAtacar = Randoms.satisfiesWithPercentage(this.getProbabilidadDeAtaqueMultiple()) ?
                this.getCantidadDeAtaqueMultiple() : 1;
        if (vecesAAtacar > 1) {
            Logger logger = Logger.getInstance();
            logger.info("¡¡¡Wow!!! atacó " + vecesAAtacar + " veces");
        }
        for (int i = 0; i < vecesAAtacar; i++) {
            this.getAtaque().aplicarAtaqueDe_A_(atacante, atacado);
        }
    }
}

package models.ataque.strategy_decorator;

import helpers.Logger;
import helpers.Randoms;
import models.Chinpokomon;

public class ModificadorDeAtaqueCritico extends ModificadorDeAtaque {

    private double probabilidadDeDanhoCritico;

    public ModificadorDeAtaqueCritico(double probabilidadDeDanhoCritico, Ataque ataque) {
        super(ataque);
        Randoms.validatePercentageOrFail(probabilidadDeDanhoCritico);
        this.probabilidadDeDanhoCritico = probabilidadDeDanhoCritico;
    }

    public double getProbabilidadDeDanhoCritico() {
        return probabilidadDeDanhoCritico;
    }

    public void aplicarAtaqueDe_A_(Chinpokomon atacante, Chinpokomon atacado) {
        if (Randoms.satisfiesWithPercentage(this.getProbabilidadDeDanhoCritico())) {
            Logger logger = Logger.getInstance();
            logger.info("¡¡¡Es un ataque crítico!!!");
            atacado.recibir_DeDanho(atacado.getVida() / 2);
        } else {
            this.getAtaque().aplicarAtaqueDe_A_(atacante, atacado);
        }
    }
}

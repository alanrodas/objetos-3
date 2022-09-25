package models.ataque.strategy_only;

import helpers.Logger;
import helpers.Randoms;
import models.Chinpokomon;

public class AtaqueDeDanhoConCritico extends Ataque {

    private double probabilidadDeDanhoCritico;

    public AtaqueDeDanhoConCritico(String nombre, int puntosDeAtaque, double probabilidadDeDanhoCritico) {
        super(nombre, puntosDeAtaque);
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
            atacado.recibir_DeDanho(this.getPuntosDeAtaque());
        }
    }
}

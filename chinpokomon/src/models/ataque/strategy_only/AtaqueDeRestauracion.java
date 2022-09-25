package models.ataque.strategy_only;

import helpers.Logger;
import models.Chinpokomon;

public class AtaqueDeRestauracion extends Ataque {

    public AtaqueDeRestauracion(String nombre, int puntosDeAtaque) {
        super(nombre, puntosDeAtaque);
    }

    public void aplicarAtaqueDe_A_(Chinpokomon atacante, Chinpokomon atacado) {
        Logger logger = Logger.getInstance();
        logger.info("se ha recuperado");
        atacante.recuperar_DeVida(this.getPuntosDeAtaque());
    }
}

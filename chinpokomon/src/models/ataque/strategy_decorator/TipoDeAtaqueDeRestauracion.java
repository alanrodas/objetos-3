package models.ataque.strategy_decorator;

import helpers.Logger;
import models.Chinpokomon;

public class TipoDeAtaqueDeRestauracion extends TipoDeAtaque {

    public TipoDeAtaqueDeRestauracion(String nombre, int puntosDeAtaque) {
        super(nombre, puntosDeAtaque);
    }

    public void aplicarAtaqueDe_A_(Chinpokomon atacante, Chinpokomon atacado) {
        Logger logger = Logger.getInstance();
        logger.info("se ha recuperado");
        atacante.recuperar_DeVida(this.getPuntosDeAtaque());
    }
}

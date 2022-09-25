package models.ataque.strategy_decorator;

import models.Chinpokomon;

public class TipoDeAtaqueDeDanhoSimple extends TipoDeAtaque {

    public TipoDeAtaqueDeDanhoSimple(String nombre, int puntosDeAtaque) {
        super(nombre, puntosDeAtaque);
    }

    public void aplicarAtaqueDe_A_(Chinpokomon atacante, Chinpokomon atacado) {
        atacado.recibir_DeDanho(this.getPuntosDeAtaque());
    }
}

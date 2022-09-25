package models.ataque.strategy_only;

import models.Chinpokomon;

public class AtaqueDeDanhoSimple extends Ataque {

    public AtaqueDeDanhoSimple(String nombre, int puntosDeAtaque) {
        super(nombre, puntosDeAtaque);
    }

    public void aplicarAtaqueDe_A_(Chinpokomon atacante, Chinpokomon atacado) {
        atacado.recibir_DeDanho(this.getPuntosDeAtaque());
    }
}

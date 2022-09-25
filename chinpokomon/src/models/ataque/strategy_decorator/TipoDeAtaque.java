package models.ataque.strategy_decorator;

import models.Chinpokomon;

public abstract class TipoDeAtaque implements Ataque {

    private String nombre;
    private int puntosDeAtaque;

    public TipoDeAtaque(String nombre, int puntosDeAtaque) {
        this.nombre = nombre;
        this.puntosDeAtaque = puntosDeAtaque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    public abstract void aplicarAtaqueDe_A_(Chinpokomon atacante, Chinpokomon atacado);
}

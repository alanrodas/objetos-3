package models.ataque.strategy_decorator;

import models.Chinpokomon;

public interface Ataque {
    void aplicarAtaqueDe_A_(Chinpokomon atacante, Chinpokomon atacado);

    String getNombre();
}

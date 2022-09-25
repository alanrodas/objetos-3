package models.ataque.god;

import helpers.Randoms;
import models.Chinpokomon;

public class AtaqueSinSubclases {

    private int puntosDeAtaque;
    private int puntosDeRecuperacion;
    private float probabilidadDeAtaqueCritico;
    private float probabilidadDeGolpeMultiple;
    private int factorDeGolpeMultiple;

    public AtaqueSinSubclases(int puntosDeAtaque, int puntosDeRecuperacion, int probabilidadDeAtaqueCritico, int probabilidadDeGolpeMultiple, int factorDeGolpeMultiple) {
        Randoms.validatePercentageOrFail(probabilidadDeAtaqueCritico);
        Randoms.validatePercentageOrFail(probabilidadDeGolpeMultiple);
        this.puntosDeAtaque = puntosDeAtaque;
        this.puntosDeRecuperacion = puntosDeRecuperacion;
        this.probabilidadDeAtaqueCritico = probabilidadDeAtaqueCritico;
        this.probabilidadDeGolpeMultiple = probabilidadDeGolpeMultiple;
        this.factorDeGolpeMultiple = factorDeGolpeMultiple;
    }


    public void aplicarAtaqueDe_A_(Chinpokomon atacado, Chinpokomon atacante) {
        atacante.recuperar_DeVida(this.puntosDeRecuperacion);
        int cantidadDeAtaquesARealizar = Randoms.satisfiesWithPercentage(this.probabilidadDeGolpeMultiple) ? this.factorDeGolpeMultiple : 1;
        for (int i = 0; i < cantidadDeAtaquesARealizar; i++) {
            if (Randoms.satisfiesWithPercentage(this.probabilidadDeAtaqueCritico)) {
                atacado.recibir_DeDanho(atacado.getVida() / 2);
            }
            else {
                atacado.recibir_DeDanho(this.puntosDeAtaque);
            }
        }
    }
}

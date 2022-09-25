package models;

import java.util.List;

import helpers.Logger;
import helpers.Randoms;
import models.ataque.strategy_decorator.Ataque;

public class Chinpokomon {
    private String nombre;
    private int vida;

    private List<Ataque> ataques;

    public Chinpokomon(String nombre, int vida, List<Ataque> ataques) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataques = ataques;
    }

    /* ACCESSORS */
    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    protected List<Ataque> getAtaques() {
        return this.ataques;
    }

    public boolean sigueVivo() {
        return this.getVida() >= 1;
    }

    protected Ataque ataqueAleatorio() {
        return Randoms.anyFrom(this.getAtaques());
    }

    public void atacarA_(Chinpokomon otro) {
        Ataque ataque = this.ataqueAleatorio();

        Logger logger = Logger.getInstance();
        logger.info(this.getNombre() + " ataca con " + ataque.getNombre());

        ataque.aplicarAtaqueDe_A_(this, otro);
    }

    public void recibir_DeDanho(int danho) {
        this.vida -= danho;
    }

    public void recuperar_DeVida(int recuperacion) {
        this.vida += recuperacion;
    }

}

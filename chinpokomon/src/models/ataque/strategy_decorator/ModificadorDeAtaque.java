package models.ataque.strategy_decorator;

public abstract class ModificadorDeAtaque implements Ataque {

    private Ataque ataque;

    public ModificadorDeAtaque(Ataque ataque) {
        this.ataque = ataque;
    }

    public Ataque getAtaque() {
        return ataque;
    }

    public String getNombre() {
        return this.getAtaque().getNombre();
    }
}

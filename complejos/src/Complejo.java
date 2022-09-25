public final class Complejo {

    private Double parteReal;

    private Double parteImaginaria;

    public Complejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public Double getParteReal() {
        return this.parteReal;
    }

    public Double getParteImaginaria() {
        return this.parteImaginaria;
    }

    public Complejo add(Complejo other) {
        return new Complejo(
                this.getParteReal() + other.getParteReal(),
                this.getParteImaginaria() + other.getParteImaginaria()
        );
    }

    public Complejo sub(Complejo other) {
        return new Complejo(
                this.getParteReal() - other.getParteReal(),
                this.getParteImaginaria() - other.getParteImaginaria()
        );
    }

    @Override
    public String toString() {
        return ( "(" +
                String.format("%.2f", this.getParteReal())
                + " + " +
                String.format("%.2f", this.getParteImaginaria()) +  "i)"
        );
    }
}

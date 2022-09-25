public class ComplejoMejorado {

    private Double parteReal;

    private Double parteImaginaria;

    public ComplejoMejorado(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public Double getParteReal() {
        return this.parteReal;
    }

    public Double getParteImaginaria() {
        return this.parteImaginaria;
    }

    public ComplejoMejorado add(ComplejoMejorado other) {
        return new ComplejoMejorado(
                this.getParteReal() + other.getParteReal(),
                this.getParteImaginaria() + other.getParteImaginaria()
        );
    }

    public ComplejoMejorado add(double other) {
        return new ComplejoMejorado(
                this.getParteReal() + other,
                this.getParteImaginaria()
        );
    }

    public ComplejoMejorado sub(double other) {
        return new ComplejoMejorado(
                this.getParteReal() - other,
                this.getParteImaginaria()
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

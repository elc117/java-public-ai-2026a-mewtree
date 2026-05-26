package demo.models;

public class Horario {
    private double inicio;
    private double fim;

    public Horario(double inicio, double fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public double getInicio(){
        return this.inicio;
    }

    public double getFim(){
        return this.fim;
    }
}

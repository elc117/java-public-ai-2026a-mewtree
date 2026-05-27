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

    //converte 8.5 para 08:30 pra exibir
    public String getInicioFormatado(){return formatarHora(inicio);}
    public String getFimFormatado(){return formatarHora(fim);}

    private String formatarHora(double hora){
        int h = (int) hora;
        int m = (int) Math.round((hora - h) * 60);

        return String.format("%02d:%02d", h, m);
    }
    @Override
    public String toString() {
        return getInicioFormatado() + " - " + getFimFormatado();
    }
}

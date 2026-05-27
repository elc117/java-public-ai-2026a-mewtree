package demo.models;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private int Id;
    private String Nome;
    private List<ArrayList> Trabalhadores = new ArrayList<>();

    public Grupo() {}
    public Grupo(int Id, String Nome) {
        this.Id = Id;
        this.Nome = Nome;
    }
    public Grupo(String Nome) {
        this.Nome = Nome;
    }

    public void adicionarTrabalhador(Trabalhador trabalhador) {
        this.trabalhadores.add(trabalhador);
    }
    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public List<ArrayList> getTrabalhadores() {
        return Trabalhadores;
    }
    public void setTrabalhadores(List<ArrayList> Trabalhadores) {
        this.Trabalhadores = Trabalhadores;
    }
    // util para debug
    @Override
    public String toString() {
        return "Grupo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", trabalhadores=" + trabalhadores +
                '}';
    }
}

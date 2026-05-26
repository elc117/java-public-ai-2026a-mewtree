package demo.models;
import java.util.List;

public class Trabalhador {
    private int Id;
    private String Nome;
    private Cargo cargo;

    private List<String> Habilidades;

    public Trabalhador(int id, String nome, Cargo cargo,  List<String> habilidades){
        this.Id = id;
        this.Nome = nome;
        this.cargo = cargo;
        this.Habilidades = habilidades;
    }

    public int getId(){
        return this.Id;
    }
    public String getNome(){
        return this.Nome;
    }
    public Cargo getCargo(){
        return this.cargo;
    }
    public List<String> getHabilidades(){
        return this.Habilidades;
    }
}

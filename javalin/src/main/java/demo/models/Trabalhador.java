package demo.models;

import java.util.List;

public class Trabalhador {
    private int id;
    private String nome;
    private Cargo.Cargos cargo;
    private List<String> habilidades;
    private List<DiaSemana.DiaSemanas> diasDisponiveis;
    private Horario horario;

    public Trabalhador(int id, String nome, Cargo.Cargos cargo, List<String> habilidades,
                       List<DiaSemana.DiaSemanas> diasDisponiveis, Horario horario) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.habilidades = habilidades;
        this.diasDisponiveis = diasDisponiveis;
        this.horario = horario;
    }

    public Trabalhador(int id, String nome, Cargo.Cargos cargo, List<String> habilidades) {
        this(id, nome, cargo, habilidades, List.of(), null);
    }

    public int getId(){ return id; }
    public String getNome(){ return nome; }
    public Cargo.Cargos getCargo(){ return cargo; }
    public List<String> getHabilidades(){ return habilidades; }    /** Construtor sem escala (para criação simples) */

    public List<DiaSemana.DiaSemanas> getDiasDisponiveis() { return diasDisponiveis; }
    public Horario getHorario(){ return horario; }

    public void setDiasDisponiveis(List<DiaSemana.DiaSemanas> dias) { this.diasDisponiveis = dias; }
    public void setHorario(Horario horario)         { this.horario = horario; }
}
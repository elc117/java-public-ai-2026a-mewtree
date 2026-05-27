package demo.strategy;

import demo.models.Trabalhador;

import java.util.List;

public interface TeamRecommendationStrategy {

    List<Trabalhador> recommendTeam(
            List<Trabalhador> trabalhadores
    );

}
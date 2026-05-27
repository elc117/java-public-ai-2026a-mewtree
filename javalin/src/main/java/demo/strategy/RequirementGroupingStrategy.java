package demo.strategy;

import demo.models.Cargo;
import demo.models.Trabalhador;

import java.util.ArrayList;
import java.util.List;

public class RequirementGroupingStrategy
        implements TeamRecommendationStrategy {

    @Override
    public List<Trabalhador> recommendTeam(
            List<Trabalhador> trabalhadores
    ) {

        List<Trabalhador> equipe = new ArrayList<>();

        int engenheiros = 0;
        int designers = 0;
        int frontends = 0;

        for (Trabalhador trabalhador : trabalhadores) {

            if (trabalhador.getCargaHorariaSemanal() < 20) {
                continue;
            }

            if (trabalhador.getCargo() == Cargo.ENGENHEIRO
                    && engenheiros < 2) {

                equipe.add(trabalhador);
                engenheiros++;
            }

            else if (trabalhador.getCargo() == Cargo.DESIGNER
                    && designers < 1) {

                equipe.add(trabalhador);
                designers++;
            }

            else if (trabalhador.getCargo() == Cargo.FRONTEND
                    && frontends < 1) {

                equipe.add(trabalhador);
                frontends++;
            }
        }

        return equipe;
    }
}
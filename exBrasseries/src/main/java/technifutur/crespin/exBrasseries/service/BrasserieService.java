package technifutur.crespin.exBrasseries.service;

import org.springframework.stereotype.Service;
import technifutur.crespin.exBrasseries.models.Brasserie;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class BrasserieService {

    private final List<Brasserie> brasserie;


    public BrasserieService() {

        brasserie = new ArrayList<>();

        brasserie.add(
                Brasserie.builder()
                        .id(1)
                        .nom("Aigle d'or")
                        .adresse("Place General Leman")
                        .nomProprietaire("Moi")
                        .heureOuverture(LocalTime.of(9, 30))
                        .heureFermeture(LocalTime.of(3, 0))
                        .peutManger(true)
                        .build()
        );

        brasserie.add(
                Brasserie.builder()
                        .id(2)
                        .nom("Aigle d'acier")
                        .adresse("Rue du fer")
                        .nomProprietaire("Toi")
                        .heureOuverture(LocalTime.of(9, 30))
                        .heureFermeture(LocalTime.of(3, 0))
                        .peutManger(true)
                        .build()
        );

        brasserie.add(
                Brasserie.builder()
                        .id(3)
                        .nom("Aigle d'étain")
                        .adresse("Place de l'étain")
                        .nomProprietaire("Lui")
                        .heureOuverture(LocalTime.of(9, 30))
                        .heureFermeture(LocalTime.of(3, 0))
                        .peutManger(false)
                        .build()
        );


    }

    public List<Brasserie> getAll() {
        return new ArrayList<>(brasserie);
    }

}


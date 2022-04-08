package technifutur.crespin.exBrasseries.models;

import lombok.Builder;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Data
@Builder
public class Brasserie {

    private int id;
    private String nom;
    private String adresse;
    private String nomProprietaire;
    private LocalTime heureOuverture;
    private LocalTime heureFermeture;
    private boolean peutManger;

    //List<String> platsDisponibles;



}

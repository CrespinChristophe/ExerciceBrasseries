package technifutur.crespin.exBrasseries.models;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalTime;

@Data
public class BrasserieForm {

    @NotNull
    @Size(min = 2, max = 50)
    private String nom;
    @NotNull
    @Size(min = 1, max = 200)
    private String adresse;

    @Size(min = 0, max = 50)
    private String nomProprietaire;
    @NotNull
    private LocalTime heureOuverture;
    @NotNull
    private LocalTime heureFermeture;

    private boolean peutManger;

}

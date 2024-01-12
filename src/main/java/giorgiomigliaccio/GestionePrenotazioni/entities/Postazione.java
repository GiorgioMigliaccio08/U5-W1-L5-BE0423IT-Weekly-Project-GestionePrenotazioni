package giorgiomigliaccio.GestionePrenotazioni.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "Postazione")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Postazione {
    @Id
    @GeneratedValue
    private Long id;
    private String codiceUnivoco;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private TipoPostazione tipo;
    private int numeroMassimoOccupanti;


    public Postazione(String codiceUnivoco,String descrizione, int numeroMassimoOccupanti, TipoPostazione  tipo ) {
        this.codiceUnivoco = codiceUnivoco;
        this.descrizione = descrizione;
        this.numeroMassimoOccupanti= numeroMassimoOccupanti;
       this.tipo= tipo;
    }
}

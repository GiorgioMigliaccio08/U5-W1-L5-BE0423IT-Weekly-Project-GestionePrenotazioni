package giorgiomigliaccio.GestionePrenotazioni.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Entity
@Table(name = "Postazione")
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


    //CREO LA RELAZIONE CON LE ALTRE CLASSI:
    @ManyToOne
    @JoinColumn(name= "edificio_id")
    private Edificio edificio;


    public Postazione(String codiceUnivoco,String descrizione, int numeroMassimoOccupanti, TipoPostazione  tipo ) {
        this.codiceUnivoco = codiceUnivoco;
        this.descrizione = descrizione;
        this.numeroMassimoOccupanti= numeroMassimoOccupanti;
       this.tipo= tipo;
    }

    public String getCodiceUnivoco() {
        return codiceUnivoco;
    }

    public void setCodiceUnivoco(String codiceUnivoco) {
        this.codiceUnivoco = codiceUnivoco;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoPostazione getTipo() {
        return tipo;
    }

    public void setTipo(TipoPostazione tipo) {
        this.tipo = tipo;
    }

    public int getNumeroMassimoOccupanti() {
        return numeroMassimoOccupanti;
    }

    public void setNumeroMassimoOccupanti(int numeroMassimoOccupanti) {
        this.numeroMassimoOccupanti = numeroMassimoOccupanti;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }
}

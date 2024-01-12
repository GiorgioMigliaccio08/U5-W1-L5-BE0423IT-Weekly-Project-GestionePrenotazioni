package giorgiomigliaccio.GestionePrenotazioni.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Edificio {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String indirizzo;

    private String città;

    public Edificio(String nome, String indirizzo,String città) {
        this.nome = nome;
        this.indirizzo= indirizzo;
        this.città= città;
    }
}

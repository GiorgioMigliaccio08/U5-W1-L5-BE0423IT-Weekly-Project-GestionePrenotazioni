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
public class Utente {
    @Id
    @GeneratedValue

    private Long id;
    private String username;
    private String nomeCompleto;
    private String email;

    public Utente(String username,String nomeCompleto,String email ) {
        this.username = username;
        this.nomeCompleto= nomeCompleto;
        this.email=email;
    }
}

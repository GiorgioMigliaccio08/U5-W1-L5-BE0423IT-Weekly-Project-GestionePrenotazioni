package giorgiomigliaccio.GestionePrenotazioni.dao;

import giorgiomigliaccio.GestionePrenotazioni.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteDAO extends JpaRepository<Utente, Long> {
    Utente findByUsername(String username);
    Utente findByEmail(String email);
}

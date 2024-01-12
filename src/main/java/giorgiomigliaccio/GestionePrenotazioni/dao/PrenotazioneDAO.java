package giorgiomigliaccio.GestionePrenotazioni.dao;


import giorgiomigliaccio.GestionePrenotazioni.entities.Postazione;
import giorgiomigliaccio.GestionePrenotazioni.entities.Prenotazione;
import giorgiomigliaccio.GestionePrenotazioni.entities.Utente;

import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Long> {
    List<Prenotazione> findByUtenteAndDataPrenotazione(Utente utente, LocalDate dataPrenotazione);
    List<Prenotazione> findByPostazioneAndDataPrenotazione(Postazione postazione, LocalDate dataPrenotazione);
}

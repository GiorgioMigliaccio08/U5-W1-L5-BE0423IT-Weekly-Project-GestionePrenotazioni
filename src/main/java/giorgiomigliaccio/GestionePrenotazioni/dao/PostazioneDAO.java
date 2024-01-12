package giorgiomigliaccio.GestionePrenotazioni.dao;


import giorgiomigliaccio.GestionePrenotazioni.entities.Postazione;
import giorgiomigliaccio.GestionePrenotazioni.entities.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PostazioneDAO extends JpaRepository<Postazione, Long> {

    List<Postazione> findByTipoAndEdificio_Citta(TipoPostazione tipo, String citta);
    List<Postazione> findByDescrizioneContainingIgnoreCase(String keyword);
    List<Postazione> findByEdificio_Citta(String citta);
}

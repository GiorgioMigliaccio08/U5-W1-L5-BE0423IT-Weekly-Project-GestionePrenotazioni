package giorgiomigliaccio.GestionePrenotazioni.dao;


import giorgiomigliaccio.GestionePrenotazioni.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EdificioDao extends JpaRepository<Edificio, Long> {
        Edificio findByNome(String nome);
    }


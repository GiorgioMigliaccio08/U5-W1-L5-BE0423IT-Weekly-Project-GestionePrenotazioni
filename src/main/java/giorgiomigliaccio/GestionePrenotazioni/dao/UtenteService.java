package giorgiomigliaccio.GestionePrenotazioni.dao;


import giorgiomigliaccio.GestionePrenotazioni.entities.Utente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@Slf4j
public class UtenteService {



    @Autowired
    private UtenteDAO utenteoDao;

    public void saveUtente(Utente utente){
        utenteoDao.save(utente);
        System.out.println("Utente salvato correttamente!");
    }

    public List<Utente> findAll() {
        return utenteoDao.findAll();

    }

    public void findByIdAndUpdate(long id, Utente utente) {
        Utente found =utenteoDao.findById(id).orElseThrow(()->new RuntimeException());
        found.setUsername(utente.getUsername());
        found.setNomeCompleto(utente.getNomeCompleto());
        found.setEmail(utente.getEmail());


        utenteoDao.save(found);
        System.out.println("Utente con id " + id + " aggiornato con successo!");
    }
}

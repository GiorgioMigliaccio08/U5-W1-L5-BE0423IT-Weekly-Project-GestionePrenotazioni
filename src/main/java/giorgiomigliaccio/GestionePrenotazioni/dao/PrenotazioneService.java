package giorgiomigliaccio.GestionePrenotazioni.dao;


import giorgiomigliaccio.GestionePrenotazioni.entities.Prenotazione;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@Slf4j
public class PrenotazioneService {
    @Autowired
    private PrenotazioneDAO prenotazioneDao;

    public void savePrenotazione(Prenotazione prenotazione){
       prenotazioneDao.save(prenotazione);
        System.out.println("Prenotazione salvata correttamente!");
    }

    public List<Prenotazione> findAll() {
        return prenotazioneDao.findAll();

    }

    public void findByIdAndUpdate(long id, Prenotazione prenotazione) {
       Prenotazione found =prenotazioneDao.findById(id).orElseThrow(()->new RuntimeException());
        found.setDataPrenotazione(prenotazione.getDataPrenotazione());



    prenotazioneDao.save(found);
        System.out.println("Prenotazione con id " + id + " aggiornato con successo!");
    }
}

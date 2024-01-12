package giorgiomigliaccio.GestionePrenotazioni.dao;


import giorgiomigliaccio.GestionePrenotazioni.entities.Postazione;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
@Slf4j
public class PostazioneService {

    @Autowired
    private PostazioneDAO postazioneDAO;

    public void savePostazione(Postazione postazione){
        postazioneDAO.save(postazione);
        System.out.println("Postazione salvata correttamente!");
    }

    public List<Postazione> findAll() {
        return postazioneDAO.findAll();

    }

    public void findByIdAndUpdate(long id, Postazione postazione) {
        Postazione found =postazioneDAO.findById(id).orElseThrow(()->new RuntimeException());
        found.setCodiceUnivoco(postazione.getCodiceUnivoco());
        found.setDescrizione(postazione.getDescrizione());
        found.setTipo(postazione.getTipo());
        found.setNumeroMassimoOccupanti(postazione.getNumeroMassimoOccupanti());

        postazioneDAO.save(found);
        System.out.println("Postazione con id " + id + " aggiornato con successo!");
    }



}



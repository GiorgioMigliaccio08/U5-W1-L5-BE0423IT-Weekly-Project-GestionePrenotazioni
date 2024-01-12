package giorgiomigliaccio.GestionePrenotazioni.dao;


import giorgiomigliaccio.GestionePrenotazioni.entities.Edificio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@Slf4j
public class EdificioService {

    @Autowired
    private EdificioDao edificioDao;

    public void saveEdificio(Edificio edificio){
        edificioDao.save(edificio);
        System.out.println("Edificio salvato correttamente!");
    }

    public List<Edificio> findAll() {
        return edificioDao.findAll();

    }

    public void findByIdAndUpdate(long id, Edificio edificio) {
        Edificio found =edificioDao.findById(id).orElseThrow(()->new RuntimeException());
        found.setNome(edificio.getNome());
        found.setIndirizzo(edificio.getIndirizzo());
        found.setCittà(edificio.getCittà());


        edificioDao.save(found);
        System.out.println("Edificio con id " + id + " aggiornato con successo!");
    }
}

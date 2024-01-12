package giorgiomigliaccio.GestionePrenotazioni;

import giorgiomigliaccio.GestionePrenotazioni.dao.EdificioService;
import giorgiomigliaccio.GestionePrenotazioni.dao.PostazioneService;
import giorgiomigliaccio.GestionePrenotazioni.dao.PrenotazioneService;
import giorgiomigliaccio.GestionePrenotazioni.dao.UtenteService;
import giorgiomigliaccio.GestionePrenotazioni.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    EdificioService edificioService;

    @Autowired
    PostazioneService postazioneService;

    @Autowired
    PrenotazioneService prenotazioneService;

    @Autowired
    UtenteService utenteService;

    @Override
    public void run(String... args) throws Exception {


   System.out.println("-------------------- SAVE UTENTI----------------------");
    Utente utente1 = new Utente("Rossi","Mario Rossi","mario@gmail.com");
    utenteService.saveUtente(utente1);
    Utente utente2 = new Utente("Giorgio","Giorgio Migliaccio","gmigliaccio@gmail.com");
    utenteService.saveUtente(utente2);
    Utente utente3 = new Utente("Tony","Tony Colombo","colombo01@gmail.com");
    utenteService.saveUtente(utente3);


    System.out.println("-------------------- SAVE EDIFICI----------------------");
    Edificio edificio1 = new Edificio("Comune","Via Roma 10","Palermo");
    edificioService.saveEdificio(edificio1);
    Edificio edificio2 = new Edificio("Palestra","Via Enea 14","Roma");
    edificioService.saveEdificio(edificio2);
    Edificio edificio3 = new Edificio("Scuola","Via Baglioni 3","Milano");
    edificioService.saveEdificio(edificio3);


    System.out.println("-------------------- SAVE POSTAZIONE----------------------");
    Postazione postazione1 = new Postazione("00987","Uffici Comunali",40, TipoPostazione.PRIVATO);
    postazioneService.savePostazione(postazione1);
    Postazione postazione2 = new Postazione("03457","Uffici Palestra",5, TipoPostazione.OPENSPACE);
    postazioneService.savePostazione(postazione2);
    Postazione postazione3 = new Postazione("06748","Uffici Scolastici",60, TipoPostazione.SALA_RIUNIONI);
    postazioneService.savePostazione(postazione3);


    System.out.println("-------------------- SAVE PRENOTAZIONE----------------------");
    Prenotazione prenotazione1 = new Prenotazione();


        System.out.println("-------------------- FIND ALL ----------------------");
        utenteService.findAll().forEach(System.out::println);
        edificioService.findAll().forEach(System.out::println);
        postazioneService.findAll().forEach(System.out::println);


        System.out.println("-------------------- FIND BY ID ----------------------");
        try {
          //  System.out.println(utenteService.findById(1));
          //  System.out.println(utenteService.findById(3));
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

        System.out.println("-------------------- FIND BY ID AND DELETE ----------------------");
        try {
           // utenteService.findByIdAndDelete(3);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

        System.out.println("-------------------- FIND BY NAME ----------------------");
       // UtenteService.filterByName("Giorgio").forEach(System.out::println);

        System.out.println("-------------------- FIND BY NAME AND SURNAME ----------------------");
       // usersService.filterByNameAndSurname("Giorgio", "Migliaccio").forEach(System.out::println);

    }

}

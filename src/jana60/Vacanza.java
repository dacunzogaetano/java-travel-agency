package jana60;

import java.time.LocalDate;
import java.util.Date;

public class Vacanza {
	
	/* Nel progetto java-travel-agency, creare la classe Vacanza caratterizzata da:
		- destinazione
		- data inizio
		- data fine
		Quando viene creata una nuova Vacanza vanno effettuati dei controlli:
		- destinazione, data inizio e data fine non possono essere null
		- la data inizio non può essere già passata
		- la data fine non può essere prima della data inizio
		Se fallisce la validazione vanno sollevate opportune eccezioni
		La classe Vacanza espone un metodo per calcolare la durata della vacanza (in giorni, mesi, anni).
		Aggiungere una classe Agenzia con metodo main, dove chiediamo all’operatore se vuole inserire una nuova vacanza o uscire. 
		Se vuole proseguire con l’inserimento va chiesta la destinazione, il giorno, mese e anno di partenza e il giorno, mese anno di ritorno.
		Con questi dati va generata una nuova vacanza e in console verrà stampato un messaggio del tipo:
		“Hai prenotato una vacanza di [durata della vacanza] a [destinazione] dal [data inizio formattata] al [data fine formattata]“.
		Se la creazione della vacanza genera un errore, il programma non deve interrompersi ma va gestito con dei messaggi di errore che permettono 
		all’utente di capire cosa è andato storto e di ripetere l’inserimento. */
	
	//attributi
	LocalDate inizioVacanza;
	LocalDate fineVacanza;
	String destinazione;
	LocalDate oggi = LocalDate.now();	
	
	//Costruttori
	
	public Vacanza(LocalDate inizioVacanza, LocalDate fineVacanza, String destinazione, LocalDate oggi) throws Exception {
		super();
		this.inizioVacanza = inizioVacanza;
		this.fineVacanza = fineVacanza;
		this.destinazione = destinazione;
		this.oggi = oggi;
	}

	public LocalDate getInizioVacanza() {
		return inizioVacanza;
	}

	public void setInizioVacanza(LocalDate inizioVacanza) {
		this.inizioVacanza = inizioVacanza;
	}

	public LocalDate getFineVacanza() {
		return fineVacanza;
	}

	public void setFineVacanza(LocalDate fineVacanza) {
		this.fineVacanza = fineVacanza;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}
	
	//metodo not null per la destinazione
	private void validDestinazione (String destinazioneInput) throws NullPointerException {
		if (destinazioneInput == null) {
			throw new NullPointerException("Inserisci una destinazione valida.");
		}
	}
	
	//metodi per la data inizio Vacanza, notnull e impossibilità che sia prima di oggi
	private void validInizioData (LocalDate inputInizioVacanza)  throws NullPointerException, Exception {
		if (inputInizioVacanza == null) {
			throw new NullPointerException("Inserisci una data d'inizio vacanza valida.");
		} else if (inputInizioVacanza.isBefore(oggi)) {
			throw new NullPointerException("La data inserita è nel passato");
		}
	
		
	}
	
	//metodi per la data inizio Vacanza, notnull e impossibilità che sia prima di oggi
		private void validFineData (LocalDate inputFineVacanza)  throws NullPointerException, Exception {
			if (inputFineVacanza == null) {
				throw new NullPointerException("Inserisci una data di fine vacanza valida.");
			} else if (inputFineVacanza.isBefore(inizioVacanza)) {
				throw new Exception ("La fine della vacanza scelta è antecedente l'inizio della stessa");
			}
		
			
		}
	
}

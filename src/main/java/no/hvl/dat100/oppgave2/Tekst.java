package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {

	private String tekst;
	
	public Tekst () {
		super(0,"","");
		this.tekst ="";
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
	super(id,bruker,dato);
	this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
	super (id,bruker,dato);
	this.tekst = "" ;
	}
	public String getTekst() {
		return tekst;

	}

	public void setTekst(String tekst) {
    this.tekst = tekst;
	 }
	

	@Override
	public String toString() {
	 return "ID: " + getId() + "\n1" + 
     "Bruker: " + getBruker() + "\nOle Olsen" +
	 "Dato: " + getDato() + "\n23-10" +
     "tekst: " + tekst;
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}

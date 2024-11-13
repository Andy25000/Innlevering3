package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {
	
	private Innlegg [] innleggtabell;
	private int nesteledig; 
	

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		boolean funnet = false;
		int verdi = 0;
	 while ( verdi<nesteledig && !funnet) {
		if (innleggtabell[verdi].erLik(innlegg)) 
		 funnet = true;
		else
			verdi++;
	 }
		if (funnet)
			return verdi;
		else 
			return -1;
	}
	
	public boolean finnes(Innlegg innlegg) {
		if (finnInnlegg(innlegg) != -1)
			return true;
		else return false;
	}

	public boolean ledigPlass() {
		return nesteledig < innleggtabell.length;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean ny = finnInnlegg(innlegg) == -1;
	if (ny && nesteledig < innleggtabell.length) {
		innleggtabell[nesteledig] = innlegg;
		nesteledig++;
		return true;
	} else return false;
			
	}
		

	public String toString() {
		
		String tekstbilde = getAntall() + "\n";
	for (int i = 0; i < getAntall(); i++) {
	tekstbilde += innleggtabell[i].toString();
	}
		
		return tekstbilde;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}
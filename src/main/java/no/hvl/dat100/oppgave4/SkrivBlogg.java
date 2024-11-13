package no.hvl.dat100.oppgave4;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

import no.hvl.dat100.common.TODO;

import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {
	
	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		String plass = mappe + "/" + filnavn;

		samling.toString();
		
		try (PrintWriter writer = new PrintWriter(new FileWriter(plass))) {
			writer.print(samling.toString());
			return true;
			
		}
		catch (IOException e) {
			System.out.println("Feil" + e.getMessage());
			return false;
		}
		
	}
}
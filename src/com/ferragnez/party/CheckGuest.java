package com.ferragnez.party;
import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//Dichiarazione del vettore degli invitati
	String [] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
	int n = invitati.length;
	//Si acquisisce da tastiera il nome da cercare nella lista degli invitati
	System.out.println("Inserisci il nome da cercare");
	String nome = input.nextLine();
	System.out.println("Il nome inserito è: " + nome);
        
		//Si esegue un ciclo for per scandire tutti gli elementi dell'array 
		boolean trovato = false;
		for(int i=0; i < n; i++) {
			if (nome.equals(invitati[i])) {  //si usa il metodo equals per confrontare le due stringhe
		              trovato = true; 
		              break;   //se il nome è presente nell'array si interrompe l'esecuzione del ciclo for
		            }
		 }

		if (trovato == true)
		   System.out.println("Trovato");
		else 
		   System.out.println("Non trovato");

	}
}

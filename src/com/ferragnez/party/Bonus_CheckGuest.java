package com.ferragnez.party;
import java.util.Scanner;

public class Bonus_CheckGuest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Dichiarazione del vettore degli invitati
		String [] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		int n = invitati.length;
		//Si acquisisce da tastiera il nome da cercare nella lista degli invitati
		System.out.println("Inserire il nome da cercare");
		String nome = input.nextLine();
		System.out.println("Il nome inserito è: " + nome);
        
			int i=0; // Contatore dell'iterazione
			//Nella condizione del while si effettua il controllo degli elementi dell'array
			//Si scorre l'array a partire alla prima posizione e si confronta il contenuto dell'array con la stringa inserita da tastiera
			//Si verifica se il nome inserito dall'utente è diverso dall'elemento dell'array, in tal caso si proseguire con la scansione del vettore
			//La scansione del vettore termina o quando si trova nel vettore il nome dell'utente oppure quando termina l'analisi di tutti gli elementi dell'array
			//Nella condizione del while si usa l'operatore AND per gestire le condizioni di uscita dal while
			while (!nome.equals(invitati[i]) && i<n-1) i++;  // All'interno del while si incrementa il contatore i per continuare con la scansione dell'elemento successivo dell'array

			//Una volta terminato il while si utilizza una selezione per controllare la condizione di uscita dall'iterazione
			//Se il nome corrisponde ad un elemento presente nel vettore allora si stampa la posizione dell'elemento nell'array (indice), 
			//altrimenti si stampa una frase per avvisare l'utente che il nome non è presente nell'array
			if (invitati[i].equals(nome))
				System.out.println("Nome trovato in posizione: " + i);  
			else 
				System.out.println("Nome non presente nell'array");
	}
}

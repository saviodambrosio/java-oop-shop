package it.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// chiedo all'utente di inserire i dati del prodotto

		Scanner scan = new Scanner(System.in);
		System.out.println("Inserire nome del prodotto");
		String nome = scan.nextLine();
		System.out.println("Inserire descrizione del prodotto");
		String descrizione = scan.nextLine();
		Prodotto prodotto = new Prodotto(nome, descrizione);
		System.out.println("Il codice del prodotto è: " + prodotto.getCodice());
		System.out.println("Il prezzo del prodotto è: " + prodotto.getPrezzo());
		System.out.println("Il prezzo del prodotto con iva è: " + prodotto.calcoloPrezzo());
		System.out.println(prodotto.getCodice() + "-" + prodotto.getNome());

		
		
		
		
		
		
		
		
		scan.close();
	}

}

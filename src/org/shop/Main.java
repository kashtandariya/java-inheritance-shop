package org.shop;

/*
V Creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
V- codice (numero intero)
V- nome
V- marca
V- prezzo
V- iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i
metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
V- il codice prodotto sia accessibile solo in lettura
V- gli altri attributi siano accessibili sia in lettura che in scrittura

Lo shop gestisce diversi tipi di prodotto:
V- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
V- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
V- Cuffie, caratterizzate dal colore e se sono wireless o cablate
VUtilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura
delle classi che gestiscono i vari sotto tipi di prodotto.
*/

public class Main {
	    public static void main(String[] args) {
	        Prodotto smartphone = new Smartphone(506, "Galaxy S10 Lite", "Samsung", 499.99, 22, "123456789012345", 256);
	        Prodotto televisore = new Televisore(402, "OLED TV", "LG", 1999.99, 22, 60, true);
	        Prodotto cuffia = new Cuffie(952, "Earbuds", "Samsung", 99.99, 22, "lilla", true);

	        System.out.println(smartphone);
	        System.out.println(televisore);
	        System.out.println(cuffia);
	    }
}

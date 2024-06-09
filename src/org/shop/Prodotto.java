package org.shop;

public class Prodotto {
	    private int codice;
	    private String nome;
	    private String marca;
	    private double prezzo;
	    private double iva;

	    public Prodotto(int codice, String nome, String marca, double prezzo, double iva) {
	        this.codice = codice;
	        this.nome = nome;
	        this.marca = marca;
	        this.prezzo = prezzo;
	        this.iva = iva;
	    }

	    //codice solo lettura
	    public int getCodice() {
	        return codice;
	    }

	    // Getter e setter per nome
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    // Getter e setter per marca
	    public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    // Getter e setter per prezzo
	    public double getPrezzo() {
	        return prezzo;
	    }

	    public void setPrezzo(double prezzo) {
	        this.prezzo = prezzo;
	    }

	    // Getter e setter per iva
	    public double getIva() {
	        return iva;
	    }

	    public void setIva(double iva) {
	        this.iva = iva;
	    }
	    
	    @Override
	    public String toString() {
	        return "Prodotto " +
	               "n° codice=" + codice +
	               ", nome='" + nome + '\'' +
	               ", marca='" + marca + '\'' +
	               ", prezzo=" + prezzo +
	               ", iva=" + iva;
	    }
}

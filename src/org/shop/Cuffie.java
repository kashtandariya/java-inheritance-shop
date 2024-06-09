package org.shop;

public class Cuffie extends Prodotto {
    private String colore;
    private boolean isWireless;

    public Cuffie(int codice, String nome, String marca, double prezzo,
    		double iva, String colore, boolean isWireless) {
        super(codice, nome, marca, prezzo, iva);
        this.colore = colore;
        this.isWireless = isWireless;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }
    
    @Override
    public String toString() {
        return "Cuffie-->" +
               super.toString() +
               ", colore='" + colore + '\'' +
               ", isWireless=" + isWireless;
    }
}

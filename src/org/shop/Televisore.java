package org.shop;

public class Televisore extends Prodotto {
    private int dimensioni;
    private boolean isSmart;

    public Televisore(int codice, String nome, String marca, double prezzo,
    		double iva, int dimensioni, boolean isSmart) {
        super(codice, nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.isSmart = isSmart;
    }

    public int getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean isSmart() {
        return isSmart;
    }
    
    public void setSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }
}
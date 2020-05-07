package com.cesi.bankonet;

/**
 *
 * @author Hugo-Louvet
 */
public abstract class Compte {
    protected String numero;
    protected String intitule;
    protected double solde;

    public Compte() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public double getSolde() {
        return solde;
    }

    
    public void Debiter(double somme) {
        if(somme > 0) {
            if(this.solde >= somme) {
                this.solde -= somme;
            } else {
                this.solde = 0;
            } 
        } else {
            System.out.println("La somme a débiter est négative");
        }
    }
    
    public void Crediter(double somme) {
        if(somme > 0) {
            this.solde += somme;
        } else {
            System.out.println("La somme a créditer est négative");
        }
    }
    
    public abstract boolean isDebitAutorise();
    
}

package com.cesi.bankonet;

/**
 *
 * @author Hugo-Louvet
 */
public class CompteCourant extends Compte {
    private double montantDecouvertAutorise;

    public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise) {
        super.numero = numero;
        super.intitule = intitule;
        if(solde >= 0) {
            super.solde = solde;
        } else {
            super.solde = 0;
            System.out.println("Un compte courant ne peut être crée avec un solde négatif");
        }
        this.montantDecouvertAutorise = montantDecouvertAutorise;
 
    }

    public double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }

    public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    @Override
    public String toString() {
        return "CompteCourant{" + "montantDecouvertAutorise=" + montantDecouvertAutorise + '}';
    }
    
    @Override
    public boolean isDebitAutorise() {
        if(super.solde >= this.montantDecouvertAutorise) {
            return true;
        } else {
            return false;
        }
    }
}

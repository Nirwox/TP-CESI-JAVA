package com.cesi.bankonet;

/**
 *
 * @author Hugo-Louvet
 */
public class CompteEpargne extends Compte {
    private double tauxInteret;
    
    public CompteEpargne(String numero, String intitule, double solde, double tauxInteret) {
        super.numero = numero;
        super.intitule = intitule;
        if(solde >= 0) {
            super.solde = solde;
        } else {
            super.solde = 0;
            System.out.println("Un compte courant ne peut être crée avec un solde négatif");
        }
        this.tauxInteret = tauxInteret;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" + "tauxInteret=" + tauxInteret + '}';
    }
    
    public double calculerInterets() {
        double interet = super.solde*(this.tauxInteret/100);
        super.solde += interet;
        return interet;
    }
}

package com.cesi.bankonet;

/**
 *
 * @author Hugo-Louvet
 */
public class CompteCourant {
    private String numero;
    private String intitule;
    private double solde;
    private double montantDecouvertAutorise;
    private static int nbComptesCourants = 0;

    public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise) {
        this.numero = numero;
        this.intitule = intitule;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
        this.nbComptesCourants++;
        if(solde >= 0) {
            this.solde = solde;
        } else {
            this.solde = 0;
            System.out.println("Un compte courant ne peut être crée avec un solde négatif");
        }
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

    public double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }

    public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    public static int getNbComptesCourants() {
        return nbComptesCourants;
    }

    @Override
    public String toString() {
        return "CompteCourant{" + "numero=" + numero + ", intitule=" + intitule + ", solde=" + solde + ", montantDecouvertAutorise=" + montantDecouvertAutorise + '}';
    }
}

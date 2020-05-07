/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        this.solde = solde;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
        this.nbComptesCourants++;
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

    public void setSolde(double solde) {
        this.solde = solde;
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

    public static void setNbComptesCourants(int nbComptesCourants) {
        CompteCourant.nbComptesCourants = nbComptesCourants;
    }

    @Override
    public String toString() {
        return "CompteCourant{" + "numero=" + numero + ", intitule=" + intitule + ", solde=" + solde + ", montantDecouvertAutorise=" + montantDecouvertAutorise + '}';
    }
}

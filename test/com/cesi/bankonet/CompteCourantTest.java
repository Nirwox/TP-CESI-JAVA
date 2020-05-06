package com.cesi.bankonet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hugo-Louvet
 */
public class CompteCourantTest extends TestCase {
    

    public void testNombreCompteCourant() throws Exception {
        com.cesi.bankonet.CompteCourant compteCourant1 = new com.cesi.bankonet.CompteCourant("1","Compte Courant 1",130.22,100.00);
        System.out.println("Numéro de compte: "+compteCourant1.getNumero());
        System.out.println("Solde du compte: "+compteCourant1.getSolde());
        com.cesi.bankonet.CompteCourant compteCourant2 = new com.cesi.bankonet.CompteCourant("2","Compte Courant 2",190.22,300.00);
        System.out.println("Numéro de compte: "+compteCourant2.getNumero());
        System.out.println("Solde du compte: "+compteCourant2.getSolde());
        com.cesi.bankonet.CompteCourant compteCourant3 = new com.cesi.bankonet.CompteCourant("3","Compte Courant 3",1330.22,500.00);
        System.out.println("Numéro de compte: "+compteCourant3.getNumero());
        System.out.println("Solde du compte: "+compteCourant3.getSolde());
        System.out.println(compteCourant3.getNbComptesCourants());
        assertEquals(3,compteCourant3.getNbComptesCourants());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

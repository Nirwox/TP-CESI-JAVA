/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesi.bankonet;

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
public class ClientTest extends TestCase {
    
    CompteEpargne compteEpargne = new com.cesi.bankonet.CompteEpargne("1","Compte Courant 1",1000.00,0.75);
    CompteCourant compteCourant = new com.cesi.bankonet.CompteCourant("1","Compte Courant 1",1000.00,100.00);
    
    Client unClient = new com.cesi.bankonet.Client("1","Dupont","Jean");
    
    public void testAddCompteCourant() {
        unClient.setCompteCourant(compteCourant);
        assertEquals("1",unClient.getCompteCourant().getNumero());
    }
    
    public void testAddCompteEpargne() {
        unClient.setCompteEpargne(compteEpargne);
        assertEquals("1",unClient.getCompteEpargne().getNumero());
    }
    
    public void testCalculerAvoir() {
        unClient.setCompteCourant(compteCourant);
        unClient.setCompteEpargne(compteEpargne);
        
        assertEquals(2000.0,unClient.calculerAvoirGlobal());
    }
    
    
    public void testCalculerAvoirSansCC() {
        unClient.setCompteEpargne(compteEpargne);
        
        assertEquals(1000.0,unClient.calculerAvoirGlobal());
    }
        
    public void testCalculerAvoirSansCE() {
        unClient.setCompteCourant(compteCourant);
        
        assertEquals(1000.0,unClient.calculerAvoirGlobal());
    }
    
    public void testCalculerAvoirSansCOmptes() {
        assertEquals(0.0,unClient.calculerAvoirGlobal());
    }
    
}

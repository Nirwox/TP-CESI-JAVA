/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesi.bankonet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.TestCase;
import static org.junit.Assert.*;

/**
 *
 * @author Hugo-Louvet
 */
public class CompteCourantTest extends TestCase {
    CompteCourant compteCourant = new com.cesi.bankonet.CompteCourant("1","Compte Courant 1",1000.00,100.00);

    public void testCompteCourantDebitTest() {
        compteCourant.Debiter(100);
        assertEquals(900.00,compteCourant.getSolde());
    }
    
    public void testCompteCourantDebit2Test() {
        compteCourant.Debiter(-100);
        assertEquals(1000.00,compteCourant.getSolde());
    }
    
    public void testCompteCourantDebit3Test() {
        compteCourant.Debiter(1100);
        assertEquals(0.00,compteCourant.getSolde());
    }
        
    public void testCompteCourantCreditTest() {
        compteCourant.Crediter(100);
        assertEquals(1100.00,compteCourant.getSolde());
    }
    
    public void testCompteCourantCredit2Test() {
        compteCourant.Crediter(-100);
        assertEquals(1000.00,compteCourant.getSolde());
    }
    
    

}

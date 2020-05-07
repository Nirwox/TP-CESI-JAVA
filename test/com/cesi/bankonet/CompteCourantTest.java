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
import com.cesi.bankonet.*;

/**
 *
 * @author Hugo-Louvet
 */
public class CompteCourantTest extends TestCase {
    CompteCourant compteCourantTestCredit = new com.cesi.bankonet.CompteCourant("1","Compte Courant 1",130.00,100.00);

    public void testNombreCompteCourant() throws Exception {
        assertEquals(5,compteCourantTestCredit.getNbComptesCourants());
    }
    
    public void testCrediter100() throws Exception {
        compteCourantTestCredit.Crediter(1000);
        assertEquals(1130.00,compteCourantTestCredit.getSolde());
    }
    
    public void testCrediterM1000() throws Exception {
        compteCourantTestCredit.Crediter(-1000);
        assertEquals(130.00,compteCourantTestCredit.getSolde());
    }
    
    public void testDebiter100() throws Exception {
        compteCourantTestCredit.Debiter(100);
        assertEquals(30.00,compteCourantTestCredit.getSolde());  
    }
    
    public void testDebiterM100() throws Exception {
        compteCourantTestCredit.Debiter(-100);
        assertEquals(130.00,compteCourantTestCredit.getSolde());
    }
}

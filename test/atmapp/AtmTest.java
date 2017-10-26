/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmapp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author changzhao
 */
public class AtmTest {
    
    public AtmTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of displayWelcomeMessage method, of class Atm.
     */
    @Test
    public void testDisplayWelcomeMessage() {
        System.out.println("displayWelcomeMessage");
        Atm instance = new Atm();
        instance.displayWelcomeMessage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayMainMenu method, of class Atm.
     */
    @Test
    public void testDisplayMainMenu() {
        System.out.println("displayMainMenu");
        Atm instance = new Atm();
        instance.displayMainMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayWithdrawlOption method, of class Atm.
     */
    @Test
    public void testDisplayWithdrawlOption() {
        System.out.println("displayWithdrawlOption");
        Atm instance = new Atm();
        instance.displayWithdrawlOption();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayThankYou method, of class Atm.
     */
    @Test
    public void testDisplayThankYou() {
        System.out.println("displayThankYou");
        Atm instance = new Atm();
        instance.displayThankYou();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of askUserLogIn method, of class Atm.
     */
    @Test
    public void testAskUserLogIn() {
        System.out.println("askUserLogIn");
        Atm instance = new Atm();
        String[] expResult = null;
        String[] result = instance.askUserLogIn();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMenuOption method, of class Atm.
     */
    @Test
    public void testGetMenuOption() {
        System.out.println("getMenuOption");
        Atm instance = new Atm();
        String expResult = "";
        String result = instance.getMenuOption();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dispenseCash method, of class Atm.
     */
    @Test
    public void testDispenseCash() {
        System.out.println("dispenseCash");
        double withdrawlAmount = 0.0;
        Atm instance = new Atm();
        instance.dispenseCash(withdrawlAmount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalCash method, of class Atm.
     */
    @Test
    public void testGetTotalCash() {
        System.out.println("getTotalCash");
        Atm instance = new Atm();
        double expResult = 0.0;
        double result = instance.getTotalCash();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

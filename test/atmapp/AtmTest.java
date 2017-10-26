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
     * Test of displayDepositEnvelop method, of class Atm.
     */
    @Test
    public void testDisplayDepositEnvelop() {
        System.out.println("displayDepositEnvelop");
        Atm instance = new Atm();
        instance.displayDepositEnvelop();
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
     * Test of displayReminder method, of class Atm.
     */
    @Test
    public void testDisplayReminder() {
        System.out.println("displayReminder");
        Atm instance = new Atm();
        instance.displayReminder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayCashWarning method, of class Atm.
     */
    @Test
    public void testDisplayCashWarning() {
        System.out.println("displayCashWarning");
        Atm instance = new Atm();
        instance.displayCashWarning();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayBalanceWarning method, of class Atm.
     */
    @Test
    public void testDisplayBalanceWarning() {
        System.out.println("displayBalanceWarning");
        Atm instance = new Atm();
        instance.displayBalanceWarning();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserAccount method, of class Atm.
     */
    @Test
    public void testGetUserAccount() {
        System.out.println("getUserAccount");
        Atm instance = new Atm();
        String expResult = "";
        String result = instance.getUserAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserPassword method, of class Atm.
     */
    @Test
    public void testGetUserPassword() {
        System.out.println("getUserPassword");
        Atm instance = new Atm();
        String expResult = "";
        String result = instance.getUserPassword();
        assertEquals(expResult, result);
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
        int expResult = 0;
        int result = instance.getMenuOption();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWithdrawlOption method, of class Atm.
     */
    @Test
    public void testGetWithdrawlOption() {
        System.out.println("getWithdrawlOption");
        Atm instance = new Atm();
        int expResult = 0;
        int result = instance.getWithdrawlOption();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepositAmount method, of class Atm.
     */
    @Test
    public void testGetDepositAmount() {
        System.out.println("getDepositAmount");
        Atm instance = new Atm();
        int expResult = 0;
        int result = instance.getDepositAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dispenseCash method, of class Atm.
     */
    @Test
    public void testDispenseCash() throws Exception {
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

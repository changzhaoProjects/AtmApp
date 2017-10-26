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
public class UserTest {
    
    public UserTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getBalance method, of class User.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        User instance = null;
        double expResult = 0.0;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deposit method, of class User.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        Double deposit = null;
        User instance = null;
        instance.deposit(deposit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of withdraw method, of class User.
     */
    @Test
    public void testWithdraw() throws Exception {
        System.out.println("withdraw");
        Double withdrawAmount = null;
        User instance = null;
        instance.withdraw(withdrawAmount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

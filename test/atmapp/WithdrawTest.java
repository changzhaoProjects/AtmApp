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
public class WithdrawTest {
    
    public WithdrawTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of processTransaction method, of class Withdraw.
     */
    @Test
    public void testProcessTransaction() {
        System.out.println("processTransaction");
        Atm atm = null;
        User user = null;
        int value = 0;
        Withdraw instance = new Withdraw();
        instance.processTransaction(atm, user, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

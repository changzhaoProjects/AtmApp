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
public class BalanceInquiryTest {
    
    public BalanceInquiryTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of processTransaction method, of class BalanceInquiry.
     */
    @Test
    public void testProcessTransaction() {
        System.out.println("processTransaction");
        Atm atm = null;
        User user = null;
        BalanceInquiry instance = new BalanceInquiry();
        instance.processTransaction(atm, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

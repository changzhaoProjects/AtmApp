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
public class KeyPadTest {
    
    public KeyPadTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getUserInput method, of class KeyPad.
     */
    @Test
    public void testGetUserInput() {
        System.out.println("getUserInput");
        KeyPad instance = new KeyPad();
        String expResult = "";
        String result = instance.getUserInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

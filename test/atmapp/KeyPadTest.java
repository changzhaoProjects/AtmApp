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
     * Test of userLogIn method, of class KeyPad.
     */
    @Test
    public void testUserLogIn() {
        System.out.println("userLogIn");
        KeyPad instance = new KeyPad();
        String[] expResult = null;
        String[] result = instance.userLogIn();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userMenuOption method, of class KeyPad.
     */
    @Test
    public void testUserMenuOption() {
        System.out.println("userMenuOption");
        KeyPad instance = new KeyPad();
        String expResult = "";
        String result = instance.userMenuOption();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

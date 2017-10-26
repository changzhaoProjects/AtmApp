/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmapp;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author changzhao
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({atmapp.UserTest.class, atmapp.DepositFundTest.class, atmapp.DelayTest.class, atmapp.BalanceInquiryTest.class, atmapp.KeyPadTest.class, atmapp.TransactionTest.class, atmapp.AtmAppTest.class, atmapp.WithdrawTest.class, atmapp.AtmTest.class, atmapp.ScreenTest.class, atmapp.NotEnoughCashExceptionTest.class, atmapp.NotEnoughBalanceExceptionTest.class})
public class AtmappSuite {

    @Before
    public void setUp() throws Exception {
    }
    
}

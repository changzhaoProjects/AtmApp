/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmapp;

/**
 *
 * @author changzhao
 */
class DepositFund implements Transaction{
    @Override
    public void processTransaction(Atm atm, User user, int value) {
        double depositAmount = (double) value/100.0;
        user.deposit(depositAmount);
        System.out.format("\nYou current balance is: %.2f\n", user.getBalance());
    }
}
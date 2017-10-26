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
class Withdraw implements Transaction{
    @Override
    public void processTransaction(Atm atm, User user, int value){
        double withdrawlAmount = 0.0;
        switch(value){
            case 1:
                withdrawlAmount = 20.0;
                break;
            case 2:
                withdrawlAmount = 40.0;
                break;
            case 3:
                withdrawlAmount = 60.0;
                break;
            case 4:
                withdrawlAmount = 100.0;
                break;
            case 5:
                withdrawlAmount = 200.0;
                break;
        }
        if (withdrawlAmount!= 0.0) {
            try {
                user.withdraw(withdrawlAmount);
                atm.dispenseCash(withdrawlAmount);
                //System.out.format("\nATM has %.2f cash left\n", atm.getTotalCash());
                atm.displayReminder();
            } catch(NotEnoughCashException|NotEnoughBalanceException e ){
                if (e instanceof NotEnoughCashException){
                    atm.displayCashWarning();
                }
                if (e instanceof NotEnoughBalanceException){
                    atm.displayBalanceWarning();
                }
                Delay.delay(1000);
                value = atm.getWithdrawlOption();
                processTransaction(atm, user, value);
            }           
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmapp;
import java.util.Scanner; 
/**
 *
 * @author changzhao
 */
interface Transaction {
    void processTransaction(Atm atm, User user); 
}

class BalanceInquiry implements Transaction{
    @Override
    public void processTransaction(Atm atm, User user){
        System.out.format("the current balance is: %f", user.getBalance());
    }
}

class Withdraw implements Transaction{
    @Override
    public void processTransaction(Atm atm, User user){
        double withdrawlAmount;
        atm.displayWelcomeMessage();
        Scanner scanner = new Scanner(System.in); // Creates the scanner object to read user input
        int userOption = scanner.nextInt();
        switch(userOption)
        {
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
        try {  //while (user.getBalance()< withdrawlAmount || atm.getTotalCash()< withdrawlAmount)
            
            user.withdraw(withdrawlAmount);
        } catch(notEnoughAmountException e ){
            scanner.nextInt();
        }
            
        }
        
    }


class DepositFund implements Transaction{
    @Override
    public void processTransaction(Atm atm, User user) {
        double depositAmount;
        atm.displayWithdrawalOption();
        double depositAmount = atm.getUserInput();
        try {
            user.withdraw(withdrawalAmount);
        } catch (notEnoughBalanceException e) {
            
        }
        
        
    }
}

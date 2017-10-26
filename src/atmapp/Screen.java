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
class Screen {
    public Screen(){}
    public final void welcome () {System.out.println("Welcome to the ATM!");}
    public final void displayMainMenu(){
    System.out.print("\n========================\n"
            + "ATM Menu:\n"
            + "1. Balance Inquiry \n"
            + "2. Withdraw Money \n"
            + "3. Deposit Funds \n"
            + "4. End Session \n"
            + "========================\n");
    }
    public final void displayWithdrawalOption(){
        System.out.println("\n========================\n"
            + "Withdrawl option:\n"
            + "1. $20 \n"
            + "2. $40 \n"
            + "3. $60 \n"
            + "4. $100 \n"
            + "5. $200 \n"
            + "6. Cancel the transcation \n"
            + "========================\n"
            + "Please enter your withdrawal option:\n");
    }
    public final void displayDepositeEnvelop(){System.out.println("\nWaiting for you to insert a deposit envelope!\n");}
    public final void notEnoughCashWarning(){System.out.println("\nNot enough cash in the ATM!\n");}
    public final void notEnoughBalanceWarning(){System.out.println("\nNot enough balance in your account!\n");}
    public final void reminder(){System.out.println("\nDo not forget to take the money!\n");}
    public final void thankYou(){System.out.println("\nThank you and goodbye!\n");}
}

package atmapp;
import java.util.Scanner;

/**
 *
 * @author changzhao
 */
public class Atm {
    private final Screen screen;
    private final KeyPad keyPad;
    private double totalCash;
    
    public Atm(){
        this.totalCash = 1000.0;
        this.screen = new Screen();
        this.keyPad = new KeyPad();
    }
    
    public void displayWelcomeMessage(){
        this.screen.welcome();       
    }
    
    public void displayMainMenu(){
        this.screen.displayMainMenu();       
    }
    
    public void displayWithdrawlOption(){
        this.screen.displayWithdrawalOption();       
    }
    
    public void displayDepositEnvelop(){
        this.screen.displayDepositeEnvelop();
    }
    
    public void displayThankYou(){
        this.screen.thankYou();       
    }
    
    public void displayReminder(){
        this.screen.reminder();       
    }
        
    public void displayCashWarning(){
        this.screen.notEnoughCashWarning();
    }
    
    public void displayBalanceWarning(){
        this.screen.notEnoughBalanceWarning();
    }
        
    // this method return user-entered account and password
    public String getUserAccount(){
        String userAccount;
        do {
            System.out.println("\nPlease enter 5-digit account:");
            userAccount = keyPad.getUserInput();
            if (!userAccount.matches("[0-9]{5}")) {
                System.out.println("\nIncorrect account format! Please enter it again:\n");
            }
        } while (!userAccount.matches("[0-9]{5}"));
        return userAccount;
    }
    
    public String getUserPassword(){
        String userPassword;
        do {
            System.out.println("\nPlease enter 5-digit PIN:");
            userPassword = keyPad.getUserInput();
            if (!userPassword.matches("[0-9]{5}")) {
                System.out.println("\nIncorrect password format! Please enter it again:\n");
            }
        } while (!userPassword.matches("[0-9]{5}"));
        
        return userPassword;
    }
    
    public int getMenuOption(){
        String menuOption;
        do {
            System.out.println("\nPlease enter your menu option:");
            menuOption = keyPad.getUserInput();
            if (!menuOption.matches("[1-4]{1}")) {
                System.out.println("\nIncorrect menu option! Please enter it again:\n");
            }
        } while (!menuOption.matches("[1-4]{1}"));
        return Integer.parseInt(menuOption);
    }
    
    public int getWithdrawlOption(){
        String withdrawlOption;
         do {
            screen.displayWithdrawalOption();
            withdrawlOption = keyPad.getUserInput();
            if (!withdrawlOption.matches("[1-6]{1}")) {
                System.out.println("\nIncorrect withdrawl option! Please enter it again:\n");
            }
        } while (!withdrawlOption.matches("[1-6]{1}"));
        return Integer.parseInt(withdrawlOption);
    }
    
    public int getDepositAmount(){
        String depositAmount;
         do {
            System.out.println("\nPlease enter your deposit amount as a number of cents:");
            depositAmount = keyPad.getUserInput();
            if (!depositAmount.matches("[0-9]+")) {
                System.out.println("\nIncorrect deposit amount! Please enter it again:\n");
            }
        } while (!depositAmount.matches("[0-9]+"));
        return Integer.parseInt(depositAmount);
    }
    
    public void dispenseCash(double withdrawlAmount) throws NotEnoughCashException {
        if (this.totalCash >= withdrawlAmount) this.totalCash -= withdrawlAmount;
        else throw new NotEnoughCashException("There is not enough cash in the ATM! "
            + "Please reselect the withdrawl amount!");
    }

    public double getTotalCash(){
        return this.totalCash;
    }
}
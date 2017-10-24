package atmapp;
import java.util.Scanner;

/**
 *
 * @author changzhao
 */
public class Atm {
    public Screen screen;
    public KeyPad keyPad;
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
    
    public void displayThankYou(){
        this.screen.displayWithdrawalOption();       
    }
    
    // this method return user-entered account and password
    public String[] askUserLogIn(){
        return this.keyPad.userLogIn();
    }
    
    public String getMenuOption(){
        return this.keyPad.userMenuOption();
    }
    
    public void dispenseCash (double withdrawlAmount) throws NotEnoughCashException {
        if (this.totalCash >= withdrawlAmount) this.totalCash -= withdrawlAmount;
        else throw new NotEnoughCashException();
    }
    
    public double getTotalCash(){
        return this.totalCash;
    }
}


class Screen {
    public Screen(){}
    public final void welcome () {System.out.println("Welcome!");}
    public final void displayMainMenu(){
    System.out.print("========================\n"
            + "ATM Menu:\n"
            + "1. Balance Inquiry \n"
            + "2. Withdraw Money \n"
            + "3. Deposit Funds \n"
            + "4. End Session \n"
            + "========================\n");
    }
    public final void displayWithdrawalOption(){
        System.out.println("========================\n"
            + "Withdrawl amount:\n"
            + "1. $20 \n"
            + "2. $40 \n"
            + "3. $60 \n"
            + "4. $100 \n"
            + "5. $200 \n"
            + "6. Cancel the transcation \n"
            + "========================\n");
    }
    public final void displayDepositeEnvelop(){System.out.println("Please insert a deposit envelope!");}
    public final void warning(){System.out.println("Not enough cash in the ATM!");}
    public final void reminder(){System.out.println("Do not forget to take the money!");}
    public final void thankYou(){System.out.println("Thank you and goodbye!");}
}

class KeyPad {
    //the method return valid account and password entered by a user
    public String[] userLogIn() {
        String userAccount;
        String userPassword;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nPlease enter 5-digit account:");
            userAccount = scanner.nextLine();
        } while (! userAccount.matches("[0-9]{5}"));
        
        do {
            System.out.println("\nPlease enter 5-digit PIN:");
            userPassword = scanner.nextLine();
        } while (!userPassword.matches("[0-9]{5}"));
        
        return new String[] {userAccount,userPassword}; 
    }
    
    public String userMenuOption(){
        String option;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nPlease enter your option:");
            option = scanner.nextLine();
        } while (!option.matches("[1-4]{1}"));
        return option;     
    }
}

    



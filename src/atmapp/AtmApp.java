/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmapp;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; 

/**
 *
 * @author changzhao
 */
public class AtmApp {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // creaat a scanner object
        Scanner scanner = new Scanner(System.in);
        // create a userDatabase
        Map <String, User> userDatabase = new HashMap<> ();
        
        User u1 = new User("12345","12345",30.0);
        User u2 = new User("12346","12346",400.0);
        User u3 = new User("12347","12347",500.0);
        User u4 = new User("12348","12348",600.0);
        User u5 = new User("12349","12349",2000.0);
      
        userDatabase.put("12345", u1);
        userDatabase.put("12346", u2);
        userDatabase.put("12347", u3);
        userDatabase.put("12348", u4);
        userDatabase.put("12349", u5);

        // create an atm
        Atm atm = new Atm();
        
        // local variables store user input
        String userAccount;
        String userPassword;
        int option;
        
        while (true){
            atm.displayWelcomeMessage();
            do {
                userAccount = atm.getUserAccount();
                if (!userDatabase.containsKey(userAccount)){
                    System.out.println("\nCan not find your account! Please re-enter:\n");
                }
            } while(!userDatabase.containsKey(userAccount)) ;
            
            do {
                userPassword = atm.getUserPassword();
                if (!userPassword.equals(userDatabase.get(userAccount).getPassword())){
                    System.out.println("\nWrong password! Please re-enter:\n");
                }
            } while(!userPassword.equals(userDatabase.get(userAccount).getPassword())) ;

            // after successful login, create a user object
            System.out.println("\nYou have successfully logged in:\n");
            Delay.delay(1000);
            User user = userDatabase.get(userAccount);
            
            while (true){
                atm.displayMainMenu(); // the main menu
                option = atm.getMenuOption();

                if (option == 4){
                    atm.displayThankYou();
                    Delay.delay(1500);
                    break;
                }
                
                else {
                    switch (option){
                        case 1:
                            BalanceInquiry balanceInquiry = new BalanceInquiry();
                            balanceInquiry.processTransaction(atm, user, 0);
                            Delay.delay(1500);
                            break;
                        case 2:
                            Withdraw withdraw = new Withdraw();
                            int withdrawlOption = atm.getWithdrawlOption();
                            if (withdrawlOption != 6) {
                                withdraw.processTransaction(atm, user, withdrawlOption); 
                                Delay.delay(1500);
                                break;
                            }
                            else {
                                Delay.delay(1500);
                                break;
                            }
                        case 3:
                            DepositFund depositfund = new DepositFund();
                            int depositAmount = atm.getDepositAmount();
                            Delay.delay(1000);
                            atm.displayDepositEnvelop();
                            Delay.delay(1500);
                            depositfund.processTransaction(atm, user, depositAmount);
                            Delay.delay(1500);
                            break;
                    }
                }
            }
            
            
            
        }
    }
    
}

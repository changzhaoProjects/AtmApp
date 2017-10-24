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
        
        User u1 = new User("12345","12345",300.0);
        User u2 = new User("12346","12346",400.0);
        User u3 = new User("12347","12347",500.0);
        User u4 = new User("12348","12348",600.0);
        User u5 = new User("12349","12349",700.0);
      
        userDatabase.put("12345", u1);
        userDatabase.put("12346", u2);
        userDatabase.put("12347", u3);
        userDatabase.put("12348", u4);
        userDatabase.put("12349", u5);

        // create an atm
        Atm atm = new Atm();
        
        // local variables store user input
        String account;
        String password;
        int option;
        
        while (true){
            atm.displayWelcomeMessage();
            do {
                account = atm.askUserLogIn()[0];               
                password = atm.askUserLogIn()[1];
            } while (!userDatabase.containsKey(account)||!password.equals(userDatabase.get(account).getPassword())); 
            
            // get user instance
            User user = userDatabase.get(account);
            
            while (true){
                atm.displayMainMenu();
                option = Integer.parseInt(atm.getMenuOption());

                if (option == 4){
                    atm.displayThankYou();
                    break;
                }
                
                else {
                    switch (option){
                        case 1:
                            BalanceInquiry balanceInquiry = new BalanceInquiry();
                            balanceInquiry.processTransaction(atm, user);
                            break;
                        case 2:
                            Withdraw withdraw = new Withdraw();
                            withdraw.processTransaction(atm, user); 
                            break;
                        case 3:
                            DepositFund depositfund = new DepositFund();
                            depositfund.processTransaction(atm, user);
                            break;
                    }
                }
            }
            
            
            
        }
    }
    
}

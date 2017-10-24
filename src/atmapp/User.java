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
public class User {
    private String account;
    private String password;
    private double balance;
    private User() {};
    public User(String account, String password, double balance) {
        this.account = account;
        this.password = password;
        this.balance = balance;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void deposit(Double deposit){
        this.balance += deposit;
    }
    
    public void withdraw (Double withdrawAmount) throws notEnoughAmountException {
        if (this.balance >= withdrawAmount) this.balance -= withdrawAmount;
        else throw new notEnoughBalanceException();
    }
}


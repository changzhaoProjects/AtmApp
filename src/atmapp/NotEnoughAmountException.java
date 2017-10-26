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
class NotEnoughCashException extends Exception{
    public NotEnoughCashException (String s){
        super(s);
    }
}
class NotEnoughBalanceException extends Exception{
    public NotEnoughBalanceException (String s){
        super(s);
    }
}

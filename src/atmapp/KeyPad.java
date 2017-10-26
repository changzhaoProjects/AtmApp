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
class KeyPad {
    //the method return a single string input entered by a user
    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
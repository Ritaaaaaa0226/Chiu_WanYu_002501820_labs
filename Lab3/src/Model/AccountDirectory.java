/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author wanyuchiu
 */
public class AccountDirectory {
    
    private ArrayList<Account> accounts;
    
    public AccountDirectory() {
        this.accounts = new ArrayList<Account>();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    
    public Account addAccount(){
        //instantiate the Vital Sign
        Account a = new Account();
        //put the newly created object to arraylist
        accounts.add(a);
        //return the vital sign
        return a;
    }
    
    public void deleteAccount(Account account){
        accounts.remove(account);
    }
    
    public Account searchAccount(String accountNumber){
        for(Account a : accounts){ //go through all account
            if(a.getAccountNumber().contains(accountNumber)){//contains string method match part of string,if full match use .equql
                return a;
            }
        }
        return null;//no match return null
    }
}

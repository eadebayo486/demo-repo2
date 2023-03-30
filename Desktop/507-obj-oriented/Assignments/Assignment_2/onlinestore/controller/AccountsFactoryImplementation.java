package controller;

import model.AccountsInterface;
import model.AccountsContainer;

public class AccountsFactoryImplementation implements AccountsFactoryInterface{
    private AccountsInterface acccounts;
    public AccountsInterface createAccountsContainer(){

        try {
            acccounts = new AccountsContainer();
        }catch(Exception e){
            System.out.println("Server err: " + e.getMessage());
 		    e.printStackTrace();
        }
        return  acccounts;
    }

}

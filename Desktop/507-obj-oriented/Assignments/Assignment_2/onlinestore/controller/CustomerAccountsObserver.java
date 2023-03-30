package controller;

import java.rmi.*;
import java.rmi.registry.*;
import model.AccountsInterface;

import controller.Observer;

public class CustomerAccountsObserver implements Observer{

    private AccountsInterface subj;
    public CustomerAccountsObserver(AccountsInterface subject){
        this.subj = subject;
    }

    public void update(){
        //send accounts
        try {
            String name = "//localhost:6363/OnlineStore";
		    Naming.rebind(name,this.subj);
            System.out.println("Customer  addded and ready\n");
        }catch(Exception e){
            System.out.println("Server err: " + e.getMessage());
 		    e.printStackTrace();
        }
    }
}

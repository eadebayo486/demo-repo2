package controller;

import java.rmi.*;
import java.rmi.registry.*;
import model.AccountsInterface;
import model.AccountsContainer;

import controller.Observer;

public class AdminAccountsObserver implements Observer{

    private AccountsInterface subj;
    
    public AdminAccountsObserver(AccountsInterface subject){
        this.subj = subject;
    }

    public void update(){
        //send accounts
        try {
            String name = "//localhost:6363/OnlineStore";
		    Naming.rebind(name,this.subj);
            System.out.println("Admin added and ready\n");
        }catch(Exception e){
            System.out.println("Server err: " + e.getMessage());
 		    e.printStackTrace();
        }
    }
}

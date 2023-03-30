// package serverview;

import java.rmi.*;
import java.rmi.registry.*;

import model.Account;
import model.AdminAccount;

import model.AccountsInterface;
import model.AccountsContainer;

import model.ProductInterface;
import model.Product;

import model.ProductsInterface;
import model.ProductsContainer;

import controller.Observer;
import controller.AdminAccountsObserver;

import controller.AccountsFactoryInterface;
import controller.AccountsFactoryImplementation;

public class StoreServer {
    static AccountsFactoryInterface factory = new AccountsFactoryImplementation();
    static AccountsInterface accs;
    static ProductsInterface prds;
    public static void main(String args[]){
        
        try {
        Account admin = new AdminAccount();
        admin.setName("Troutman");
        admin.setType("admin");
        admin.setAddress("902 street");
        
        accs = factory.createAccountsContainer();

        Observer ob = new AdminAccountsObserver(accs);
        //obsever added
        accs.addObserver(ob);

        //add admin. 
       System.out.println("about to add user and send accounts");
	//with observer method (update) ---- the acccounts is sent to registry
        accs.addUser(admin);

        // prds = new Products();

        } catch(Exception e) {
			System.out.println("Server err: " + e.getMessage());
 		    e.printStackTrace();
		}




    }

}

package model;

 import java.io.*;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import java.util.ArrayList;

import model.Account;
import model.AdminAccount;

import controller.Observer;
import controller.AdminAccountsObserver;

public class AccountsContainer extends UnicastRemoteObject implements AccountsInterface, java.io.Serializable{
    private ArrayList<Account> adminAccount =  new ArrayList<Account>();

    private ArrayList<Observer> obsevers =  new ArrayList<Observer>();

    private Account admin;

    public AccountsContainer()throws RemoteException{
        super();
    }
    
    public void addUser(Account admin) {
        
        try {
        adminAccount.add(admin);
        System.out.println(admin.getName()+ " has been added as admin\n");

        //if accounts changes, send account to rmi registry
        this.notifyObservers();

        } catch(Exception e) {
			System.out.println("Server err: " + e.getMessage());
 		    e.printStackTrace();
		}
    }

    public void addObserver(Observer obs){
        obsevers.add(obs);
	System.out.println("Added observer");
    }
    public void notifyObservers(){
         for (Observer obs : obsevers){
            obs.update();
	    System.out.println("observer notified");
        }
    }
    
    public boolean ifAdminExist(String name){
	    System.out.println("name to look for " + name);
	    System.out.println("Checking for admin");
        try {
         for (Account adm : adminAccount){
		 System.out.println("loop:  "+adm.getName());
		 name.compareTo(adm.getName());
		 if(name.compareTo(adm.getName()) == 0){
		 	admin = adm;
                this.notifyObservers();
                System.out.println("got admin");
                return true;
		 }
            if(adm.getName() == name) {

		    System.out.println("match found");
		    System.out.println("found admin: "+adm.getName());

                admin = (AdminAccount)adm;
		this.notifyObservers();
		System.out.println("got admin");
                return true;
                
            }

        }
        } catch(Exception e){
            System.out.println("Server err: " + e.getMessage());
 		    e.printStackTrace();
        }
        return false;
    }

    public Account getAdmin(){
        return admin;
    }
}

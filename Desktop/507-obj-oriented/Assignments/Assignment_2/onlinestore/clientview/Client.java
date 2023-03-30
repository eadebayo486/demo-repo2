// package clientview;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

import java.rmi.*;
import java.rmi.registry.*;

import model.Account;
import model.AdminAccount;

import model.AccountsInterface;
import model.AccountsContainer;

import model.ProductsInterface;
import model.ProductsContainer;


import model.ProductInterface;
import model.Product;

import model.Cart;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String args[]) {
        Scanner readObj = new Scanner(System.in);
        System.out.println("welcome----");
        try{
		

            String name = "//in-csci-rrpc01.cs.iupui.edu:6363/OnlineStore";

            AccountsInterface stub = (AccountsInterface)Naming.lookup(name);
	    System.out.println("Attempting to get stub");
            if(stub.ifAdminExist("Troutman") == true){
                Account admin = stub.getAdmin();
                System.out.println("welcome: " + admin.getName());
            } else {
		    System.out.println("Stub does not exist");
	    }
        }catch(Exception e){
            System.out.println("Server err: " + e.getMessage());
 		    e.printStackTrace();
        }


    }
 

    
}



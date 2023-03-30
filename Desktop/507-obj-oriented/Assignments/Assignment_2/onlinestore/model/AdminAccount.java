package model;

import java.io.*;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;



public class AdminAccount extends UnicastRemoteObject implements Account, java.io.Serializable{

    private String name;
    private String addr;
    private String type;

    public AdminAccount()throws RemoteException{
		super();
        
	}

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return addr;
    }


    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String addr) {
        this.addr = addr;
    }

    

}
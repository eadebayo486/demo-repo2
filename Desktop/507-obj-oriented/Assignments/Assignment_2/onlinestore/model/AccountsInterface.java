package model;
import java.rmi.*;
import java.util.ArrayList;
import model.Account;
import model.AdminAccount;

import controller.Observer;

public interface AccountsInterface extends Remote {

    public void addUser(Account admin) throws RemoteException;


    public void addObserver(Observer obs) throws RemoteException;


    public boolean ifAdminExist(String name) throws RemoteException;


    public Account getAdmin() throws RemoteException;


}

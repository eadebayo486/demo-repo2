package model;
import java.rmi.*;


public interface Account extends Remote {

    public String getType() throws RemoteException;

    public String getName() throws RemoteException;

    public String getAddress() throws RemoteException;


    public void setType(String type) throws RemoteException;

    public void setName(String name) throws RemoteException;

    public void setAddress(String addr) throws RemoteException;

}
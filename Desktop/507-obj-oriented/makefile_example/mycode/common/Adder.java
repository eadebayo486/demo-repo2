package mycode.common;

import java.rmi.*;

public interface Adder extends Remote{
    
	public double add(double x,double y) throws RemoteException;
    
}

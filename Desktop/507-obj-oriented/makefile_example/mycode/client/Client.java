package mycode.client;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

import mycode.common.Adder;

public class Client{

	public static void main(String args[])	{
		try {
            Scanner readObj = new Scanner(System.in);

            String name = "//in-csci-rrpc01.cs.iupui.edu:7474/RemoteAdder";
            Adder stub = (Adder)Naming.lookup(name);

            System.out.println("Found server object, enter two numbers...");
            double n1, n2;
            n1 = readObj.nextDouble();
            n2 = readObj.nextDouble();

			System.out.println("Client calling server with "+n1+" and "+n2);

			System.out.println("Got response back from server : "+stub.add(n1,n2));

		} catch(Exception e) {
			System.out.println("Client err : " + e.getMessage());
           	e.printStackTrace();
		}
	}

}

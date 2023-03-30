package mycode.server;

import java.rmi.*;
import java.rmi.registry.*;

import mycode.common.Adder;

public class Server{

	public static void main(String args[]) {
		try {

			Adder remote_obj = new AdderRemote();

            String name = "//localhost:7474/RemoteAdder";
			Naming.rebind(name,remote_obj);

			System.out.println("Server is ready");

		} catch(Exception e) {
			System.out.println("Server err: " + e.getMessage());
 		    e.printStackTrace();
		}
	}

}

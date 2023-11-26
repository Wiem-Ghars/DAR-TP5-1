package rmiClient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import rmiService.Iconversion;

public class ConversionClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iconversion stub;
			try {
				stub= (Iconversion) Naming.lookup("rmi://localhost:1099/ConversionObject");
				 //Naming.lookup return an instance of Remote
				System.out.println(stub.convertirMontant(75.0));
				
				System.out.println(stub.convertirMontant(800.00));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}



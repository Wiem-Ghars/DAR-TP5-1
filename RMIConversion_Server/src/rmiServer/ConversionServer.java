package rmiServer;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import rmiService.ConversionImpl;

public class ConversionServer {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		try {
			// Création d'un registre RMI sur le port 1099
			LocateRegistry.createRegistry(1099);
			// Création d'une instance de l'implémentation du service de conversion
			ConversionImpl od=new ConversionImpl();
			System.out.println(od.toString());
			// Liaison de l'objet ConversionImpl au registre RMI avec le nom "ConversionObject"
			Naming.rebind("rmi://localhost:1099/ConversionObject", od);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}



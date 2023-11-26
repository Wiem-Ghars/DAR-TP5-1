/**
 * 
 */
package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ConversionImpl extends UnicastRemoteObject implements Iconversion {


	private static final long serialVersionUID = 1L;

	public ConversionImpl() throws RemoteException {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double convertirMontant(double mt) throws RemoteException {
		// TODO Auto-generated method stub
		return mt*3.3;
	}

}



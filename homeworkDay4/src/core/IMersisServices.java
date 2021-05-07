package core;

import java.rmi.RemoteException;

import entities.concretes.User;

public interface IMersisServices {
	
	boolean validate(User user) throws RemoteException;
	
	
	
	
	
	

}

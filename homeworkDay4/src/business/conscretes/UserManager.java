package business.conscretes;

import java.rmi.RemoteException;

import business.abstracts.IUserService;
import core.IMersisServices;
import entities.concretes.User;

public class UserManager implements IUserService{

	private IMersisServices IMersisServices;
	
	public UserManager(core.IMersisServices iMersisServices) {
		super();
		IMersisServices = iMersisServices;
	}


	@Override
	public void add(User user) throws Exception {
		if(IMersisServices.validate(user)) {
			System.out.println("B�yle bir ki�i mevcuttur.Sisteme kullan�c� eklendi : "+user.getFirstName()+user.getLastName());
		}else {
			 throw new Exception("B�yle bir ki�i bulunmamaktad�r");
			
		
		}
		
	}
	

	@Override
	public void delete(User user) {
	    System.out.println("Kullan�c� sistemden silindi : "+user.getFirstName() + user.getLastName());		
		
	}

	@Override
	public void update(User user) {
	    System.out.println("Kullan�c� sistemde g�ncellendi : "+user.getFirstName() + user.getLastName());		
		
	}

}

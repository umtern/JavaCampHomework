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
			System.out.println("Böyle bir kiþi mevcuttur.Sisteme kullanýcý eklendi : "+user.getFirstName()+user.getLastName());
		}else {
			 throw new Exception("Böyle bir kiþi bulunmamaktadýr");
			
		
		}
		
	}
	

	@Override
	public void delete(User user) {
	    System.out.println("Kullanýcý sistemden silindi : "+user.getFirstName() + user.getLastName());		
		
	}

	@Override
	public void update(User user) {
	    System.out.println("Kullanýcý sistemde güncellendi : "+user.getFirstName() + user.getLastName());		
		
	}

}
